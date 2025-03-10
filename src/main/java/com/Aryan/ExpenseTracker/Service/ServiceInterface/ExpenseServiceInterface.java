package com.Aryan.ExpenseTracker.Service.ServiceInterface;

import com.Aryan.ExpenseTracker.DTO.ExpenseDTO;

import java.util.List;

public interface ExpenseServiceInterface {


    ExpenseDTO createExpense(ExpenseDTO expenseDTO);
    ExpenseDTO getexpensebyid(Long id);
    List<ExpenseDTO> getallExpense();
    ExpenseDTO updateexpense (ExpenseDTO expenseDTO, Long id);
    ExpenseDTO deleteexpense(Long id);
    List<ExpenseDTO> getExpensesByUserId(Long userId);
}
