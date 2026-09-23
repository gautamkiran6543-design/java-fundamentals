
import java.io.FileWriter;
import java.io.IOException;

    public class WriteFile {
        public static void main(String[] args) {

            try {
                FileWriter writer = new FileWriter("student.txt");

                writer.write("Name: Kiran\n");
                writer.write("Age: 21\n");
                writer.write("Course: BIT");

                writer.close();

                System.out.println("Data written successfully.");

            } catch (IOException e) {
                System.out.println("Error occurred.");
            }
        }
    }

