import java.util.*;
import java.io.*;

public class FileProcessor {
    public static void openFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + path);
        }
        System.out.println("File opened successfully: " + path);
    }
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        } finally {
            System.out.println("Division attempt completed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();
        System.out.println("Result: " + divide(a, b));
        try {
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("myfile.txt created successfully.");
            } else {
                System.out.println("myfile.txt already exists.");
            }
            openFile("myfile.txt");
            openFile("non_existent.txt");
            
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closed.");
        }
    }
}