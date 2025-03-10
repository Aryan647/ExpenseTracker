package com.Aryan.ExpenseTracker.Repository;

import com.Aryan.ExpenseTracker.Entity.Earning;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EarningRepo extends JpaRepository<Earning,Long> {
    List<Earning> findByUserInfo_userid(Long userId);
}
