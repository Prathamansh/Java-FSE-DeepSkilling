public class Main {
    public static void main(String[] args) {
        Student model = new Student("Prathamansh", "101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Update student info
        controller.setStudentName("Prathamansh Jasrotia");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}