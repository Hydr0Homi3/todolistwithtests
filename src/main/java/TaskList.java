import java.util.ArrayList;
import java.util.Objects;

public class TaskList {
    private ArrayList<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public void deleteAllTasks() {
        tasks.clear();
    }

    public void showAllTasks() {
        if (tasks.size() == 0) {
            System.out.println("There are no tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}