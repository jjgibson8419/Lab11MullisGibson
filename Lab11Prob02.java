import java.io.*;
import java.util.*;
import java.util.ArrayList;

/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Author: Hugh Mullis and Joseph Gibson
 * Created on: 11/22/2024
 * Description: Satisfies the requirements for Lab 11 Problem 1
 */
public class Lab11Prob02 {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        try (DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"))) {

            while (true) {
                int age = input.readInt();
                String name = input.readUTF();
                String address = input.readUTF();
                int zip = input.readInt();
                double salary = input.readDouble();

                people.add(new Person(age, name, address, zip, salary));
            }

        } catch (EOFException e) {

    } catch (IOException e) {
            e.printStackTrace();

        }

        java.util.Collections.sort(people);

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-salary-sorted.dat"))) {
            for (Person person : people) {
                System.out.print(person);
                output.writeUTF(person.toString());
            }

        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
