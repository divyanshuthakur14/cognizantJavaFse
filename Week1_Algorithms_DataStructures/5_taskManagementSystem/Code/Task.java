public class Task {
    public int taskId;
    public String taskName;
    public String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + taskId + "] " + taskName + " - " + status;
    }
}
