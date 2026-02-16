package builder;

public class User {
    // 1. Immutable fields (Final)
    // Once created, a User object cannot be changed. This is Thread-Safe by design.
    private final String firstName; // Required
    private final String lastName;  // Required
    private final int age;          // Optional
    private final String phone;     // Optional
    private final String address;   // Optional

    // 2. Private Constructor
    // Only the Builder can call this. The outside world cannot say "new User(...)".
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters only (No Setters!)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + " (Age: " + age + ", Phone: " + phone + ")";
    }

    // 3. Static Inner Class: The Builder
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        // 4. Constructor for Required Fields
        // This forces the user to provide firstName and lastName at minimum.
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // 5. Methods for Optional Fields
        // Notice the return type is 'UserBuilder'. This enables Method Chaining.
        public UserBuilder age(int age) {
            this.age = age;
            return this; // Returns the builder itself so we can call .phone() next
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // 6. The Final Build Method
        // This seals the deal and creates the actual User object.
        public User build() {
            // Optional: You can add validation logic here before creating the object
            if (this.age < 0) {
                throw new IllegalStateException("Age cannot be negative");
            }
            return new User(this);
        }
    }
}