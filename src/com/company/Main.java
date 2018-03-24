package com.company;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    private static RassanList rassanList = new RassanList();

    public static void main(String[] args) {
        boolean quit =false;
        int choice =0;
        printInstruction();
        while (!quit)
        {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();



            switch(choice)
            {
                case 0:
                    printInstruction();
                    break;

                case 1:
                    rassanList.printRassanList();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;

                case 6:
                    processArrayList();

                case 7:
                    quit = true;
                    break;

            }


        }





    }


    public static void printInstruction()
    {
        System.out.println("\n press");
        System.out.println("\t 0 - To print choice the option");
        System.out.println("\t 1 - To print the list of Rassan items ");
        System.out.println("\t 2 - To add an item to the Rassan list ");
        System.out.println("\t 3 - To modify an item on the list");
        System.out.println("\t 4 - To remove an item on the list");
        System.out.println("\t 5 - To search an item on the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void  additem()
    {
        System.out.println("please enter the Rassan List");
        rassanList.addRassanItem(scanner.nextLine());


    }
    public static void modifyItem(){
        System.out.print(" Current item name: ");
        String itemno = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter new item: ");
        String newitem  = scanner.nextLine();
        rassanList.modifyRassanitem(itemno,newitem);

    }
    public static void removeItem() {
        System.out.print("enter item name: ");
        String itemno = scanner.nextLine();
        scanner.nextLine();
        rassanList.removeRassanitem(itemno);

    }
    public static  void  searchForItem()
    {
        System.out.print("item to search for ");
        String searchitem=scanner.nextLine();
        if(rassanList.onfile(searchitem)) {

            System.out.println(searchitem  + " found in your RassanList ");
            }
            else
        {
            System.out.println(searchitem + " is not in yoour RassanList");
        }

        }

        public  static void processArrayList()
        {
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(rassanList.getRassanList());


            ArrayList<String> nextArray = new ArrayList<String>(rassanList.getRassanList());

            String[] myArray = new String[rassanList.getRassanList().size()];
            myArray = rassanList.getRassanList().toArray(myArray);


        }




    }




