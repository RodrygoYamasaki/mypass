package br.com.fiap.mypass.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.mypass.model.Password;
import br.com.fiap.mypass.repository.PasswordRepository;

@Service
public class PasswordService {
    
    private final PasswordRepository passwordRepository;

    PasswordService(PasswordRepository passwordRepository) {
        this.passwordRepository = passwordRepository;
    }

    public List<Password> getAllPasswords() {
        return passwordRepository.findAll();
    }
}
