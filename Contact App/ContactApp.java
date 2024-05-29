
import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice = 0;
        String fileName = "";
        String name, email, phonenumber, existingWord, newWord;
        ContactAppModel c = new ContactAppModel();
        Logger l = Logger.getInstance();

        Util.menu(1);
        while (choice != 5) {

            System.out.println(" ");
            System.out.println("Press 1 to Create Contacts Book");
            System.out.println("Press 2 to Load Contacts Book");
            System.out.println("Press 3 to Search contacts");
            System.out.println("Press 4 to List contacts");
            System.out.println("Press 5 to Exit");
            System.out.println(" ");

            System.out.println("Enter your choice");
            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    l.log("creating the contactBook");
                    System.out.println("Enter the file name");
                    fileName = sc1.next();

                    if (c.checkIfFileNameExists(fileName)) {
                        System.out.println("file created");

                        l.log("rendering menu 2");
                        Util.menu(2);
                        while (choice < 6) {

                            System.out.println(" ");
                            System.out.println("Press 1 to add Contact ");
                            System.out.println("Press 2 to Edit a Contact");
                            System.out.println("Press 3 to Remove a Contact");
                            System.out.println("Press 4 to List the Contact");
                            System.out.println("Press 5 to Search Contact");
                            System.out.println("Press 6 to Go back");
                            System.out.println(" ");

                            System.out.println("Enter your choice");
                            choice = sc1.nextInt();

                            switch (choice) {

                                case 1:
                                    l.log("adding contact to file");
                                    System.out.println("Enter the name to add a contact, else  go back to the previous menu");
                                    name = sc1.next();

                                    System.out.println("Enter email");
                                    email = sc2.nextLine();

                                    System.out.println("Enter phoneNumber");
                                    phonenumber = sc1.next();

                                    if (Util.validate(name) && Util.validateEmail(email) && Util.validatePhonenumber(phonenumber)) {
                                        ContactBean bean = new ContactBean(name, email, phonenumber);
                                        c.addContact(bean, fileName);
                                        System.out.println("contact added successfully");
                                    } else {
                                        System.out.println("enter valid details");
                                    }

                                    break;

                                case 2:
                                    l.log("editing contact to file");
                                    System.out.println("to edit");
                                    System.out.println("Enter existing word");
                                    existingWord = sc1.next();

                                    System.out.println("Enter new word");
                                    newWord = sc1.next();

                                    if (c.editContacts(fileName, existingWord, newWord)) {
                                        System.out.println("edited succesfully");
                                    } else {
                                        System.out.println("we are unable to edit");
                                    }
                                    break;

                                case 3:
                                    l.log("deleting the contact to file");
                                    System.out.println("Enter the name of the contact which you want to delete");
                                    name = sc1.next();
                                    if (c.deleteLine(fileName, name)) {
                                        System.out.println("deleted succesfuly");
                                    } else {
                                        System.out.println("we are unable to delete");
                                    }

                                    break;

                                case 4:
                                    l.log("listing all contacts to file");
                                    System.out.println("to list");
                                    c.listContacts(fileName);

                                    break;
                                case 5:
                                    l.log("searching the  contact to file");
                                    System.out.println("to search");
                                    System.out.println("Enter the contact which you want to search");
                                    name = sc1.next();

                                    if (c.searchContact(fileName, name)) {
                                        System.out.println("searched succesfully");

                                    } else {
                                        System.out.println("unable to search the contact");
                                    }
                                    break;
                                default:
                                    System.out.println("invalid number");
                                    break;
                                case 6:
                                    System.out.println("go back");

                            }
                        }

                    }
                    break;

                case 2:
                    l.log("loading the contactBook");
                    System.out.println("to load");
                    c.listFiles();

                    System.out.println("enter valid file name from above");
                    fileName = sc1.next();

                    Util.menu(2);
                    if (Util.validate(fileName)) {

                        if (c.checkFileExists(fileName)) {

                            while (choice < 6) {

                                System.out.println(" ");
                                System.out.println("Press 1 to add Contact ");
                                System.out.println("Press 2 to Edit a Contact");
                                System.out.println("Press 3 to Remove a Contact");
                                System.out.println("Press 4 to List the Contact");
                                System.out.println("Press 5 to Search Contact");
                                System.out.println("Press 6 to Go back");
                                System.out.println(" ");

                                System.out.println("Enter your choice");
                                choice = sc1.nextInt();

                                switch (choice) {
                                    case 1:
                                        l.log("in loadContacts adding the contacts");
                                        System.out.println("Enter the name to add a contact, else  go back to the previous menu");
                                        name = sc1.next();

                                        System.out.println("Enter email");
                                        email = sc2.nextLine();

                                        System.out.println("Enter phoneNumber");
                                        phonenumber = sc1.next();

                                        if (Util.validate(name) && Util.validateEmail(email) && Util.validatePhonenumber(phonenumber)) {
                                            ContactBean bean = new ContactBean(name, email, phonenumber);
                                            c.addContact(bean, fileName);
                                            System.out.println("contact added successfully");
                                        } else {
                                            System.out.println("enter valid details");
                                        }

                                        break;

                                    case 2:
                                        l.log("in loadContacts editing the contacts");
                                        System.out.println("to edit");
                                        System.out.println("Enter existing word");
                                        existingWord = sc1.next();

                                        System.out.println("Enter new word");
                                        newWord = sc1.next();

                                        if (c.editContacts(fileName, existingWord, newWord)) {
                                            System.out.println("edited succesfully");
                                        } else {
                                            System.out.println("we are unable to edit");
                                        }
                                        break;

                                    case 3:
                                        l.log("in loadContacts delteting the contacts");

                                        System.out.println("Enter the name of the contact which you want to delete");
                                        name = sc1.next();

                                        if (c.deleteLine(fileName, name)) {
                                            System.out.println("deleted succesfuly");
                                        } else {
                                            System.out.println("we are unable to delete");
                                        }

                                        break;

                                    case 4:
                                        l.log("in loadContacts listing the contacts");
                                        System.out.println("to list");
                                        c.listContacts(fileName);
                                        break;

                                    case 5:
                                        l.log("in loadContacts searching the contacts");
                                        System.out.println("to search");
                                        System.out.println("Enter the contact which you want to search");
                                        name = sc1.next();

                                        if (c.searchContact(fileName, name)) {
                                            System.out.println("searched succesfully");

                                        } else {
                                            System.out.println("unable to search the contact");
                                        }
                                        break;

                                    default:
                                        System.out.println("invalid number");
                                        break;
                                    case 6:
                                        System.out.println("go back");

                                }
                            }

                        } else {
                            System.out.println("file entered is not present");
                        }

                    } else {
                        System.out.println("enter validate name");
                    }
                    break;

                case 3:
                    l.log("entering the search contacts");

                    System.out.println("to search");
                    System.out.println("Enter name of the Contact Book you want to search");
                    fileName = sc1.next();

                    if (Util.validate(fileName)) {

                        if (c.checkFileExists(fileName)) {

                            while (choice < 6) {

                                System.out.println(" ");
                                System.out.println("Press 1 to add Contact ");
                                System.out.println("Press 2 to Edit a Contact");
                                System.out.println("Press 3 to Remove a Contact");
                                System.out.println("Press 4 to List the Contact");
                                System.out.println("Press 5 to Search Contact");
                                System.out.println("Press 6 to Go back");
                                System.out.println(" ");

                                System.out.println("Enter your choice");
                                choice = sc1.nextInt();

                                switch (choice) {
                                    case 1:
                                        l.log("In search contacts adding the contacts");
                                        System.out.println("Enter the name to add a contact, else  go back to the previous menu");
                                        name = sc1.next();

                                        System.out.println("Enter email");
                                        email = sc2.nextLine();

                                        System.out.println("Enter phoneNumber");
                                        phonenumber = sc1.next();

                                        if (Util.validate(name) && Util.validateEmail(email) && Util.validatePhonenumber(phonenumber)) {

                                            ContactBean bean = new ContactBean(name, email, phonenumber);
                                            c.addContact(bean, fileName);
                                            System.out.println("contact added successfully");

                                        } else {
                                            System.out.println("enter valid details");
                                        }

                                        break;

                                    case 2:
                                        l.log("In search contacts editing the contacts");
                                        System.out.println("to edit");
                                        System.out.println("Enter existing word");
                                        existingWord = sc1.next();

                                        System.out.println("Enter new word");
                                        newWord = sc1.next();

                                        if (c.editContacts(fileName, existingWord, newWord)) {
                                            System.out.println("edited succesfully");
                                        } else {
                                            System.out.println("we are unable to edit");
                                        }
                                        break;

                                    case 3:
                                        l.log("In search contacts deleting the contacts");
                                        System.out.println("Enter the name of the contact which you want to delete");
                                        name = sc1.next();
                                        c.deleteLine(fileName, name);
                                        break;

                                    case 4:
                                        l.log("In search contacts listing all the contacts");
                                        System.out.println("to list");
                                        c.listContacts(fileName);
                                        break;
                                    case 5:
                                        l.log("In search contacts searching the contacts");
                                        System.out.println("to search");
                                        System.out.println("Enter the contact which you want to search");
                                        name = sc1.next();

                                        if (c.searchContact(fileName, name)) {
                                            System.out.println("searched succesfully");

                                        } else {
                                            System.out.println("unable to search the contact");
                                        }
                                        break;
                                    default:
                                        System.out.println("invalid number");
                                        break;
                                    case 6:
                                        System.out.println("go back");

                                }
                            }

                        } else {
                            System.out.println("file doesnot exists");
                        }

                    } else {
                        System.out.println("enter validate filename to search");
                    }

                    break;

                case 4:
                    l.log("entering the listContactBook");
                    System.out.println("to list");
                    c.listFiles();
                    break;

                default:
                    System.out.println("invalid number");
                    break;

                case 5:
                    System.out.println("Bye Bye");
            }

        }

    }

}
