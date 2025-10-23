package br.com.fiap.mypass.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.mypass.model.Password;
import br.com.fiap.mypass.service.PasswordService;

@RestController
public class PasswordController {

    private final PasswordService passwordService;

    PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/pass")
    public List<Password> getAllPasswords(){
        return passwordService.getAllPasswords();
    }

}
