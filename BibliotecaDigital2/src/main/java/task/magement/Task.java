package task.magement;

public class Task {
    private String description;
    private int priority;
    private boolean completed;

    // Constructor
    public Task(String description, int priority) {
        this.description = description;
        setPriority(priority);  // Verify the priority here
        this.completed = false;  // By default, the task is not completed
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Priority must be between 1 and 5");
        }
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }
}
