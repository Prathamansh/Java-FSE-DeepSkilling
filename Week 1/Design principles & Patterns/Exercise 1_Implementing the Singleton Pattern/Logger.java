public class Logger {

    private static Logger instance;
    private Logger() {
        System.out.println("Logger Initialized.");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    //sample method for logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
