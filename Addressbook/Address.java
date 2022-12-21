package com.blz.Addressbook;
import java.util.ArrayList;
import java.util.Scanner;


public class Address  {
    public Address(String fullname, String address, String city, String state, String zip, String phone) {
    }

    public static <AddressBook> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean switcher = true;
        do {
            System.out.println("\n\tAddress Book Menu");
            System.out.println("\n\t\tEnter A to (A)dd Person ");
            System.out.println("\t\tEnter D to (D)elete Person");
            System.out.println("\t\tEnter M to (M)odify Person");
            System.out.println("\t\tEnter S to (S)earch Address Book ");
            System.out.println("\t\tEnter L to (L)ist ALL (sorted) ");
            System.out.println("\t\tEnter Q to Quit");
            System.out.print("\n\tPlease enter your choice: ");
            char choice = sc.nextLine().toUpperCase().charAt(0);


            while ((choice != 'A') && (choice != 'D') && (choice != 'M') && (choice != 'S') && (choice != 'L') && (choice != 'Q')) {
                System.out.println("Invalid choice!  Please select (A)dd, (D)elete, (M)odify, (S)earch, (L)ist or (Q)uit: ");
                choice = sc.nextLine().toUpperCase().charAt(0);
            }


            tAddressBook newPerson = new tAddressBook();
            ArrayList<tAddressBook> person = new ArrayList<>();

            switch (choice) {
                case 'A':
                    System.out.println("\nTo add a person, follow the prompts.");

                    System.out.print("\nEnter Fullname: ");
                    newPerson.setFullname(sc.nextLine());

                    System.out.print("Enter Address: ");
                    newPerson.setAddress(sc.nextLine());

                    System.out.print("Enter City: ");
                    newPerson.setCity(sc.nextLine());

                    System.out.print("Enter State: ");
                    newPerson.setState(sc.nextLine());

                    System.out.print("Enter Zip: ");
                    newPerson.setZip(sc.nextLine());

                    System.out.print("Enter Phone Number: ");
                    newPerson.setPhone(sc.nextLine());
                    person.add(new tAddressBook());
                    System.out.println(person.get(0));

                    System.out.println("\nYou have successfully added a new person!");

                    break;

                case 'D':


                    break;
                case 'M':


                    break;
                case 'S':


                    break;
                case 'L':


                    break;
                case 'Q':
                    switcher = false;
                    System.exit(0);
                    break;
                default:

            }

        }
        while (switcher != false);

    }
}





