import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteAppendExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\User\\OneDrive\\Desktop\\New folder\\java";

        // Write to the file
        writeToFile(filePath, "Hello, this is a test message.");

        // Read from the file
        String content = readFromFile(filePath);
        System.out.println("Content read from the file: " + content);

        // Append to the file
        appendToFile(filePath, "\nThis is an appended message.");

        // Read the updated content from the file
        content = readFromFile(filePath);
        System.out.println("Updated content after append: " + content);
    }

    // Method to write content to a file
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Method to append content to a file
    private static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
