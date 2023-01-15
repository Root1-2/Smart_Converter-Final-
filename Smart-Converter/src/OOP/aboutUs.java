package OOP;
import java.util.Scanner;

public class aboutUs extends Main
{
    static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t***ABOUT OUR PROJECT***\n"+
                "\t\t\t\t\t\t\t\t  [ SMART CONVERTER ]\n\n\n\nIN EARLIER YEARS"+
                "ALL THE CONVERSION OF DIFFERENT SUBJECT HAD TO BE DONE MANUALLY\n"+
                "PEOPLE HAD TO REMEMBER LOTS OF FORMULA TO CHANGE ONE UNITS TO ANOTHER.\n"+
                "BUT WITH OUR PROJECT, PEOPLE CAN EASILY MAKE THIS CHANGE WITH THEIR FINGERTIP\n"+
                "ONLY, WITHOUT ANY MISTAKES & FASTER THAN EVER. IT HAS FEATURES LIKE TIME CONVERSION,\n"+
                "AREA CONVERSION, CURRENCY CONVERSION, TEMPERATURE CONVERSION WHICH IS SOMETHING WE ALL\n"+
                "NEED SOMETIME IN OUR DAY-TO-DAY LIFE. THE WHOLE PROJECT IS DEVELOPED IN JAVA PROGRAMMING\n"+
                "LANGUAGE. MANY FUNCTIONS, DIFFERENT VARIABLES, STRINGS & CLASS HAS BEEN USED\n"+
                "FOR THE DEVELOPMENT OF THIS PROJECT. THIS IS A MINI PROJECT SO IT CONTAINS LESS FEATURES\n"+
                "THAN USUAL. BUT IT'S EASY TO OPERATE AND UNDERSTANDABLE BY THE USERS AND HAVE THE\n"+
                "OPTIONS TO ADD TONS OF FEATURES IN THE UPCOMING UPDATES\n");

        System.out.println("\t\t\t\t\t\t\t\t\t** ABOUT US**\n\n\n\n"+
                "\t\tA GROUP OF FIVE MEMBERS WORKING TOGETHER FROM PLACES "+
                "BATCHES OF DEPARTMENT OF COMPUTER SCIENCE AND ENGINEERING (LEADING UNIVERSITY)\n");

        System.out.println("\n\n\n\t\t\t\t\t\t\t< 1 > MD. JAFRUL HAQUE RAFI         2012020259\n"+
                "\t\t\t\t\t\t\t< 2 > TASFIAH TAHSIN AHSAN          2012020258\n"+
                "\t\t\t\t\t\t\t< 3 > ABDULLAH AL MASRUR            2012020255\n"+
                "\t\t\t\t\t\t\t< 4 > ANISUR RAHMAN RIFAT           2012020229\n"+
                "\t\t\t\t\t\t\t< 5 > JANNATUL FERDOUS SABRIN       2012020251\n");


        System.out.println("FOR ANY KIND OF HELP YOU CAN CONTRACT WITH US USING BELOW INFORMATION:\n\n"+
                "MAIL:\ncse_2012020259@lus.ac.bd\n" +
                        "cse_2012020255@lus.ac.bd\n" +
                        "cse_2012020251@lus.ac.bd\n" +
                        "cse_2012020258@lus.ac.bd\n" +
                        "cse_2012020229@lus.ac.bd\n\n" +
                        "MOBILE : \n" +
                        "01797224414"
                );

        System.out.println("\nWOULD YOU LIKE  BACK TO MAIN MENU ");
        System.out.println("< 1 > YES");
        System.out.println("< 2 > NO");

        int option = sc.nextInt();

        do
        {
            if (option == 1)
            {
                Main.main(null);
            }
            else if (option == 2)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
            }
        } while (option > 2);

        sc.close();
    }
}
