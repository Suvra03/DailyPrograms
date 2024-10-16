//Java program to display how to print "Hello, World!" without using the print statement.

//Approach 1: Using System.out.write() method, which writes bytes to the output stream.
public class TrickyProg4{
    public static void main(String[] args){
        //Converts the string "Hello, World!" to a byte array
        String message = "Hello, World!";
        try {
            System.out.write(message.getBytes());
            System.out.write(System.lineSeparator().getBytes()); //To add a new line after the message
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

Explaination:
  message.getBytes(): Converts the string "Hello, World!" into a byte array.
  System.out.write(): Writes the byte array to the output stream, which is the console in this case.
  System.lineSeparator(): Adds a new line after the message to ensure proper formatting.


//Approach 2: Using a FileWriter to Write to a File, without Console Output
import java.io.FileWriter;
import java.io.IOException;

public class TrickyProg4{
    public static void main(String[] args) {
        String message = "Hello, World!";
        try {
            //Create a FileWriter object to write to a file named "Output.txt"
            FileWriter writer = new FileWriter("Output.txt");
            writer.write(message);
            writer.close();   //Close the writer to save the output
            System.out.println("The message 'Hello, World!' is written to a file named output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Explaination:
  FileWriter writer = new FileWriter("output.txt"): This creates a file named output.txt in the working directory and prepares to write to it.
  writer.write(message): Writes the message "Hello, World!" to the file.
  writer.close(): Closes the file and ensures that the data is saved.
