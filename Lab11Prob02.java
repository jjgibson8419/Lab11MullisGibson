import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Author: Hugh Mullis and Joseph Gibson
 * Created on: 11/22/2024
 * Description: Satisfies the requirements for Lab 11 Problem 1
 */
public class Lab11Prob02 {

    public static void main(String[] args) {

        // Create an input stream and output stream
        try (DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
             DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"));) {
            // read date from file
            while (true) {
                int age = input.readInt();
                String name = input.readUTF();
                String address = input.readUTF();
                int zip = input.readInt();
                double salary = input.readDouble();

                // Print data to console and to output
                System.out.printf("%d %s %s %d %.2f%n", age, name, address, zip, salary);
                output.writeInt(age);
                output.writeUTF(name);
                output.writeUTF(address);
                output.writeInt(zip);
                output.writeDouble(salary);

            }
        } catch (IOException ex) {

        }

    }
}
