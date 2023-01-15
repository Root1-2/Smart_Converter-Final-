package OOP;
import java.util.Scanner;

public class currencyConversion
{
    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("< 1 > TK -> DOLLAR ");
        System.out.println("< 2 > TK -> EURO");
        System.out.println("< 3 > TK -> RUPEE");
        System.out.println("< 4 > TK -> CANADIAN DOLLAR");
        System.out.println("< 5 > TK -> BRAZILIAN REAL");
        System.out.println("< 6 > TK -> SAUDIAN REAL");
        System.out.println("< 7 > TK -> ARGENTINE PESO");
        System.out.println("< 8 > TK -> AUSTRALIAN DOLLAR");
        System.out.println("< 9 > TK -> QATARI RIYAL");
        System.out.println("< 10 > TK -> OMANI RIAL\n");


        System.out.println("PLEASE ENTER ANY OF THE OPTIONS ABOVE: ");

        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("ENTER TK: ");
                float x1 = sc.nextFloat();
                double y1 = (x1/85.61);

                System.out.printf("YOUR CURRENCY IN DOLLAR IS: %.2f$\n", y1);
                break;

            case 2:
                System.out.println("ENTER TK: ");
                float x2 = sc.nextFloat();

                double y2 = (x2/99.42);
                System.out.printf("YOUR CURRENCY IN EURO IS: %.2f€\n", y2);
                break;

            case 3:
                System.out.println("ENTER TK: ");
                float x3 = sc.nextFloat();
                double y3 = (x3/1.14);

                System.out.printf("YOUR CURRENCY IN RUPEE IS: %.2f₹\n", y3);
                break;

            case 4:
                System.out.println("ENTER TK: ");
                float x4 = sc.nextFloat();
                double y4 = (x4/69.3);

                System.out.printf("YOUR CURRENCY IN CANADIAN DOLLAR IS: %.2f$\n", y4);
                break;

            case 5:
                System.out.println("ENTER TK: ");
                float x5 = sc.nextFloat();
                double y5 = (x5/15.36);

                System.out.printf("YOUR CURRENCY IN BRAZILIAN REAL IS: %.2fR$\n", y5);
                break;

            case 6:
                System.out.println("ENTER TK: ");
                float x6 = sc.nextFloat();
                double y6 = (x6/22.83);

                System.out.printf("YOUR CURRENCY IN SAUDIAN REAL IS : %.2fSAR\n", y6);
                break;

            case 7:
                System.out.println("ENTER TK: ");
                float x7 = sc.nextFloat();
                double y7 = (x7/64.41);

                System.out.printf("YOUR CURRENCY IN ARGENTINE PESO IS: %.2fARS\n", y7);
                break;

            case 8:
                System.out.println("ENTER TK: ");
                float x8 = sc.nextFloat();
                double y8 = (x8/64.42);
                System.out.printf("YOUR CURRENCY IN AUSTRALIAN DOLLAR IS: %.2fAU$\n", y8);
                break;

            case 9:
                System.out.println("ENTER TK: ");
                float x9 = sc.nextFloat();
                double y9 = (x9/23.52);

                System.out.printf("YOUR CURRENCY IN QATARI RIYAL IS: %.2fQAR\n", y9);
                break;

            case 10:
                System.out.println("ENTER TK: ");
                float x10 = sc.nextFloat();
                double y10 = (x10/222.444);

                System.out.printf("YOUR CURRENCY IN OMANI REAL IS: %.2fOMR\n", y10);
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

    }
}
