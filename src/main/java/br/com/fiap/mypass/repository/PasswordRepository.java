package br.com.fiap.mypass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.mypass.model.Password;

public interface PasswordRepository extends JpaRepository<Password, Long>{
    
}
