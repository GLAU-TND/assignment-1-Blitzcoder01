package adt;
import java.util.InputMismatchException;
import java.util.Scanner;

/***
 * user intract class
 * object declaration in main class
 */
public class user {
    public void phone() {
/***
 * phone function helps to provide menu to user and do various operations
 * call by main class
 */
        try {
            System.out.println("Welcome to Riya's Contact List App");
            Scanner sc = new Scanner(System.in);//Scanner class help to take user input
            System.out.println("want to enter in App");
            System.out.println("press " + 1 + " for enter:");
            System.out.println("press " + 0 + " for exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                try {
                    /***
                     * try block is for exception handling

                     */
                    modulesCreation ob = new modulesCreation(); //object creation of modulesCreation class

                    while(true) {
                        try {
                            /***
                             * try block is for exception handling

                             */
                            System.out.println(" * press " + 1 + " to add new contact");
                            System.out.println(" * press " + 2 + " to view all contacts");
                            System.out.println(" * press " + 3 + " to search for a contact");
                            System.out.println(" * press " + 4 + " to delete a contact");
                            System.out.println(" * press " + 5 + " to exit program");
                            int input_choice = sc.nextInt();
                            if (input_choice == 1) {
                                ob.add(); //calling of add function of  modulesCreation class
                            }
                            if (input_choice == 2) {
                                ob.view(); //calling of view function of  modulesCreation class
                            } else if (input_choice == 3) {
                             ob.search(); //calling of search function of  modulesCreation class
                             } else if (input_choice == 4) {
                             ob.delete(); //calling of delete function of  modulesCreation class
                             } else if (input_choice == 5) {
                             ob.exit(); //calling of exit function of  modulesCreation class
                             break;
                             }
                            else if(input_choice>5){
                                System.out.println("Wrong Attempt");
                                System.out.println("Try Again..");
                            }
                        }
                        catch (InputMismatchException e){
                            System.out.println("Wrong Input..");
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong Input..");

                }

            } else if (choice == 0) {
                System.out.println("Successfully Exit..... ");
            } else {
                System.out.println("Wrong Input, Try Again....");
            }
        } catch (InputMismatchException e) {
            System.out.println("Try Again");

        }
    }
}