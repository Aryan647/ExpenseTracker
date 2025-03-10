package com.Aryan.ExpenseTracker.Mapper;

import com.Aryan.ExpenseTracker.DTO.ExpenseDTO;
import com.Aryan.ExpenseTracker.Entity.Expense;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpenseMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Expense expenseDTOtoExpense(ExpenseDTO expenseDTO){
        Expense expense = modelMapper.map(expenseDTO, Expense.class);
        return expense;
    }

    public ExpenseDTO expenseToExpenseDTO(Expense expense){
        ExpenseDTO expenseDTO = modelMapper.map(expense, ExpenseDTO.class);
        return expenseDTO;
    }


}
