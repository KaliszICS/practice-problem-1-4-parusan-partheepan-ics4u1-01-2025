import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		
        // Test the methods
        System.out.println(getName(2, "students.txt")); // Eric Lan
        System.out.println(getAge(1, "students.txt"));  // 17
        System.out.println(getNumber(3, "students.txt")); // 123654789
    }
    
    // Get name from line
    public static String getName(int line, String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            int count = 1;
            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (count == line) {
                    String[] parts = data.split(" ");
                    return parts[0] + " " + parts[1];
                }
                count++;
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }
    
    // Get age from line
    public static int getAge(int line, String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            int count = 1;
            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (count == line) {
                    String[] parts = data.split(" ");
                    return Integer.parseInt(parts[2]);
                }
                count++;
            }
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }
    
    // Get student number from line
    public static int getNumber(int line, String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            int count = 1;
            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (count == line) {
                    String[] parts = data.split(" ");
                    return Integer.parseInt(parts[3]);
                }
                count++;
            }
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }
    
    // Append to file
    public static void fileAppend(String output, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
	
