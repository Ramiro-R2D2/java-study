
import Models.TaskList;

public class TaskListExample {
    public static void main(String[] args) throws Exception {
        TaskList list = TaskList.getTaskList();
        list.AddTask("Make a cookies", "Cookies");
        list.AddTask("Make a Chocolate cake", "Chocolate cake");
        list.AddTask("Going to the gym", "gym");
        list.AddTask("Read a book", "Books");
        list.printTasks();
        list.FinishTask("Book");
        list.printTasks();
        list.FinishTask("Books");
        list.printTasks();
        list.RemoveTask("gym");
        list.printTasks();
    }
}
