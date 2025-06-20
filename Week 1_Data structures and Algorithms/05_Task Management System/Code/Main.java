public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Implement Backend", "In Progress"));
        tm.addTask(new Task(3, "Test Application", "Not Started"));
        tm.traverseTasks();
        tm.searchTask(2);
        tm.deleteTask(2);
        tm.traverseTasks();
    }
}