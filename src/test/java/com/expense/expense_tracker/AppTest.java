package com.expense.expense_tracker;

import com.expense.expense_tracker.expense.Expense;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testExpenseFields() {
        Expense e = new Expense("Food", 500.0);
        assertEquals("Food", e.getCategory());
        assertEquals(500.0, e.getAmount());
    }
}
