package com.Aryan.ExpenseTracker.DTO;

import com.Aryan.ExpenseTracker.Entity.UserInfo;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDTO {

        private Long budgetid;
        private String budgetname;
        private Double amountlimit;
        private LocalDateTime createdAt;


        private UserInfo userInfo;


//        private List<Expense> expenses;

}
