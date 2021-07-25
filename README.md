# Task-3 internship-Stefanini (write in/read from file)
# Added one more logical functionality - task assigned to a group of users

# command model for testing the program from the command line

# Create new users - by running this command:
java -jar myaplication.jar createUser Scutaru Alexandru alex group1
#
java -jar myaplication.jar createUser Apostol Maria mary group1
#
java -jar myaplication.jar createUser Racu Valentin vali group1
#
java -jar myaplication.jar createUser Jhonson Tom tom group2
#
java -jar myaplication.jar createUser Smith David david group2
#
java -jar myaplication.jar createUser Gagarin Yuri yura group2
#

# Show All Users - by running this command:
java -jar myaplication.jar showAllUsers
#

# Add a task to the user - by running this command:
java -jar myaplication.jar addTask alex 'task1 title for alex' 'task1 description for alex'
#
java -jar myaplication.jar addTask alex 'task2 title for alex' 'task2 description for alex'
#
java -jar myaplication.jar addTask mary 'task1 title for mary' 'task1 description for mary'
#
java -jar myaplication.jar addTask mary 'task2 title for mary' 'task2 description for mary'
#
java -jar myaplication.jar addTask vali 'task1 title for vali' 'task1 description for vali'
#
java -jar myaplication.jar addTask vali 'task2 title for vali' 'task2 description for vali'
#
java -jar myaplication.jar addTask tom 'task title for tom' 'task description for tom'
#
java -jar myaplication.jar addTask tom 'task2 title for tom' 'task2 description for tom'
#
java -jar myaplication.jar addTask david 'task title for david' 'task description for david'
#
java -jar myaplication.jar addTask yura 'task title for yura' 'task description for yura'

# Show tasks after userName - by running this command:
java -jar myaplication.jar showTasks alex
#
java -jar myaplication.jar showTasks mary
#
java -jar myaplication.jar showTasks vali
#
java -jar myaplication.jar showTasks tom
#
java -jar myaplication.jar showTasks david
#
java -jar myaplication.jar showTasks yura

# Add a task to the group of users after groupId - by running this command:
java -jar myaplication.jar addTaskToGroup group1 'task1 title for group1' 'task1 description for group1'
#
java -jar myaplication.jar addTaskToGroup group1 'task2 title for group1' 'task2 description for group1'
#
java -jar myaplication.jar addTaskToGroup group2 'task1 title for group2' 'task1 description for group2'
#
java -jar myaplication.jar addTaskToGroup group2 'task2 title for group2' 'task2 description for group2'

# Show tasks after groupId - by running this command:
java -jar myaplication.jar showTasksByGroup group1
#
java -jar myaplication.jar showTasksByGroup group2

