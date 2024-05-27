
import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice = 0;
        String fileName = "";
        String name, email, phonenumber;
        ContactAppModel c = new ContactAppModel();

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
                    System.out.println("Enter the file name");
                    fileName = sc1.next();

                    if (c.checkIfFileNameExists(fileName)) {
                        System.out.println("file created");

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
                                    System.out.println("Enter the name to add a contact, else  go back to the previous menu");
                                    name = sc1.next();

                                    System.out.println("Enter email");
                                    email = sc2.nextLine();

                                    System.out.println("Enter phoneNumber");
                                    phonenumber = sc1.next();
                                    break;
                                    
                                case 2:
                                    System.out.println("to edit");
                                    break;

                                case 3:
                                    System.out.println("to remove");
                                    break;
                                case 4:
                                    System.out.println("to list");
                                    break;
                                case 5:
                                    System.out.println("to search");
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
                    System.out.println("to load");
                    break;
                case 3:
                    System.out.println("to search");
                    break;
                case 4:
                    System.out.println("to list");
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
