package JavaOOPs;

interface Logger {
    default void logInfo() {
        System.out.println("INFO: Operation completed successfully.");
    }

    static void logError() {
        System.out.println("ERROR: An unexpected error occurred.");
    }
}

class AppLogger implements Logger {
    @Override
    public void logInfo() {
        System.out.println("INFO: Logging from AppLogger.");
    }
}

public class Task10_DefaultAndStatic {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();

        logger.logInfo();   //default method calling     
        Logger.logError();  //static method calling    
    }
}

