package lk.ijse.gdse68.controller;

import lk.ijse.gdse68.dto.Person;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {
        Person person = new Person("A001","John", 30); // Example Person object

        try {

            byte[] byteArray = serializeObject(person);

            System.out.println("Serialized Byte Array length: " + byteArray.length);
            System.out.println("Serialized Byte Array content: " + new String(byteArray)); // This will not convert bytes correctly to String

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] serializeObject(Person person) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        byte[] byteArray = byteArrayOutputStream.toByteArray();

        byteArrayOutputStream.close();

        return byteArray;
    }
}
