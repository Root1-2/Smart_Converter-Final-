package OOP;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("***************************\n" +
                "*    Hello Good People    *\n" +
                "***************************\n\n");

        System.out.println("\t\t------------------------------\n" +
                "\t\t+  Welcome to our small      +\n" +
                "\t\t+  but smart project         +\n" +
                "\t\t------------------------------");



        Scanner in = new Scanner(System.in);
        System.out.println("Please choice your option: ");
        int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Currency conversion");
                    break;
                case 2:
                    System.out.println("Area conversion");
                    break;
                case 3:
                    System.out.println("Speed conversion");
                    break;
                case 4:
                    System.out.println("Temperature conversion");
                    break;
                case 5:
                    System.out.println("Here you can see us: \n"+
                                       "====================");
                    aboutUs.display();
                    break;

            }
        }
    }
