package task.magement;

public class Main {
    public static void main(String[] args) {
        TaskManagement management = new TaskManagement();

        management.addTask("Buy groceries", 3);
        management.addTask("Study for exam", 5);
        management.addTask("Call the doctor", 1);

        System.out.println("Tasks before completing:");
        management.showTasksByPriority();

        // Mark a task as completed
        management.completeTask(1); // Marks "Study for exam" as completed

        // Remove completed tasks
        management.removeCompletedTasks();

        System.out.println("Tasks after removing completed ones:");
        management.showTasksByPriority();
    }
}
