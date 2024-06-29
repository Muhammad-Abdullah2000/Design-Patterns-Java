package com.Company;


import java.util.Scanner;

 class SManagment {
    public void DashBoard() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Registration Number: ");

        int choice = scanner.nextInt();

        if (choice == 52) {
            String flname = "Muhammad Abdullah";
            System.out.println("The Full Name of Student is: " + flname);

            int CourseNo = 123;
            System.out.println("The Course Number is: " + CourseNo);

            String CourseN = "Object Oriented SE";
            System.out.println("The Course Name is: " + CourseN);

            int Credit = 3;
            System.out.println("The Credit Hours of this Course is: " + Credit);

            String Teacher = "Mam Rabail Asghar";
            System.out.println("The name of the teacher is: " + Teacher);

            String Class = "Section B";
            System.out.println("Your class is: " + Class);

            String Attendance = "100%";
            System.out.println("Your Attendence is: " + Attendance);

        }

        if (choice == 53) {
            String flname1 = "Muhammad Ali";
            System.out.println("The Full Name of Student is: " + flname1);

            int CourseNo1 = 123;
            System.out.println("The Course Number is: " + CourseNo1);

            String CourseN1 = "Object Oriented SE";
            System.out.println("The Course Name is: " + CourseN1);

            int Credit1 = 3;
            System.out.println("The Credit Hours of this Course is: " + Credit1);

            String Teacher1 = "Mam Rabail Asghar";
            System.out.println("The name of the teacher is: " + Teacher1);

            String Class1 = "Section B";
            System.out.println("Your class is: " + Class1);

            String Attendance1 = "100%";
            System.out.println("Your Attendence is: " + Attendance1);
            
        } else {
            System.out.println("Invlid Registration Number!");
        }

    }

    public void Profile() {

        int reg;
        System.out.println("Enter your registration number: ");
        Scanner in = new Scanner(System.in);
        reg = in.nextInt();
        if (reg == 52) {
            String Fname = "Muhammad";
            System.out.println("Your FirstName is: " + Fname);

            String FatherName = "xyz";
            System.out.println("Your FatherName is: " + FatherName);

            String Nationality = "Pakistaani";
            System.out.println("Your Nationality is: " + Nationality);

            String DOB = "16 / 05 / 2003";
            System.out.println("Your Date of Birth is: " + DOB);

            String Email = "Abdullah2000.com";
            System.out.println("Your E-mail is: " + Email);

            int contact = 1234567890;
            System.out.println(" Your Phone Number is: " + contact);
        }
        if (reg == 53) {
            String Fname1 = "Ali";
            System.out.println("Your FirstName is: " + Fname1);

            String FatherName1 = "abc";
            System.out.println("Your FatherName is: " + FatherName1);

            String Nationality1 = "Pakistaani";
            System.out.println("Your Nationality is: " + Nationality1);

            String DOB1 = "16 / 05 / 1999";
            System.out.println("Your Date of Birth is: " + DOB1);

            String Email1 = "ali.com";
            System.out.println("Your E-mail is: " + Email1);

            int contact1 = 987654321;
            System.out.println(" Your Phone Number is: " + contact1);
        }
        else{
            System.out.println("Invalid Profile!");
        }

    }

     public void Fees(){
        int reg;
        System.out.println("Enter your registration number: ");
        Scanner in = new Scanner(System.in);
        reg = in.nextInt();
        if (reg == 52) {
           String Fullname = "Muhammad Abdullah";
            System.out.println("Your Full Name is: " + Fullname);

            String OOSE = "20000";
            String DS = "20000";
            String Diff = "20000";
            String DataBases = "20000";
            System.out.println("-----------------------------------------------------");
            System.out.println("Your OOSE FEE is: " + OOSE);
            System.out.println("Your DS FEE is: " + DS);
            System.out.println("Your DIFF FEE is: " + Diff);
            System.out.println("Your DataBases FEE is: " + DataBases);
            System.out.println("-----------------------------------------------------");

           String ChallanNO = "123"; 
           
           System.out.println("Your Challan Number is: " + ChallanNO);  
         

            String Due = "20 / 05 / 2020";
            System.out.println("Your Due Date is: " + Due);

            String AmountDue = "80000";
            System.out.println("Your Amount Due is: " + AmountDue);

            String Fdue = "40000";
            System.out.println("Your First Due is: " + Fdue);

            String SDue = "40000";
            System.out.println("Your Second Due is: " + SDue);

            String AmountADUE = "100000";
            System.out.println("Your Amount After Due is: " + AmountADUE);


       }
   }

}

class INFO {
    protected String Fullname = " Muhammad Abdullah ";
    protected String FatherName = " xyz ";
    protected String OfficeMail = " xyz.hotmail.com ";
    protected String city = " Multan ";
  }
  
  class Info1 extends INFO {
    public String Fullname = " ";
    public String FatherName = " ";
    public String OfficeMail = " ";
    public String city = " ";
  
    public void printType() {
     // System.out.println("I am a " + Fullname);
      System.out.println("Your Full name is: " + super.Fullname);
      System.out.println("Your Father Name is: " + super.FatherName);
      System.out.println("Your Office Account is: " + super.OfficeMail);
      System.out.println("Your City is: " + super.city);
    }
  }
  
  