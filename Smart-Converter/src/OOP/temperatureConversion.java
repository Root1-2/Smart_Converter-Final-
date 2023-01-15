package OOP;
import java.util.Scanner;

public class temperatureConversion
{

    public static void display ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("< 1 > CELSIUS -> FAHRENHEIT");
        System.out.println("< 2 > FAHRENHEIT -> CELSIUS");
        System.out.println("< 3 > CELSIUS -> KELVIN");
        System.out.println("< 4 > KELVIN -> CELSIUS");
        System.out.println("< 5 > FAHRENHEIT -> KELVIN");
        System.out.println("< 6 > KELVIN -> FAHRENHEITt\n");

        System.out.println("PLEASE ENTER ANY OF THE OPTIONS ABOVE: ");

        int ch = in.nextInt();
        double ft, ct, kt;

        switch (ch)
        {
            case 1:
                System.out.print("ENTER TEMPERATURE IN CELSIUS: ");
                ct = in.nextDouble();
                ft = 9.0 / 5.0 * ct + 32;
                System.out.printf("TEMPERATURE IN FAHRENHEIT: %.2f", ft);
                break;

            case 2:
                System.out.print("ENTER TEMPERATURE IN FAHRENHEIT: ");
                ft = in.nextDouble();
                ct = (ft - 32) * 5 / 9.0;
                System.out.printf("TEMPERATURE IN CELSIUS: %.2f", ct);
                break;

            case 3:
                System.out.print("ENTER TEMPERATURE IN CELSIUS : ");
                ct = in.nextDouble();
                kt = ct + 273.15;
                System.out.printf("TEMPERATURE IN KELVIN : %.2f", kt);
                break;

            case 4:
                System.out.print("ENTER TEMPERATURE IN KELVIN : ");
                kt = in.nextDouble();
                ct = kt - 273.15;
                System.out.printf("ENTER TEMPERATURE IN CELSIUS : %.2f", ct);
                break;

            case 5:
                System.out.printf("ENTER TEMPERATURE IN FAHRENHEIT : ");
                ft = in.nextDouble();
                kt = ((ft-32)/1.8) + 273.15;
                System.out.printf("TEMPERATURE IN KELVIN : $.2f", kt);
                break;

            case 6:
                System.out.printf("ENTER TEMPERATURE IN KELVIN : ");
                kt = in.nextDouble();
                ft = (kt - 273.15) * 9/5 + 32;
                System.out.printf("TEMPERATURE IN FAHRENHEIT : %.2f", ft);
                break;

            default:
                System.out.println("INCORRECT CHOICE");
                System.out.println("WOULD YOU LIKE TO TRY AGAIN");
                System.out.println("< 1 > YES");
                System.out.println("< 2 > NO");

                int option = in.nextInt();

                do
                {
                    if (option == 1)
                    {
                        display();
                    }
                    else if (option == 2)
                    {
                        System.out.println("TATA");
                        System.exit(0);
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

        int option1 = in.nextInt();

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

        in.close();
    }

}
