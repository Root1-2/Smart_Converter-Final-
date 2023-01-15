package OOP;
import java.util.Scanner;

public class areaConversion {

    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("< 1 > AREA OF CIRCLE");
        System.out.println("< 2 > AREA OF TRIANGLE");
        System.out.println("< 3 > AREA OF RECTANGLE");
        System.out.println("< 4 > AREA OF SQUARE");
        System.out.println("< 5 > AREA OF TRAPEZIUM");
        System.out.println("< 6 > AREA OF RHOMBUS");
        System.out.println("PLEASE ENTER ANY OF THE OPTIONS ABOVE: ");

        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("ENTER RADIUS: ");
                double radius = sc.nextFloat();
                double areaCircle = (22 * radius * radius) / 7;
                System.out.println("Area of circle is: " + areaCircle);
                break;
            case 2:
                System.out.println("ENTER BASE: ");
                double base = sc.nextFloat();
                System.out.println("\nENTER HEIGHT: ");
                double height = sc.nextFloat();
                double areaTriangle = (base * height) / 2;
                System.out.println("AREA OF TRIANGLE IS: " + areaTriangle);
                break;

            case 3:
                System.out.println("ENTER LENGTH: ");
                int length = sc.nextInt();
                System.out.println("ENTER BREADTH: ");
                int breadth = sc.nextInt();
                int areaRectangle = length * breadth;
                System.out.println("AREA OF RECTANGLE IS: " + areaRectangle);
                break;

            case 4:
                System.out.println("ENTER ANY ONE SIDE: ");
                int a = sc.nextInt();
                int square = a * a;
                System.out.println("AREA OF SQUARE IS: " + square);
                break;

            case 5:
                System.out.println("ENTER BASE1: ");
                double base1 = sc.nextFloat();
                System.out.println("ENTER BASE2: ");
                double base2 = sc.nextFloat();
                System.out.println("ENTER HEIGHT: ");
                double h = sc.nextFloat();
                double areaTrapezium = ((base1 + base2) * h)/2;
                System.out.println("AREA OF TRAPEZIUM: " + areaTrapezium);
                break;

            case 6:
                System.out.println("ENTER DIAGONAL1: ");
                double d1 = sc.nextFloat();
                System.out.println("ENTER DIAGONAL2: ");
                double d2 = sc.nextFloat();
                double areaRhombus = (d1 * d2) / 2;
                System.out.println("AREA OF RHOMBUS: " + areaRhombus);
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
