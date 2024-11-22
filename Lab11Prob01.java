import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File: Lab11Prob01.java Class: CSCI 1302 Author: Hugh Mullis and Joseph Gibson
 * Created on: 11/22/2024 Description:
 */
public class Lab11Prob01 {

	public static void main(String[] args) {

		try ( DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
				DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"));
			) {
			while (true) {
    int id = input.readInt();
    String firstName = input.readUTF();
    String lastName = input.readUTF();
    int age = input.readInt();
    double salary = input.readDouble();

    System.out.println(id + " " + firstName + " " + lastName + " " + age + " " + salary);

    output.writeInt(id);
    output.writeUTF(firstName);
    output.writeUTF(lastName);
    output.writeInt(age);
    output.writeDouble(salary);
}


			}
		} catch (IOException ex) {

		}

	}
}
