package br.com.fiap.mypass.model;

import lombok.Data;

@Data
public class Token {

    private String token;

    private String type;

    private String username;
}
