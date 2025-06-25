package com.expense.expense_tracker;

import com.expense.expense_tracker.expense.Expense;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpenseTest {

    @Test
    public void testExpenseCreation() {
        Expense e = new Expense("Groceries", 1000.0);
        assertEquals("Groceries", e.getCategory());
        assertEquals(1000.0, e.getAmount(), 0.01);
    }
}
