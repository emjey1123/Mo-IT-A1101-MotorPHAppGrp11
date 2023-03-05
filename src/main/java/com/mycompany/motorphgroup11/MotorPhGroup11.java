/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorphgroup11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Emjey
 */
public class MotorPhGroup11 {

    public static void main(String[] args)
    throws FileNotFoundException {
        
        
         Scanner scr = new Scanner(System.in);
         
        System.out.println("=============================================");
        System.out.println("========= WELCOME TO MOTORPH PORTAL =========");
        System.out.println("=============================================");
        
        System.out.println("Please Log in");
        
        int totalAttempts = 3;
        
            while (totalAttempts != 0) {
                
        String userName = "Admin";
        String passWord = "123456";
        
        System.out.print("Enter Username: ");
        userName  = scr.next();
        
        System.out.print("Enter Password: ");
        passWord  = scr.next();
        
        if ("Admin".equals(userName) && "123456".equals(passWord)){
            System.out.println("\n");
            System.out.println("Successfully Logged In!");
            Homepage();
            
            } else {
            
            System.out.println("Incorrect Login");
            totalAttempts--;
            System.out.println(totalAttempts);
        }
       } 
            if (totalAttempts == 0) {
                
        System.out.println("Maximum number of attempts exceeded! Thank You!");
    }
}
    


public static void Homepage() 
           throws FileNotFoundException {
    
    Scanner scr = new Scanner(System.in);
    
    
    
     int selection;
     
     do {
         System.out.println("========================");
        System.out.println("    SELECT FROM MENU   ");   
        System.out.println("========================"); 
        System.out.println("1. My Profile");
        System.out.println("2. Payroll");
        System.out.println("3. Worked Hours");
        System.out.println("4. Employees");
        System.out.println("5. Leave Application");
        System.out.println("6. Log Out");
        System.out.println("========================\n");
        System.out.println("You Selected: ");
            selection = scr.nextInt(); // Add throw clause for java.io.IOException
               
            
            switch (selection)
        {
                case 1 -> {
                System.out.println("Sorry, System Temporarily Unavailable. Please select another option!" );
                Homepage();
                }
                
                case 2 -> {
                System.out.println("You Selected: Payroll!" );
                Payroll();
                }
                
                case 3 -> {
                System.out.println("You Selected: Worked Hours!" );
                WorkedHours();
                }             
                               
                case 4 -> {
                System.out.println("You Selected: Employees!" );
                Employees();
                }
            
                case 5 -> {
                System.out.println("Sorry, System Temporarily Unavailable. Please select another option!" );
                Homepage();
                }
                
                case 6 -> {
                System.out.println("Logged Out! \n Thank You!\n");
                System.exit(0);
                }
                
                default -> System.out.println("Invalid. Please select from the following options!");
        }
    }while(selection != 6);
   }


public static void Employees()
          throws FileNotFoundException{
    
    int  emp_no; 
    
    String last_name = null, first_name = null, position = null, 
                    status = null, birthday = null, address = null, phone_no = null,
                    tin_no = null, pagibig_no = null, phealth_no = null, sss_no = null;
    
    double b_salary = 0, hr_rate = 0, rice = 0, cloth = 0, phone = 0;
    
    Scanner scr = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("P 000.00");
        
        
        System.out.println("=====SEARCH EMPLOYEE=====\n ");
        System.out.println("Employee Number: ");
             emp_no = scr.nextInt(); 
             
             switch (emp_no) {
            case 10001 -> {
                last_name = "Crisostomo";
                first_name = "Jose";
                position = "HR Manager";
                status = "Regular";
                birthday = "February 14, 1988";
                phone_no = "918-621-603";
                address = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ";
                sss_no = "49-1632020-8";
                phealth_no = "382189453145";
                tin_no = "317-674-022-000";
                pagibig_no = "441093369646";
                b_salary = 62670;
                hr_rate = 373.04;
                rice = 1500;
                phone = 1000;
                cloth = 1000;
                
                }
            case 10002 -> {
                last_name = "Mata";
                first_name = "Christian";
                position = "Account Team Leader";
                status = "Regular";
                birthday = "October 21, 1987";
                phone_no = "783-776-744";
                address = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu";
                sss_no = "49-2959312-6";
                phealth_no = "824187961962";
                tin_no = "103-100-522-000";
                pagibig_no = "631052853464";
                b_salary = 42975;
                hr_rate = 255.80;
                rice = 1500;
                phone = 800;
                cloth = 800;
                
            }
            default -> {
                System.out.println("Unknown Employee!\n Thank You!\n");      
            }  
        }
             
             
             System.out.println("=================================================================================\n");
             
             System.out.println("EMPLOYEE DETAILS: \n");
                 System.out.println("Employee Number: " + emp_no + " ");
                 System.out.println("Last Name: " + last_name + " ");
                 System.out.println("First Name: " + first_name + " ");
                 System.out.println("Position: " + position + " ");
                 System.out.println("Status: " + status + " ");
                 System.out.println("Birthday: " + birthday + " ");
                 System.out.println("Address: " + address + " ");
                 System.out.println("Phone Number: " + phone_no + " ");
                 System.out.println("SSS Number: " + sss_no + " ");
                 System.out.println("Philheath Number: " + phealth_no + " ");
                 System.out.println("Tin Number: " + tin_no + " ");
                 System.out.println("Pag-ibig Number: " + pagibig_no + " ");
                 System.out.println("Basic Salary: " + f.format(b_salary) + " ");
                 System.out.println("Hourly Rate: " + f.format(hr_rate) + " ");
                 System.out.println("Rice Allowance: " + f.format(rice) + " " );       
                 System.out.println("Clothing Allowance: " + f.format(cloth) + " ");        
                 System.out.println("Phone Allowance: " + f.format(phone) + " ");
                 System.out.println("===================================================================================\n");
                 
                 
 //TO RETURN OR EXIT
       int exit_selection;
       
       
       System.out.println("\n");
            System.out.println("========================");
            System.out.println("Select Options!");   
            System.out.println("========================");
       do { 
            System.out.println("1. Search Another Employee");
            System.out.println("2. Return to Homepage");
            System.out.println("3. Exit");
            System.out.println("========================\n");
            System.out.println("You Selected: ");
            exit_selection = scr.nextInt(); 
            
            
             switch (exit_selection)
        {
            case 1 -> {
                System.out.println("Search another Employee");
                Employees();
                }
           
            case 2 -> {
                System.out.println("You Selected: Homepage");
                Homepage();
                }

            case 3 -> {
                System.out.println("You Selected Exit, GoodBye! ");
                System.exit(0);
                }
            }
        }while(exit_selection != 3);
    }
     


public static void WorkedHours() 
               throws FileNotFoundException{ 
         
    //TO READ AND WRITE TEXT FILE
            // declare and initialize the variables
        double hour1, hour2, hour3, hour4, hour5;
        double w_workhour ;
        String  empNo, name, f_name;
            FileReader fr = new FileReader("C:\\Users\\Emjey\\Documents\\NetBeansProjects\\MPHPayslip\\WorkedHours1.txt");
        Scanner inFile = new Scanner(fr);

        PrintWriter outFile = new PrintWriter("C:\\Users\\Emjey\\Documents\\NetBeansProjects\\MPHPayslip\\CalculationWorkedHours1.txt");

        // Read till end of file
        while (inFile.hasNext())
        {
            empNo = inFile.next();
            name = inFile.next();
            f_name = inFile.next();


            hour1 = inFile.nextDouble();
            hour2 = inFile.nextDouble();
            hour3 = inFile.nextDouble();
            hour4 = inFile.nextDouble();
            hour5 = inFile.nextDouble();


        outFile.println("Employee No : " + empNo);
            outFile.println("Name : " + name + f_name);
            outFile.printf("Worked Hours : %5.2f %5.2f %5.2f %5.2f %5.2f %n", hour1, hour2, hour3, hour4, hour5);
            w_workhour = hour1 + hour2 + hour3 + hour4 + hour5 ;
            outFile.printf("TotalWorkedHours: %5.2f %n", w_workhour);
            outFile.println();
        }
        
        inFile.close();
        outFile.close();
       
    //TO PRINT A TEXTFILE TO CONSOLE
       System.out.println("===============================================");
       System.out.print("************ EMPLOYEE WORKED HOURS ************\n");
       System.out.println("===============================================\n");    
       
       try {
            BufferedReader reader=new BufferedReader (new FileReader("C:\\Users\\Emjey\\Documents\\NetBeansProjects\\MPHPayslip\\CalculationWorkedHours1.txt"));
             
            
            String line;
            while ((line=reader.readLine())!=null){
                
                System.out.println(line);

            }

        }catch (Exception e){
            System.out.println(e);    
       }
       
       //TO RETURN OR EXIT
       int exit_selection;
       
        Scanner scr = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("========================");
            System.out.println("Select Options!");   
            System.out.println("========================");
       do {  
            System.out.println("1. Return to Homepage");
            System.out.println("2. Exit");
            System.out.println("========================\n");
            System.out.println("You Selected: ");
            exit_selection = scr.nextInt(); 
            
            
            switch (exit_selection)
        {
            case 1 -> {
                System.out.println("You Selected: Homepage");
                Homepage();
                }

            case 2 -> {
                System.out.println("You Selected Exit, GoodBye! ");
                System.exit(0);
                }
        }
            }while(exit_selection != 2);
            
        }  
    public static void Payroll() 
            throws FileNotFoundException{
        
        int  emp_no;
        
        String last_name = null, first_name = null, position = null, 
                    status = null, birthday = null, address = null, phone_no = null,
                    tin_no = null, pagibig_no = null, phealth_no = null, sss_no = null;
    
        double b_salary = 0, hr_rate = 0, rice = 0, cloth = 0, phone = 0, w_workhour = 0;
        
        Scanner scr = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("P 000.00");
        
        
         System.out.println("=====SEARCH EMPLOYEE=====\n ");
        System.out.println("Employee Number: ");
            emp_no = scr.nextInt(); 
            
            switch (emp_no) {
            case 10001 -> {
                last_name = "Crisostomo";
                first_name = "Jose";
                position = "HR Manager";
                status = "Regular";
                birthday = "February 14, 1988";
                phone_no = "918-621-603";
                address = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ";
                sss_no = "49-1632020-8";
                phealth_no = "382189453145";
                tin_no = "317-674-022-000";
                pagibig_no = "441093369646";
                b_salary = 62670;
                hr_rate = 373.04;
                rice = 1500;
                phone = 1000;
                cloth = 1000;
                w_workhour = 40;
            }
            case 10002 -> {
                last_name = "Mata";
                first_name = "Christian";
                position = "Account Team Leader";
                status = "Regular";
                birthday = "October 21, 1987";
                phone_no = "783-776-744";
                address = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu";
                sss_no = "49-2959312-6";
                phealth_no = "824187961962";
                tin_no = "103-100-522-000";
                pagibig_no = "631052853464";
                b_salary = 42975;
                hr_rate = 255.80;
                rice = 1500;
                phone = 800;
                cloth = 800;
                w_workhour = 40;
            }
            default -> {
                System.out.println("Unknown Employee!\n Thank You!\n");      
            }  
        }
            
            /* }
    public static double sss(){
        
        if(b_salary < 3250){
            return 135;
            }    
        if(b_salary >=  24751){
            return 1125;
            }       
            */
            
            
            
            double b_weekpay = w_workhour * hr_rate;
            double overTime = w_workhour - 40;
            double oT_rate = hr_rate * 1.25;
            double oT_pay = oT_rate * overTime;
            double allowance = (phone + rice + cloth)/4;
            double gr_weekpay = b_weekpay + oT_pay ;
                 
                double pagibig = 200/4;
                double phealth = 200/4;
                double sss = 500/4;
                double tax = gr_weekpay*.20;
                double deduction = pagibig + sss + phealth + tax;
                double netpay = gr_weekpay + allowance - deduction;
                System.out.println("\n");
                
                
                
                //to print Employee details
         System.out.println("=================================================================================");
         System.out.println("******************************* MOTORPH PAYSLIP *********************************");
         System.out.println("=================================================================================\n");
                
                 System.out.println("EMPLOYEE DETAILS: \n");
                 System.out.println("Employee Number: " + emp_no + " ");
                 System.out.println("Last Name: " + last_name + " ");
                 System.out.println("First Name: " + first_name + " ");
                 System.out.println("Position: " + position + " ");
                 System.out.println("Status: " + status + " ");
                 System.out.println("Birthday: " + birthday + " ");
                 System.out.println("Address: " + address + " ");
                 System.out.println("Phone Number: " + phone_no + " ");
                 System.out.println("SSS Number: " + sss_no + " ");
                 System.out.println("Philheath Number: " + phealth_no + " ");
                 System.out.println("Tin Number: " + tin_no + " ");
                 System.out.println("Pag-ibig Number: " + pagibig_no + " ");
                 System.out.println("Basic Salary: " + f.format(b_salary) + " ");
                 System.out.println("Hourly Rate: " + f.format(hr_rate) + " ");
                 System.out.println("Rice Allowance: " + f.format(rice) + " " );       
                 System.out.println("Clothing Allowance: " + f.format(cloth) + " ");        
                 System.out.println("Phone Allowance: " + f.format(phone) + " ");
                 System.out.println("===================================================================================\n");
                 System.out.println("GROSS PAY DETAILS: \n");
                 //System.out.println("Date: " + start  + " to " + end  + " ");
                 System.out.println("Hours worked for the Week: " + w_workhour + " ");
                 System.out.println("Overtime Hours: " + overTime);   
                 System.out.println("Overtime Pay: " + f.format(oT_pay));
                 System.out.println("Total Allowance : " + f.format(allowance) + "\n");
                 System.out.println("Gross Pay: " + f.format(gr_weekpay));  // f.format to follow format stated above
                 System.out.println("===================================================================================\n");
                 System.out.println("GOVERNMENT CONTRIBUTIONS \n");
                 System.out.println("SSS: " + f.format(sss));
                 System.out.println("Philhealth: " + f.format(phealth));
                 System.out.println("Pag - ibig: " + f.format(pagibig));
                 System.out.println("Tax: " + f.format(tax));
                 System.out.println("Total Deductions: " + f.format(deduction));
                 System.out.println("===================================================================================\n");
                 System.out.println("Gross Pay: " + f.format(gr_weekpay));
                 System.out.println("Total Deductions: " + f.format(deduction));
                 System.out.println("Total Allowance : " + f.format(allowance) + "\n");
                 System.out.println("Net Pay: " + f.format(netpay)+"\n");
                 System.out.println("\n");
                 
                
                 
                 
        //TO RETURN OR EXIT
       int exit_selection;
       
            
            System.out.println("\n");
            System.out.println("========================");
            System.out.println("Select Options!");   
            System.out.println("========================");
       do { 
            System.out.println("1. Search Another Employee");
            System.out.println("2. Return to Homepage");
            System.out.println("3. Exit");
            System.out.println("========================\n");
            System.out.println("You Selected: ");
            exit_selection = scr.nextInt(); 
       
        
        switch (exit_selection)
        {
            case 1 -> {
                System.out.println("Search another Employee");
                Payroll();
                }
           
            case 2 -> {
                System.out.println("You Selected: Homepage");
                Homepage();
                }

            case 3 -> {
                System.out.println("You Selected Exit, GoodBye! ");
                System.exit(0);
                }
            }
        }while(exit_selection != 3);
    }
}
    
