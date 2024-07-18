package lk.ijse.gdse68.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.ijse.gdse68.dto.Person;

public class Deserialization {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"id\":\"A001\",\"name\":\"Kamal\",\"age\":25}";

        try {

            Person person = objectMapper.readValue(json, Person.class);
            System.out.println(person.getName());
            System.out.println(person.getAge());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}