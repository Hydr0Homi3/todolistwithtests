import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private TaskList taskList;
    private Scanner scanner;

    public Menu() {
        taskList = new TaskList();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("To-Do List Menu.");
            System.out.println("Please choose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Show all tasks");
            System.out.println("4. Delete all tasks");
            System.out.println("5. Exit");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the task:");
                        String task = scanner.nextLine();
                        taskList.addTask(task);
                        System.out.println("Task added successfully.");
                        break;
                    case 2:
                            taskList.showAllTasks();
                            System.out.println("Enter the task number to delete:");
                            int index = scanner.nextInt() - 1;
                            taskList.deleteTask(index);
                            System.out.println("Task deleted successfully.");

                        break;
                    case 3:
                            taskList.showAllTasks();
                            System.out.println("All tasks shown successfully.");

                        break;
                    case 4:
                        taskList.deleteAllTasks();
                        System.out.println("All tasks deleted successfully.");
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear the buffer
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid task number. Please enter a valid task number.");
                scanner.nextLine(); // clear the buffer
            }
        }
    }
}
