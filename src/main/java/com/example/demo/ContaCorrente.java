package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void getExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimir();
    }

    
}
