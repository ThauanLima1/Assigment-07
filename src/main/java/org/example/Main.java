package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();
        Person person1 = factory.createPerson("Thauan", 40);
        Person person2 = factory.createPerson("Sponge", 25);
        Person person3 = factory.createPerson("Bob", 30);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}