package Models;

import java.util.ArrayList;
import java.util.List;

public enum TaskList {
    INSTANCE;
    
    private final List<Task> Tasks = new ArrayList<>();
    
    public static TaskList getTaskList(){return INSTANCE;}

    public void printTasks(){
        System.out.println("Tasks unchecked");
        for (Task task : Tasks) {
            int i = 0;
            System.out.println((i + 1) + "-->" + task.getTitle());
            i++;
        }
    }
    public void AddTask(String Description, String Title){
        Tasks.add(new Task(Description, Title));
    }
    public String FinishTask(String Title){
        int i = 0;
        for (Task task : Tasks) {
            if (task.getTitle().equals(Title)) {
                Tasks.remove(i);
                return "Task" + task.getTitle() + " completed";
            }
            i++;
        }
        return "Task not found";
    }
    public String RemoveTask(String Title){
        int i = 0;
        for (Task task : Tasks) {
            if (task.getTitle().equals(Title)) {
                Tasks.remove(i);
                return "Task " + task.getTitle() + " removed";
            }
            i++;
        }
        return "Task not found";
    }
}