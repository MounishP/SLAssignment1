package com.cl.commons;

import com.cl.operations.Operations;
import java.util.Scanner;

public class Service {
    public void welcome(){
        System.out.println("################################################################");
        System.out.println("#                                                              #");
        System.out.println("#                                                              #");
        System.out.println("#                        LOCKEDME.COM                          #");
        System.out.println("#                                                              #");
        System.out.println("#                                                              #");
        System.out.println("################################################################");
        System.out.println("Developed by: Mounish" +
                "  Phone:9972174565" +
                "  email: mnsh.pv1@gmail.com");
    }

    public void menu() {
        Operations operations= new Operations();
        System.out.println("" +"\n" +
                "1. Show All"+"\n" +
                "2. Add File" +"\n"+
                "3. Remove File" +"\n"+
                "4. Search File" +"\n"+
                "5. Go to Main Menu" +"\n"+
                "6. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        try {
            int choice = scanner.nextInt();
            operations.menuCall(choice);
        }catch (Exception e){
            System.out.println("Please enter only numbers");
        }

    }
}
