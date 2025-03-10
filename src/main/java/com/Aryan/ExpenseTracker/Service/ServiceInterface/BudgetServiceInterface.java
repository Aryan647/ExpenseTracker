package com.Aryan.ExpenseTracker.Service.ServiceInterface;

import com.Aryan.ExpenseTracker.DTO.BudgetDTO;

import java.util.List;

public interface BudgetServiceInterface {
        BudgetDTO createBudget(BudgetDTO budgetDTO);
        BudgetDTO getBudgetById(Long id);
        List<BudgetDTO> getAllBudgets();
        BudgetDTO updateBudget(BudgetDTO budgetDTO, Long id);
        BudgetDTO deleteBudget(Long id);
        List<BudgetDTO> getBudgetByUserId(Long userId);
    }


