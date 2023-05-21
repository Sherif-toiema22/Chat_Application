package com.example.chat_application.controller;

import com.example.chat_application.model.ActiveUser;
import com.example.chat_application.model.Storage;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:63342")
public class UserController {
    @GetMapping("/")
    public String x()
    {
        return "HO";
    }

    @GetMapping("/active")
    public List<ActiveUser> list(){
        return Storage.activeUserList;
    }
}
