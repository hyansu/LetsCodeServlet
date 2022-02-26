package br.com.letscode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Conta {
    private Integer numeroConta;
    private Integer agencia;
}
