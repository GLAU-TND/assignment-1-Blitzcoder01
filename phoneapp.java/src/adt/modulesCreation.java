/*
Created By:Riya Mathur
date:feb-23-2020
time:11:50pm

 */
package adt;
import java.util.*;
import java.lang.*;
public class modulesCreation {
    Scanner sc= new Scanner(System.in);
    //Scanner class is for user input
    Node head;
    public void add(){
        /***
         * add() method will help to add the data into linked list
         */
        String f_name, l_name, choiceA="y", Email = "null", choice2="y";
        long[] no=new long[2];

        System.out.println("Person enter the name of the Person");
        System.out.print("First Name: ");
        f_name=sc.nextLine();
        System.out.print("Last Name: ");
        l_name=sc.nextLine();
        System.out.print("Contact Number: ");
        for(int i=0;i<1;i++){
           no[i]= sc.nextLong();
        }
        sc.nextLine();
        System.out.println("Would you like to add another contact number?(y/n)");
        choiceA = sc.nextLine();

        if(choiceA.equals("y")){
            for(int i=1;i<2;i++){

                no[i]= sc.nextLong();
                break;
            }
        }
            System.out.println();
            sc.nextLine();
            System.out.println("Would you like to add Email address?(y/n)");

            choice2 = sc.nextLine();
            while (true) {
                if (choice2.equals("y")) {
                    System.out.print("Email address: ");
                    Email = sc.nextLine();
                    break;
                } else {
                    break;
                }
        }
        Node new_node = new Node(f_name,l_name,no,Email);/***creation of blank Node to insert a end***/
        if(head==null){
            head=new_node;
            new_node.getNext();
            System.out.println("Inserted");
        }

        else{
            Node temp=head;//temporary Node to store head
            while (temp.getNext()!=null){
                temp= temp.getNext();
            }
            temp.setNext(new_node);
            System.out.println("Inserted");
            sort();//calling sort method to sort data using f_name in alphabetical order
        }

    }
    public void sort(){
        /***
         * creation of sort function
         * call in add method
         */
        Node temp= head;//temporary Node to store head
        Node temp3= head;//temporary Node to store head
        if(head!= null && head.getNext()!=null){

            while(temp3.getNext()!=null){

                while (temp.getNext()!=null)
                {/**
                     * loop to sort the list according to f_name
                     */
                    if(temp.f_name.compareTo(temp.getNext().f_name)>0){
                        String temp2=temp.f_name;
                        temp.f_name=temp.getNext().f_name;
                        temp.getNext().f_name=temp2;

                        temp2=temp.l_name;
                        temp.l_name=temp.getNext().l_name;
                        temp.getNext().l_name=temp2;

                        temp2=temp.Email;
                        temp.Email=temp.getNext().Email;
                        temp.getNext().Email=temp2;

                        long[] array= new long[2];

                        array = temp.no;
                        temp.no = temp.getNext().no;
                        temp.getNext().no = array;


                    }
                    temp=temp.getNext();

                }
                temp3=temp3.getNext();
            }

        }


    }
    public void view(){
        /***
         * view method is used to view all data in sorted manner
         * call by user class
         */
            Node temp = head;//temporary Node to store head

            if(head== null){
                System.out.println("list is empty");
            }

            else {
                System.out.println("---Here are all your contacts---");
                System.out.println("-------- * -------- * -------- * --------");

                while (temp.getNext() != null) {
                    System.out.println("First Name: " + temp.f_name);
                    System.out.println("Last Name: " + temp.l_name);
                    System.out.print("Contact Number: ");
                    for (int i = 0; i < 2; i++) {
                        System.out.print(temp.no[i] + " ,");
                    }
                    System.out.println();
                    System.out.println("Email address: " + temp.Email);
                    //  System.out.println("index: " + temp.index);
                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("-------- * -------- * -------- * --------");
                    temp = temp.getNext();
                }
                System.out.println("First Name: " + temp.f_name);
                System.out.println("Last Name: " + temp.l_name);
                System.out.print("Contact Number: ");
                for (int i = 0; i < 2; i++) {
                    System.out.print(temp.no[i] + " ,");
                }
                System.out.println();
                System.out.println("Email address: " + temp.Email);
                // System.out.println("index: " + temp.index);
                System.out.println("-------- * -------- * -------- * --------");
            }
        }


    public void search(){
        /***
         * search method is user to search the user input data
         * call by user class
         */
            Node temp = head;//temporary Node to store head
            Node temp2 = head;//temporary Node to store head
            System.out.println("You could search for a contact from their first names: ");
            String val = sc.nextLine();
            int ctr2 = 0;
            if(head==null){
                System.out.println("Can,t search ,list is empty..");
                System.out.println("Try Again..");
            }
            else {
                while (temp.getNext() != null) {
                    if (val.equals(temp.f_name)) {
                        ctr2++;
                    }
                    temp = temp.getNext();
                }
                if (val.equals(temp.f_name)) {
                    ctr2++;
                }
                if (ctr2 == 0) {
                    System.out.println("NO RESULTS FOUND!");
                } else {
                    System.out.println(ctr2 + " Match Found!");
                    System.out.println("-------- * -------- * -------- * --------");
                }
                while (temp2.getNext() != null) {
                    if (val.equals(temp2.f_name)) {

                        // temp2 = temp;
                        System.out.println("First Name: " + temp2.f_name);
                        System.out.println("Last Name: " + temp2.l_name);
                        System.out.print("Contact Number: ");
                        for (int i = 0; i < 2; i++) {
                            System.out.print(temp2.no[i] + " ,");
                        }
                        System.out.println();
                        System.out.println("Email address: " + temp2.Email);
                        System.out.println("-------- * -------- * -------- * --------");
                    }
                    temp2 = temp2.getNext();
                }
                if (val.equals(temp2.f_name)) {
                    System.out.println("First Name: " + temp2.f_name);
                    System.out.println("Last Name: " + temp2.l_name);
                    System.out.print("Contact Number: ");
                    for (int i = 0; i < 2; i++) {
                        System.out.print(temp2.no[i] + " ,");
                    }
                    System.out.println();
                    System.out.println("Email address: " + temp2.Email);
                    System.out.println("-------- * -------- * -------- * --------");
                }
            }
        }
    public void delete(){
        /***
         * delete method is user to delete the data of user choice
         * call by user class
         */
        if(head==null){
            System.out.println("Can't delete ,list is empty..");
            System.out.println("try again..");
        }
        else {
            System.out.println("Here are all your contacts: ");
            int count = 0;
            Node temp = head;//temporary Node to store head
            Node temp2 = head;//temporary Node to store head
            while (temp.getNext() != null) {
                System.out.print(count + 1 + ". ");
                System.out.print(temp.f_name + " ");
                System.out.println(temp.l_name);
                count++;
                temp = temp.getNext();
            }
            System.out.print(count + 1 + ". ");
            System.out.print(temp.f_name + " ");
            System.out.println(temp.l_name);
            System.out.print("Press the number against the contact to delete it: ");
            int choice = sc.nextInt();
            while (choice > 1) {
                temp2 = temp2.getNext();
                choice--;
            }
            System.out.print(temp2.f_name + " ");
            System.out.println(temp2.l_name + "'s contact deleted from list!");
            temp2.f_name = "null";
            temp2.l_name = "null";
            for (int i = 0; i < 2; i++) {
                temp2.no[i] = 0;
            }
            temp2.Email = "null";
        }
    }
    public void exit(){
        /***
         * exit method will help to exit from the code
         * call by user class
         */
        System.out.println("Successfully Exit..");
    }
}