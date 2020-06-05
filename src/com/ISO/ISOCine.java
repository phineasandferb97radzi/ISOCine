package com.ISO;


import java.io.PrintStream;
import java.time.Clock;
import java.util.*;

public class ISOCine {

// ==========================================       Method              ================================================

    // CheckError Method (to validate either correct format or not)
    private static boolean CheckError(String x, String y){
        return x.matches(y);
    }

    // isNumber Method (to validate either input is number or not)
    public static int isNumber(int s){
        boolean incorrectInput = true;
        Scanner sc = new Scanner(System.in);
        while (incorrectInput) {

            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n < 0) {
                System.out.print("Invalid Data! Please re-enter: ");

                } else {
                    // do anything else
                    s = n;
                    incorrectInput = false;
                }
            } else {
                sc.next();
                System.out.print("Invalid Data! Please re-enter: ");
            }
        }
        return s;
    }

// ==========================================       Method main         ================================================

    public static void main(String[] args) {

        //  Call Scanner
        Scanner sc = new Scanner(System.in);

        //  Declare variables
        String movie = null, location = null, session = null, resume= null;
        int paxChild = 0, paxStandard = 0, paxSenior = 0, locIndicator = 0 ;
        double paxCPrice = 0.00d, paxStPrice = 0.00d, paxSePrice = 0.00d, totalPrice = 0.00d;


        // Array for each location
        // locations[0] for Midvalley
        // locations[1] for Quill City Mall
        // locations[2] for KLCC Shopping Centre
        // locations[3] for Pavilion
//        String [] locations = {
//                                'Midvalley',
//                                'Quill City Mall',
//                                'KLCC Shopping Centre',
//                                'Pavillion'
//        };

        // Array for each location to calculate profit
        // profit[0] for Midvalley
        // profit[1] for Quill City Mall
        // profit[2] for KLCC Shopping Centre
        // profit[3] for Pavilion
        double [] profit = new double[4];

        // Title: ISOCine (Ascii Syntax)
        System.out.println("         /$$$$$$  /$$$$$$   /$$$$$$   /$$$$$$  /$$                          ");
        System.out.println("        |_  $$_/ /$$__  $$ /$$__  $$ /$$__  $$|__/                          ");
        System.out.println("          | $$  | $$  \\__/| $$  \\ $$| $$  \\__/ /$$ /$$$$$$$   /$$$$$$    ");
        System.out.println("          | $$  |  $$$$$$ | $$  | $$| $$      | $$| $$__  $$ /$$__  $$      ");
        System.out.println("          | $$   \\____  $$| $$  | $$| $$      | $$| $$  \\ $$| $$$$$$$$    ");
        System.out.println("          | $$   /$$  \\ $$| $$  | $$| $$    $$| $$| $$  | $$| $$_____/     ");
        System.out.println("         /$$$$$$|  $$$$$$/|  $$$$$$/|  $$$$$$/| $$| $$  | $$|  $$$$$$$      ");
        System.out.println("        |______/ \\______/  \\______/  \\______/ |__/|__/  |__/ \\_______/  ");

        System.out.println("        =============================================================== ");
        System.out.println("                          Welcome to ISOCine Cinema                     ");
        System.out.println("        =============================================================== ");

        do {

            //++++++++++++++++++++++++++++++++++++++++++++++++       Location        +++++++++++++++++++++++++++++++++++++++

            System.out.println("\n");
            System.out.println(" ___________________________________________________________________________________ ");
            System.out.println("|                                    LOCATION                                       |");
            System.out.println("|___________________________________________________________________________________|");
            System.out.println("|                   1 - Midvalley                                                   |");
            System.out.println("|                   2 - Quill City Mall                                             |");
            System.out.println("|                   3 - KLCC Shopping Centre                                        |");
            System.out.println("|                   4 - Pavillion                                                   |");
            System.out.println("|___________________________________________________________________________________|");

            //  Prompt for location
            System.out.print("\nPlease Select No. for Your Location ( 1 - 4 ): ");

            //  Get location
            location = sc.nextLine();
            locIndicator = Integer.parseInt(location) - 1;

            //  Validation Input using "CheckError()" function for location
            while (!CheckError(location, "[1-4]")) {
                System.out.print("Invalid Syntax! Re-enter your location selection ( 1 - 4 ): ");
                location = sc.nextLine();
                locIndicator = Integer.parseInt(location) - 1;
            }

            //  Selection phase to assign value to location variable
            switch (location) {
                case "1":
                    location = "MidValley";
                    break;
                case "2":
                    location = "Quill City Mall";
                    break;
                case "3":
                    location = "KLCC Shopping Centre";
                    break;
                case "4":
                    location = "Pavilion";
                    break;
                default:
                    location = "Invalid";
                    System.out.println("Not Valid!!!");
            }


            //  ++++++++++++++++++++++++++++++++++++++++++        Movie         ++++++++++++++++++++++++++++++++++++++++++++

            System.out.println("\n");
            System.out.println(" ___________________________________________________________________________________ ");
            System.out.println("|                                   MOVIE                                           |");
            System.out.println("|___________________________________________________________________________________|");
            System.out.println("|                      1 - Naruto: The Last Movie                                   |");
            System.out.println("|                      2 - Kimi no Nawa                                             |");
            System.out.println("|                      3 - Boku no Hero Academia                                    |");
            System.out.println("|                      4 - Final Fantasy VII: Advent Children                       |");
            System.out.println("|                      5 - One Piece: Stampede                                      |");
            System.out.println("|___________________________________________________________________________________|");

            //  Prompt for movie
            System.out.print("\nPlease Select No. for Your Movie ( 1 - 5 ): ");

            //  Get movie
            movie = sc.nextLine();

            //  Validation Input using "CheckError()" function for movie
            while (!CheckError(movie, "[1-5]")) {
                System.out.print("Invalid Syntax! Re-enter your movie selection ( 1 - 5 ): ");
                movie = sc.nextLine();
            }

            System.out.print("\n\n");


            //++++++++++++++++++++++++++++++++++++++++++        Session         ++++++++++++++++++++++++++++++++++++++++++++
            if ("1".equals(movie)) {
                movie = "Naruto: The Last Movie";

                System.out.println(" ____________________________________________________________________________________ ");
                System.out.println("|                                 SESSION                                            |");
                System.out.println("|____________________________________________________________________________________|");
                System.out.println("|                               1 - 11.15am                                          |");
                System.out.println("|                               2 -  4.30pm                                          |");
                System.out.println("|                               3 -  4.50pm                                          |");
                System.out.println("|                               4 -  7.10pm                                          |");
                System.out.println("|____________________________________________________________________________________|");

                //  Prompt for session
                System.out.print("\nPlease Select No. for Your Session (1 - 4): ");

                //  Get session
                session = sc.nextLine();

                //  Validation Input using "CheckError()" function for session ("Naruto")
                while (!CheckError(session, "[1-4]")) {
                    System.out.print("Invalid Syntax! Re-enter your session selection ( 1 - 4 ): ");
                    session = sc.nextLine();
                }

                //  Selection phase to assign value to session variable
                switch (session) {
                    case "1":
                        session = "11.45am";
                        break;
                    case "2":
                        session = "4.30pm";
                        break;
                    case "3":
                        session = "4.50pm";
                        break;
                    case "4":
                        session = "7.10pm";
                        break;
                    default:
                        session = "Invalid";
                        System.out.println("Invalid!!!");
                }

            } else if ("2".equals(movie)) {
                movie = "Kimi no Nawa";

                System.out.println(" ___________________________________________________________________________________ ");
                System.out.println("|                                   SESSION                                         | ");
                System.out.println("|___________________________________________________________________________________| ");
                System.out.println("|                                1 - 2.40pm                                         |");
                System.out.println("|                                2 - 4.00pm                                         |");
                System.out.println("|___________________________________________________________________________________|");

                //  Prompt for location
                System.out.print("\nPlease Select No. for Your Session (1 or 2): ");

                //  Get location
                session = sc.nextLine();

                //  Validation Input using "CheckError()" function for session ("Kimi no Nawa")
                while (!CheckError(session, "[1-2]")) {
                    System.out.print("Invalid Syntax! Re-enter your session selection ( 1 - 2 ): ");
                    session = sc.nextLine();
                }

                //  Selection phase to assign value to session variable
                switch (session) {
                    case "1":
                        session = "2.40pm";
                        break;
                    case "2":
                        session = "4.00pm";
                        break;
                    default:
                        session = "Invalid";
                        System.out.println("Invalid!!!");
                }

            } else if ("3".equals(movie)) {
                movie = "Boku no Hero Academia";

                System.out.println(" ____________________________________________________________________________________ ");
                System.out.println("|                                     SESSION                                        |");
                System.out.println("|____________________________________________________________________________________|");
                System.out.println("|                                   1 - 1.30pm                                       |");
                System.out.println("|                                   2 - 5.15pm                                       |");
                System.out.println("|                                   3 - 7.45pm                                       |");
                System.out.println("|____________________________________________________________________________________|");

                //  Prompt for session
                System.out.print("\nPlease Select No. for Your Session (1 - 3): ");

                //  Get session
                session = sc.nextLine();

                //  Validation Input using "CheckError()" function for session ("Boku no Hero Academia")
                while (!CheckError(session, "[1-3]")) {
                    System.out.print("Invalid Syntax! Re-enter your location selection ( 1 - 3 ): ");
                    session = sc.nextLine();
                }

                //  Selection phase to assign value to session variable
                switch (session) {
                    case "1":
                        session = "1.30pm";
                        break;
                    case "2":
                        session = "5.15pm";
                        break;
                    case "3":
                        session = "7.45pm";
                        break;
                    default:
                        session = "Invalid";
                        System.out.println("Invalid!!!");
                }

            } else if ("4".equals(movie)) {
                movie = "Final Fantasy VII: Advent Children";

                System.out.println("  ___________________________________________________________________________________");
                System.out.println(" |                                    SESSION                                        |");
                System.out.println(" |___________________________________________________________________________________|");
                System.out.println(" |                                 1 - 11.30am                                       |");
                System.out.println(" |                                 2 -  2.45pm                                       |");
                System.out.println(" |___________________________________________________________________________________|");

                //  Prompt for session
                System.out.print("\nPlease Select No. for Your Session (1 or 2): ");

                //  Get session
                session = sc.nextLine();

                //  Validation Input using "CheckError()" function for session ("Final Fantasy")
                while (!CheckError(session, "[1-2]")) {
                    System.out.print("Invalid Syntax! Re-enter your location selection ( 1 - 2 ): ");
                    session = sc.nextLine();
                }

                //  Selection phase to assign value to session variable
                switch (session) {
                    case "1":
                        session = "11.30am";
                        break;
                    case "2":
                        session = "2.45pm";
                        break;
                    default:
                        session = "Invalid";
                        System.out.println("Invalid!!!");
                }

            } else if ("5".equals(movie)) {
                movie = "One Piece: Stampede";

                System.out.println(" ____________________________________________________________________________________ ");
                System.out.println("|                                     SESSION                                        |");
                System.out.println("|____________________________________________________________________________________|");
                System.out.println("|                                  1 - 4.15pm                                        |");
                System.out.println("|                                  2 - 5.45pm                                        |");
                System.out.println("|                                  3 - 8.20pm                                        |");
                System.out.println("|                                  4 - 9.10pm                                        |");
                System.out.println("|____________________________________________________________________________________|");

                //  Prompt for session
                System.out.print("\nPlease Select No. for Your Session (1 - 4): ");

                //  Get session
                session = sc.nextLine();

                //  Validation Input using "CheckError()" function for session ("One Piece")
                while (!CheckError(session, "[1-4]")) {
                    System.out.print("Invalid Syntax! Re-enter your location selection ( 1 - 4 ): ");
                    session = sc.nextLine();
                }

                //  Selection phase to assign value to session variable
                switch (session) {
                    case "1":
                        session = "4.15pm";
                        break;
                    case "2":
                        session = "5.45pm";
                        break;
                    case "3":
                        session = "8.20pm";
                        break;
                    case "4":
                        session = "9.10pm";
                        break;
                    default:
                        session = "Invalid";
                        System.out.println("Invalid!!!");
                }

            } else {
                session = "Invalid";
                movie = "Invalid";
                System.out.print("Not Valid!!!!");
            }

            System.out.println("\n");

            //+++++++++++++++++++++++++++++++++++++     Total Price by Category of Age      ++++++++++++++++++++++++++++++++

            //  Child Ticket
            //  Prompt for Child Pax
            System.out.print("Please enter total of child ( 4 y/o - 12 y/o):                ");

            //  Get Child Pax and Validate using "isNumber()" function
            paxChild = isNumber(paxChild);

            //  Total Price for Child
            paxCPrice = paxChild * 8;

            //  Standard Ticket
            //  Prompt for Standard Pax
            System.out.print("Please enter total of standard (13 y/o - 35 y/o):             ");

            //  Get Standard Pax and Validate using "isNumber()" function
            paxStandard = isNumber(paxStandard);

            //  Total Price for Standard
            paxStPrice = paxStandard * 12;

            //  Senior Citizen Ticket
            //  Prompt for Senior Citizen Pax
            System.out.print("Please enter total of senior citizen: (36 y/o and above):     ");

            //  Get Senior Citizen Pax and Validate using "isNumber()" function
            paxSenior = isNumber(paxSenior);

            //  Total Price for Senior Citizen Pax
            paxSePrice = paxSenior * 10;

            //  Total price for Child, Standard and Senior Citizen
            totalPrice = paxCPrice + paxSePrice + paxStPrice;

            //+++++++++++++++++++++++++++++++++++++++++++       Receipt     ++++++++++++++++++++++++++++++++++++++++++++++++
            System.out.println("\n");
            System.out.println("==============================================================================  ");
            System.out.println("                                RECEIPT                                         ");
            System.out.println("==============================================================================  ");
            System.out.println("(" + movie + ")");
            System.out.println("Time                                         : " + session);
            System.out.println("Location                                     : " + location);
            System.out.println("Pax of Child            (RM  8 per head) x " + paxChild + " : RM " + paxCPrice);
            System.out.println("Pax of Standard         (RM 12 per head) x " + paxStandard + " : RM " + paxStPrice);
            System.out.println("Pax of Senior Citizen   (RM 10 per head) x " + paxSenior + " : RM " + paxSePrice);
            System.out.println("-----------------------------------------------------------------------------   ");
            System.out.println("                             Total Price  : RM " + totalPrice);


            profit[locIndicator] += totalPrice;

            //+++++++++++++++++++++++++++++++++++++++++++       Resume      ++++++++++++++++++++++++++++++++++++++++++++++++


            //  Prompt for resume
            System.out.print("Next customer  (Y/N) :  ");

            //  Get for resume
            resume = sc.nextLine();

            //  Validation Input using "CheckError()" function for resume variable
            while(!CheckError(resume, "[nyNY]")) {
                System.out.print("Invalid Syntax! Re-enter next customer  (Y/N) : ");
                resume = sc.nextLine();
            }

            //  Selection phase to add line for next customer
            if((resume).equals("Y") || (resume).equals("y")) {
                for (int i= 0; i<3; i++){
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------------------------------   ");
                System.out.println("                                   Next Customer                                        ");
                System.out.println("-------------------------------------------------------------------------------------   ");
            }

        } while((resume).equals("Y") || (resume).equals("y"));

        System.out.println("\n");
        System.out.println("===================================");
        System.out.println("               BRANCH              ");
        System.out.println("===================================");
        System.out.println("Midvalley           : RM "+profit[0]);
        System.out.println("Quill City Mall     : RM "+profit[1]);
        System.out.println("KL Shopping Centre  : RM "+profit[2]);
        System.out.println("Pavillion           : RM "+profit[3]);

        totalPrice = 0;
        for(double eachProfit : profit ){
            totalPrice +=eachProfit;

        }
        System.out.println("------------------------------------");
        System.out.println("Total Profit        : RM "+totalPrice);
        System.out.println("------------------------------------");


        



    }
}
