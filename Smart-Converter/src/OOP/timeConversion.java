package OOP;
import java.util.Scanner;
import java.util.Date;


public class timeConversion
{
    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("PLEASE NOTE THAT THE TIME FORMAT IS 24-HOUR");
        System.out.println("1.CURRENT TIME.");
        System.out.println("2.BANGLADESH -> LONDON.");
        System.out.println("3.BANGLADESH -> AMERICA.");
        System.out.println("4.BANGLADESH -> CANADA.");
        System.out.println("5.BANGLADESH -> ITALY.");

        System.out.println("\n");
        System.out.println("PLEASE ENTER ANY OF THE OPTIONS ABOVE: ");

        int ch = sc.nextInt();

        switch(ch) 
        {
            case 1:
                Date date=java.util.Calendar.getInstance().getTime();
                System.out.println(date);
                break;
                
            case 2:
                System.out.print("ENTER HOUR ");
                int h1 = sc.nextInt();
                System.out.print("ENTER MINUTES ");
                int m1 = sc.nextInt();
                System.out.println("BANGLADESHI TIME IS: "+h1+":"+ m1);

                int londonHour = h1 - 5;

                System.out.println("LONDON TIME IS :"+ londonHour+":"+ m1);
                break;


            case 3:
                System.out.print("ENTER HOUR ");
                int h2 = sc.nextInt();
                System.out.print("ENTER MINUTES ");
                int m2 = sc.nextInt();
                System.out.println("BANGLADESHI TIME IS: "+h2+":"+ m2);

                int AmericaHour = h2 + 14;
                if(AmericaHour >= 24)
                {
                AmericaHour = AmericaHour-24;
                System.out.println("AMERICAN TIME IS :"+ AmericaHour+":"+ m2);
                }
                else
                {
                    System.out.println("AMERICAN TIME IS :"+ AmericaHour+":"+ m2);
                }
                
            case 4:
                System.out.print("ENTER HOUR ");
                int h3 = sc.nextInt();
                System.out.print("ENTER MINUTES ");
                int m3 = sc.nextInt();
                System.out.println("BANGLADESHI TIME IS: "+h3+":"+ m3);

                int CanadaHour = h3 + 14;
                if(CanadaHour >= 24)
                {
                    CanadaHour = CanadaHour-24;
                    System.out.println("CANADIAN TIME IS :"+ CanadaHour+":"+ m3);
                }
                else
                {
                    System.out.println("CANADIAN TIME IS :"+ CanadaHour+":"+ m3);
                }
                break;

            case 5:
                System.out.print("ENTER HOUR ");
                int h4 = sc.nextInt();
                System.out.print("ENTER MINUTES ");
                int m4 = sc.nextInt();
                System.out.println("BANGLADESHI TIME IS: "+h4+":"+ m4);

                int ItalyHour = h4 + 20;
                if(ItalyHour >= 24)
                {
                    ItalyHour = ItalyHour-24;
                    System.out.println("ITALIAN TIME IS:"+ ItalyHour+":"+ m4);
                }
                else
                {
                    System.out.println("ITALIAN TIME IS:"+ ItalyHour+":"+ m4);
                }
                break;

            default:
                    System.out.println("INCORRECT CHOICE");
                    System.out.println("WOULD YOU LIKE TO TRY AGAIN");
                    System.out.println("< 1 > YES");
                    System.out.println("< 2 > NO");
                    
                    int option = sc.nextInt();
                    
                    do 
                    {
                    if (option == 1)
                    {
                        display();
                    }
                    else if (option == 2)
                    {
                        Main.main(null);
                    }
                    else
                    {
                        System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
                    }
                    } while (option > 2);
            }
        
                    System.out.println("\nWOULD YOU LIKE TO TRY AGAIN");
                    System.out.println("< 1 > YES");
                    System.out.println("< 2 > NO");
                    
                    int option1 = sc.nextInt();
                    
                    do 
                    {
                    if (option1 == 1)
                    {
                        display();
                    }
                    else if (option1 == 2)
                    {
                        Main.main(null);
                    }
                    else
                    {
                        System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
                    }
                    } while (option1 > 2);
                    
        sc.close();
        }      
}
