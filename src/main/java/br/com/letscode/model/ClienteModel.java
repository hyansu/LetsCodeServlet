package br.com.letscode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ClienteModel {
    private String nome;
    private String email;
    private String senha;
    private List<Conta> contas;
}

