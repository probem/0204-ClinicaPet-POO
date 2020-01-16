package CadastroPet;

import CadastroPet.Responsavel;

public class Pet {
    String nome;
    String especie;
    String raca;
    int idade;
    String cor;
    Responsavel dono;
    String tipoCuidado;

    public Pet(String nome, String especie, String raca, int idade, String cor, Responsavel dono, String tipoCuidado) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.tipoCuidado = tipoCuidado;
    }
}
