class Node {
    Task task;
    Node next;
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
public class TaskManager {
    private Node head;
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }
    public void searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                System.out.println("Found Task: " + temp.task.taskName + " [" + temp.task.status + "]");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }
    public void traverseTasks() {
        Node temp = head;
        System.out.println("Task List:");
        while (temp != null) {
            System.out.println("ID: " + temp.task.taskId + ", Name: " + temp.task.taskName + ", Status: " + temp.task.status);
            temp = temp.next;
        }
    }
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.task.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        }
    }
}
