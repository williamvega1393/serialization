package com.company;

import com.company.controllers.PersonController;
import com.company.models.Person;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        person.setFirstname(scanner.nextLine());
        System.out.print("Digite su apellido: ");
        person.setLastname(scanner.nextLine());
        System.out.print("Digite su teléfono: ");
        person.setPhone(scanner.nextLine());


        PersonController personCotroller = new PersonController();
        try {
            person = personCotroller.read();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }
}
