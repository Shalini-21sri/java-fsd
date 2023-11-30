import java.util.Arrays;
import java.util.Scanner;

public class EmailSearchProgram {

    public static void main(String[] args) {
        String[] emailIds = {"john@example.com", "jane@example.com", "bob@example.com", "alice@example.com"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        
        boolean found = searchEmail(emailIds, searchEmail);

        
        if (found) {
            System.out.println("Email ID found in the array.");
        } else {
            System.out.println("Email ID not found in the array.");
        }

        scanner.close();
    }

   
    private static boolean searchEmail(String[] emailIds, String searchEmail) {
        for (String email : emailIds) {
            if (email.equals(searchEmail)) {
                return true;
            }
        }
        return false; 
    }
}
