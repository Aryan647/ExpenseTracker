package com.Aryan.ExpenseTracker.Service.ServiceInterface;

import com.Aryan.ExpenseTracker.DTO.UserInfoDTO;

import java.util.List;

public interface UserInfoServiceInterface {
    UserInfoDTO createUser(UserInfoDTO userInfoDTO);
    UserInfoDTO getuserbyid(Long id);
    List<UserInfoDTO> getalluser();
    UserInfoDTO updateuser(UserInfoDTO userInfoDTO, Long id);
    UserInfoDTO deleteuser(Long id);

    UserInfoDTO getUserByUsername(String username);

}
