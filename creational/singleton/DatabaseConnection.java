package creational.singleton;

public class DatabaseConnection {
    // 1. VOLATILE is critical here.
    // It prevents "Instruction Reordering" so threads don't see a half-baked object.
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connecting to Database...");
    }

    public static DatabaseConnection getInstance() {
        // Check 1: Performance
        // If it's already created, we skip the slow synchronized block entirely.
        if (instance == null) {

            // The Lock
            synchronized (DatabaseConnection.class) {

                // Check 2: Safety
                // We check again in case Thread B created it while Thread A was waiting outside the lock.
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
