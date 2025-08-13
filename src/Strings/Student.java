import java.util.Scanner;

class Student {
    private String username;
    private String password;

    // Constructor to set username and password
    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to authenticate student
    public boolean authenticate(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

 class StudentLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hardcoded student credentials
        Student student = new Student("harshal123", "pass123");

        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();

        // Authentication check
        if (student.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Login successful. Valid Student!");
        } else {
            System.out.println("Invalid username or password.");
        }

        sc.close();
    }
}

