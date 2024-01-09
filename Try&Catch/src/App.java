import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        int numberOfAttempts = 3;

        while (numberOfAttempts > 0) {
            System.out.println("Enter your username: ");
            String inputUsername = scan.nextLine();

            System.out.println("Enter your password: ");
            String inputPassword = scan.nextLine();

            try {

                if (!inputUsername.equals(validUsername) && !inputPassword.equals(validPassword)) {
                    throw new Exception("Try again");
                }
                System.out.println("Signed in successfully");

            } catch (Exception e) {
                System.out.println("Invalid credentials");
                numberOfAttempts--;
                if (numberOfAttempts == 0) {
                    System.out.println("No attempts left");
                }

            }
        }
        scan.close();

    }
}
