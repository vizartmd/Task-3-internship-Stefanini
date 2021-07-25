package com.stefanini.enhancedtaskmanager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    UserService userService = new UserService();
    public void addTask(String userName, String taskTitle, String taskDescription) throws IOException, ClassNotFoundException {
        List<User> users = userService.showAllUsers();
        List<Task> tasks = null;
        if (users != null) {
            for (User user : users) {
                if (userName.equals(user.getUserName())) {
                    if (user.getTask() == null) {
                        tasks = new ArrayList();
                        tasks.add(new Task(userName,taskTitle, taskDescription));
                        user.setTask(tasks);
                    } else {
                        tasks = user.getTask();
                        tasks.add(new Task(userName,taskTitle, taskDescription));
                        user.setTask(tasks);
                    }
                }
            }
            try{
                FileOutputStream fout=new FileOutputStream("users.txt");
                ObjectOutputStream out=new ObjectOutputStream(fout);
                System.out.println("a task was added to user " + userName);
                out.writeObject(users);
                fout.close();
                out.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public void showTasks(String userName) throws IOException, ClassNotFoundException {
        List<User> users = userService.showAllUsers();
        List<Task> tasks = null;
        if (users != null) {
            for (User user : users) {
                if (userName.equals(user.getUserName())) {
                    if (user.getTask() == null) {
                        System.out.println("User " + userName + " has not any tasks!");
                    } else {
                        tasks = user.getTask();
                        System.out.println("Tasks of " + userName);
                        for (Task task : tasks) {
                            System.out.println(task);
                        }
                    }
                }
            }
        }
    }
}
