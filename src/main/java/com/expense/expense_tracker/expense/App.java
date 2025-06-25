package com.expense.expense_tracker.expense;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly income: ₹");
        double income = sc.nextDouble();
        ExpenseManager manager = new ExpenseManager(income);

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. Show Summary");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ₹");
                    double amount = sc.nextDouble();
                    manager.addExpense(category, amount);
                    break;
                case 2:
                    manager.printSummary();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
