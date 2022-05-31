package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        List<Conta> lista = new ArrayList<Conta>();

        Banco b1 = new Banco();
        b1.setNome("Banco");
	
        Cliente leo = new Cliente("leo");

        Conta cc = new ContaCorrente(leo);
        cc.depositar(100);
        lista.add(cc);

        Conta cp = new ContaPoupanca(leo);
        cc.transferir(50, cp);
        lista.add(cp);

        b1.setContas(lista);

        cc.getExtrato();
        cp.getExtrato();
        b1.getClientes();
    }
}
