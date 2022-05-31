package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void getExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimir();
    }
    
}
