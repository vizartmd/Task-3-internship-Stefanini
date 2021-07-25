package com.stefanini.enhancedtaskmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public void addUser(User user) throws IOException, ClassNotFoundException {
        File file = new File("users.txt");
        if (file.length() == 0) {
            List<User> users = new ArrayList<>();
            try{
                FileOutputStream fout=new FileOutputStream("users.txt");
                ObjectOutputStream out=new ObjectOutputStream(fout);
                users.add(user);
                System.out.println("a user was added to empty list");
                out.writeObject(users);
                fout.close();
                out.close();
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            List<User> users = showAllUsers();
            boolean userExists = false;
            for (int i = 0; i < users.size(); i++) {
                if (user.getUserName().equals(users.get(i).getUserName())) {
                    userExists = true;
                }
            }
            if (!userExists) {
                try{
                    FileOutputStream fout=new FileOutputStream("users.txt");
                    ObjectOutputStream out=new ObjectOutputStream(fout);
                    users.add(user);
                    System.out.println("a user was added to not empty list");
                    out.writeObject(users);
                    fout.close();
                    out.close();
                } catch (Exception e){
                    System.out.println(e);
                }
            } else {
                System.out.println("Such a user already exists! Enter another username!");
            }
        }
    }

    public List<User> showAllUsers() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.txt"));
        List<User> list = (ArrayList<User>) ois.readObject();
        return list;
    }

    public void addTask(String userName, String taskTitle, String taskDeskription) {
    }
}