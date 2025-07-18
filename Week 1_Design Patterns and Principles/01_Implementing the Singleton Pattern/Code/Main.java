public class Main {
    //both program are in same file so no need to use the import 
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        // Log messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        // Verify both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
