package task.magement;

import java.util.ArrayList;

public class TaskManagement {
    private final ArrayList<Task> taskList;

    // Constructor
    public TaskManagement() {
        taskList = new ArrayList<>();
    }

    // Method to add a new task
    public void addTask(String description, int priority) {
        Task newTask = new Task(description, priority);
        taskList.add(newTask);
    }

    // Method to mark a task as completed
    public void completeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setCompleted(true);
        } else {
            System.out.println("Index out of range.");
        }
    }

    // Method to remove completed tasks
    public void removeCompletedTasks() {
        taskList.removeIf(Task::isCompleted);
    }

    // Method to display tasks by priority
    public void showTasksByPriority() {
        taskList.stream()
                .sorted((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()))
                .forEach(System.out::println);
    }
}
