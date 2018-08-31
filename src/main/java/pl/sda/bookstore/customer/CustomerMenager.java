package pl.sda.bookstore.customer;

import java.util.Scanner;

public class CustomerMenager {

    public static Customer createCustomer(Scanner sc) {
        System.out.println("Wybierz:");
        System.out.println("1. Użytkownik prywatny");
        System.out.println("2. Firma");

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {

            System.out.println("Proszę podaj imię");
            String name = sc.nextLine();

            System.out.println("Proszę podaj nazwisko");
            String surname = sc.nextLine();

            System.out.println("Proszę podaj adres");
            String address = sc.nextLine();

            return new User(name, surname, address);

        } else if (option == 2) {

            System.out.println("Proszę podaj nazwę firmy");
            String companyName = sc.nextLine();

            System.out.println("Proszę podaj adres firmy");
            String companyAddress = sc.nextLine();

            System.out.println("Proszę podaj NIP firmy");
            String taxCode = sc.nextLine();

            return new Company(companyName, companyAddress, taxCode);

        } else {

            System.out.println("Podaj 1 lub 2!");

            return null;
        }
    }
}
