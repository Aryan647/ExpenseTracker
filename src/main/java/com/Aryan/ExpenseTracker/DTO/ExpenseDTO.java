package com.Aryan.ExpenseTracker.DTO;



import com.Aryan.ExpenseTracker.Entity.Budget;
import com.Aryan.ExpenseTracker.Entity.UserInfo;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseDTO {
    private Long expenseid;
    private Double amount;
    private LocalDateTime createdAt;
    private String description;


    private UserInfo userInfo;


    private Budget budget;
}
