package com.Aryan.ExpenseTracker.Repository;

import com.Aryan.ExpenseTracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepo extends JpaRepository<Expense,Long> {
    List<Expense> findByUserInfo_userid(Long userId);
}
