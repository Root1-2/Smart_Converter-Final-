package OOP;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        Scanner in = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t\t\t***************************\n" +
                "\t\t\t\t\t\t\t\t\t\t*    SMART CONVERTER    *\n" +
                "\t\t\t\t\t\t\t\t\t\t***************************\n\n");

        System.out.println("\n\n\t\t\t\t\t\t\t\tCHOOSE AN OPTION :\n\t\t\t\t\t\t\t================================");
        System.out.println("\t\t\t\t\t\t\t*----------------------------------");
        System.out.println("\t\t\t\t\t\t\t| < 1 > CURRENCY CONVERSION       |");
        System.out.println("\t\t\t\t\t\t\t| < 2 > AREA CONVERSION           |");
        System.out.println("\t\t\t\t\t\t\t| < 3 > TEMPERATURE CONVERSION    |");
        System.out.println("\t\t\t\t\t\t\t| < 4 > TIME CONVERSION           |");
        System.out.println("\t\t\t\t\t\t\t| < 5 > ABOUT US                  |");
        System.out.println("\t\t\t\t\t\t\t| < 6 > EXIT                      |");
        System.out.println("\t\t\t\t\t\t\t-----------------------------------");
        System.out.print("\n\t\t\t\t\t\t\tPLEASE ENTER ANY OF THE OPTION ABOVE: ");

        int choice = in.nextInt();

        switch (choice)
        {
            case 1:
                currencyConversion.display();
                break;
            case 2:
                areaConversion.display();
                break;
            case 3:
                temperatureConversion.display();

                break;
            case 4:
                timeConversion.display();
                break;

            case 5:
                System.out.println("ABOUT US" +
                        "====================");
                aboutUs.display();
                break;
            case 6:
                System.out.println("THANK YOU FOR USING OUR PROGRAM. WE HOPE YOU LIKE IT");
                System.exit(0);

            default:
                System.out.println("Incorrect Choice");
                System.out.println("WOULD YOU LIKE TO TRY AGAIN");
                System.out.println("< 1 > YES");
                System.out.println("< 2 > NO");

                int option = in.nextInt();
                do
                {
                    if (option == 1)
                    {
                        main(null);
                    }
                    else if (option == 2)
                    {
                        System.out.println("THANK YOU FOR USING OUR PROGRAM. WE HOPE YOU LIKE IT");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
                    }
                } while (option > 2);

        }
    }
}
