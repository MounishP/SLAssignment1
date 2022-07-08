package com.cl.operations;

import com.cl.commons.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    static List<String> directory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Service service;

    public void menuCall(int choice) {
        directory.add("mounish");
        directory.add("ravi");
        directory.add("apple");
        directory.add("zebra");
        directory.add("name");
        switch (choice){
            case 1:
                System.out.println("Sorted file names in the directory:");
                directory.sort(String.CASE_INSENSITIVE_ORDER);
                System.out.println(directory);
                break;
            case 2:
                System.out.print("Enter the file to add in directory: ");
                String fileName = scanner.next();
                if (directory.add(fileName)){
                    System.out.println("File added successfully");
                }else{
                    System.out.println("File not added");
                }
                break;
            case 3:
                System.out.print("Enter the file to remove in directory: ");
                String removeFile = scanner.next();
                if (directory.remove(removeFile)){
                    System.out.println("File removed successfully");
                }else {
                    System.out.println("File not found");
                }
                break;
            case 4:
                System.out.print("Enter the file to search: ");
                String searchFile = scanner.next();
                if (directory.contains(searchFile)){
                    System.out.println("File found in directory");
                }else {
                    System.out.println("File not found");
                }
                break;
            case 5:
                System.out.println("main menu  ----> ");
                service.menu();
                break;
            case 6:
                System.out.println("Quit");
                break;
            default:
                System.out.println("The entered choice is not found..Please enter valid choice.");
        }
        System.out.println(directory);
    }
}
