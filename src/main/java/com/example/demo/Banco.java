package com.example.demo;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void getClientes(){
        for(int i = 0; i < contas.size(); i++)
            System.out.println(contas.get(i).cliente.getNome());
    }

}
