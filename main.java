
package com.Company;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    SManagment S = new SManagment();
    Info1 i = new Info1();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Password to login");
    int pass;
    pass = sc.nextInt();
    if (pass == 123) {

      Scanner sc1 = new Scanner(System.in);
      int choice;
      System.out.println("press 1 for DashBoard");
      System.out.println("Press 2 for profile");
      System.out.println("Press 3 for FEE Structure");
      System.out.println("Press 4 for Info");
      choice = sc1.nextInt();
      switch (choice) {

        case 1:

          S.DashBoard();
          break;
        case 2:

         S.Profile();
          break;
          case 3:

          S.Fees();
           break;
           case 4:

           i.printType();
            break;
        default:
          System.out.println("Wrong input");
          break;
      }
    } else {
      System.out.println("Your credentials is wrong ");
    }
   
  }

}
