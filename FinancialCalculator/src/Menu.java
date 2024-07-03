import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        System.out.println("Which formula would you like to use?");
        System.out.println("1. Simple Interest Future Value (FV)");
        System.out.println("2. Simple Interest Present Value (PV)");
        System.out.println("3. Simple Interest Rate (r)");
        System.out.println("4. Compound Interest Future Value (FV)");
        System.out.println("5. Compound Interest Present Value (PV)");
        System.out.println("6. Compound Interest Rate (r)");
        System.out.println("7. Periodic Interest Future Value (FV)");
        System.out.println("8. Periodic Interest Present Value (PV)");
        System.out.println("9. Periodic Interest Rate (r)");
        System.out.println("10. Continuous Interest Future Value (FV)");
        System.out.println("11. Continuous Interest Present Value (PV)");
        System.out.println("12. Continuous Interest Rate (r)");
        System.out.println("13. Interest with Periodic Deposit Future Value (FV)");
    }

    public static void processChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("Recall: PV = Present Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter PV, r, n:");
                double pv1 = scanner.nextDouble();
                double r1 = scanner.nextDouble();
                int n1 = scanner.nextInt();
                double fvSimple = FinancialCalculations.fvSimple(pv1, r1, n1);
                System.out.println("Future Value: " + fvSimple);
                System.out.println("You will have " + fvSimple + " in " + n1 + " years with a simple interest rate of " + (r1 * 100) + "%.");
                break;
            case 2:
                System.out.println("Recall: FV = Future Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter FV, r, n:");
                double fv2 = scanner.nextDouble();
                double r2 = scanner.nextDouble();
                int n2 = scanner.nextInt();
                double pvSimple = FinancialCalculations.pvSimple(fv2, r2, n2);
                System.out.println("Present Value: " + pvSimple);
                System.out.println("To have " + fv2 + " in " + n2 + " years with a simple interest rate of " + (r2 * 100) + "%, you need to invest " + pvSimple + " today.");
                break;
            case 3:
                System.out.println("Recall: PV = Present Value, FV = Future Value, n = Number of Periods");
                System.out.println("Enter PV, FV, n:");
                double pv3 = scanner.nextDouble();
                double fv3 = scanner.nextDouble();
                int n3 = scanner.nextInt();
                double rSimple = FinancialCalculations.rSimple(pv3, fv3, n3);
                System.out.println("Interest Rate: " + rSimple);
                System.out.println("To grow an investment from " + pv3 + " to " + fv3 + " in " + n3 + " years, you need an interest rate of " + (rSimple * 100) + "% per year.");
                break;
            case 4:
                System.out.println("Recall: PV = Present Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter PV, r, n:");
                double pv4 = scanner.nextDouble();
                double r4 = scanner.nextDouble();
                int n4 = scanner.nextInt();
                double fvCompound = FinancialCalculations.fvCompound(pv4, r4, n4);
                System.out.println("Future Value: " + fvCompound);
                System.out.println("You will have " + fvCompound + " in " + n4 + " years with a compound interest rate of " + (r4 * 100) + "%.");
                break;
            case 5:
                System.out.println("Recall: FV = Future Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter FV, r, n:");
                double fv5 = scanner.nextDouble();
                double r5 = scanner.nextDouble();
                int n5 = scanner.nextInt();
                double pvCompound = FinancialCalculations.pvCompound(fv5, r5, n5);
                System.out.println("Present Value: " + pvCompound);
                System.out.println("To have " + fv5 + " in " + n5 + " years with a compound interest rate of " + (r5 * 100) + "%, you need to invest " + pvCompound + " today.");
                break;
            case 6:
                System.out.println("Recall: PV = Present Value, FV = Future Value, n = Number of Periods");
                System.out.println("Enter PV, FV, n:");
                double pv6 = scanner.nextDouble();
                double fv6 = scanner.nextDouble();
                int n6 = scanner.nextInt();
                double rCompound = FinancialCalculations.rCompound(pv6, fv6, n6);
                System.out.println("Interest Rate: " + rCompound);
                System.out.println("To grow an investment from " + pv6 + " to " + fv6 + " in " + n6 + " years with compound interest, you need an interest rate of " + (rCompound * 100) + "% per year.");
                break;
            case 7:
                System.out.println("Recall: PV = Present Value, r = Interest Rate, n = Number of Periods, m = Compounding Periods per Year");
                System.out.println("Enter PV, r, n, m:");
                double pv7 = scanner.nextDouble();
                double r7 = scanner.nextDouble();
                int n7 = scanner.nextInt();
                int m7 = scanner.nextInt();
                double fvInterval = FinancialCalculations.fvInterval(pv7, r7, n7, m7);
                System.out.println("Future Value: " + fvInterval);
                System.out.println("You will have " + fvInterval + " in " + n7 + " years with periodic compounding " + m7 + " times a year at an interest rate of " + (r7 * 100) + "%.");
                break;
            case 8:
                System.out.println("Recall: FV = Future Value, r = Interest Rate, n = Number of Periods, m = Compounding Periods per Year");
                System.out.println("Enter FV, r, n, m:");
                double fv8 = scanner.nextDouble();
                double r8 = scanner.nextDouble();
                int n8 = scanner.nextInt();
                int m8 = scanner.nextInt();
                double pvInterval = FinancialCalculations.pvInterval(fv8, r8, n8, m8);
                System.out.println("Present Value: " + pvInterval);
                System.out.println("To have " + fv8 + " in " + n8 + " years with periodic compounding " + m8 + " times a year at an interest rate of " + (r8 * 100) + "%, you need to invest " + pvInterval + " today.");
                break;
            case 9:
                System.out.println("Recall: PV = Present Value, FV = Future Value, n = Number of Periods, m = Compounding Periods per Year");
                System.out.println("Enter PV, FV, n, m:");
                double pv9 = scanner.nextDouble();
                double fv9 = scanner.nextDouble();
                int n9 = scanner.nextInt();
                int m9 = scanner.nextInt();
                double rInterval = FinancialCalculations.rInterval(pv9, fv9, n9, m9);
                System.out.println("Interest Rate: " + rInterval);
                System.out.println("To grow an investment from " + pv9 + " to " + fv9 + " in " + n9 + " years with periodic compounding " + m9 + " times a year, you need an interest rate of " + (rInterval * 100) + "% per year.");
                break;
            case 10:
                System.out.println("Recall: PV = Present Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter PV, r, n:");
                double pv10 = scanner.nextDouble();
                double r10 = scanner.nextDouble();
                int n10 = scanner.nextInt();
                double fvContinuous = FinancialCalculations.fvContinuous(pv10, r10, n10);
                System.out.println("Future Value: " + fvContinuous);
                System.out.println("You will have " + fvContinuous + " in " + n10 + " years with continuous compounding at an interest rate of " + (r10 * 100) + "%.");
                break;
            case 11:
                System.out.println("Recall: FV = Future Value, r = Interest Rate, n = Number of Periods");
                System.out.println("Enter FV, r, n:");
                double fv11 = scanner.nextDouble();
                double r11 = scanner.nextDouble();
                int n11 = scanner.nextInt();
                double pvContinuous = FinancialCalculations.pvContinuous(fv11, r11, n11);
                System.out.println("Present Value: " + pvContinuous);
                System.out.println("To have " + fv11 + " in " + n11 + " years with continuous compounding at an interest rate of " + (r11 * 100) + "%, you need to invest " + pvContinuous + " today.");
                break;
            case 12:
                System.out.println("Recall: PV = Present Value, FV = Future Value, n = Number of Periods");
                System.out.println("Enter PV, FV, n:");
                double pv12 = scanner.nextDouble();
                double fv12 = scanner.nextDouble();
                int n12 = scanner.nextInt();
                double rContinuous = FinancialCalculations.rContinuous(pv12, fv12, n12);
                System.out.println("Interest Rate: " + rContinuous);
                System.out.println("To grow an investment from " + pv12 + " to " + fv12 + " in " + n12 + " years with continuous compounding, you need an interest rate of " + (rContinuous * 100) + "% per year.");
                break;
            case 13:
                System.out.println("Recall: r = Interest Rate, n = Number of Periods, m = Compounding Periods per Year, A = Amount Deposited Periodically");
                System.out.println("Enter r, n, m, A:");
                double r13 = scanner.nextDouble();
                int n13 = scanner.nextInt();
                int m13 = scanner.nextInt();
                double a13 = scanner.nextDouble();
                double fvWithDeposit = FinancialCalculations.fvWithDeposit(r13, n13, m13, a13);
                System.out.println("Future Value with Periodic Deposit: " + fvWithDeposit);
                System.out.println("With periodic deposits of " + a13 + " every period, you will have " + fvWithDeposit + " in " + n13 + " years, compounding " + m13 + " times a year at an interest rate of " + (r13 * 100) + "%.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid formula number.");
        }
    }
}
