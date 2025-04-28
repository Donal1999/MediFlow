package ie.atu.week10;

import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Login logging = new Login();
        System.out.println("\n--- Login Attempt ---");
         try (Scanner sc = new Scanner(System.in)){
             System.out.println("Username:");
             String username = sc.nextLine();
             System.out.println("Password:");
             String password = sc.nextLine();

             logging.checkUser(username, password);


         }



    }
}

