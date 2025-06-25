package com.expense.expense_tracker.expense;

import java.util.ArrayList;

public class ExpenseManager {
    private double income;
    private ArrayList<Expense> expenses;

    public ExpenseManager(double income) {
        this.income = income;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(String category, double amount) {
        expenses.add(new Expense(category, amount));
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public double getRemainingSavings() {
        return income - getTotalExpenses();
    }

    public void printSummary() {
        System.out.println("\n=== Expense Summary ===");
        System.out.println("Income: ₹" + income);
        System.out.println("Expenses:");
        for (Expense e : expenses) {
            System.out.println("- " + e.getCategory() + ": ₹" + e.getAmount());
        }
        System.out.println("Total Expenses: ₹" + getTotalExpenses());
        System.out.println("Remaining Savings: ₹" + getRemainingSavings());
    }
}
