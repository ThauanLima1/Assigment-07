package org.example;

public class PersonFactory {
    private int nextId;

    public Person createPerson(String name, int age) {
        Person person = new Person(nextId, name, age);
        nextId++;
        return person;
    }

}
