package com.Aryan.ExpenseTracker.Controller;

import com.Aryan.ExpenseTracker.DTO.UserInfoDTO;
import com.Aryan.ExpenseTracker.Service.ServiceImpl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoServiceImpl userInfoService;


    @GetMapping("/welcome")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String welcome(Model model){
        model.addAttribute("message","Welcome this endpoint is freeeee....");
        return "welcome";
    }

    @PostMapping("/create-user")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public UserInfoDTO createUser(@RequestBody UserInfoDTO userInfoDTO){
        return userInfoService.createUser(userInfoDTO);
    }

    @GetMapping("/get-user/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<UserInfoDTO> getUserById(@PathVariable Long id){
        UserInfoDTO userInfoDTO=userInfoService.getuserbyid(id);
        return ResponseEntity.ok(userInfoDTO);
    }

    @GetMapping("/get-alluser")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<UserInfoDTO> getalluser(){
        return userInfoService.getalluser();
    }

    @PutMapping("/update-user/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<UserInfoDTO> updateuser(@RequestBody UserInfoDTO userInfoDTO,@PathVariable Long id){
        UserInfoDTO userInfoDTO1=userInfoService.updateuser(userInfoDTO, id);
        return ResponseEntity.ok(userInfoDTO1);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<String> deleteuser(@PathVariable Long id){
        userInfoService.deleteuser(id);
        return ResponseEntity.ok("Deleted");

    }

    @GetMapping("/get-userbyusername/{username}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<UserInfoDTO> getUserByUsername(@PathVariable String username){
        UserInfoDTO userInfoDTO=userInfoService.getUserByUsername(username);
        return ResponseEntity.ok(userInfoDTO);
    }



}
