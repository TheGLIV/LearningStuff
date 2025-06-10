import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    
    private static void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
    }
    
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list!");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    
    private static void deleteTask() {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to delete: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                tasks.remove(taskNumber - 1);
                System.out.println("Task deleted!");
            } else {
                System.out.println("Invalid task number!");
            }
        }
    }
}