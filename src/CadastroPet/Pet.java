package CadastroPet;

import CadastroPet.Responsavel;

public class Pet {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String cor;
    private Responsavel dono;
    private String tipoCuidado;

    public Pet(String nome, String especie, String raca, int idade, String cor, Responsavel dono, String tipoCuidado) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.tipoCuidado = tipoCuidado;
    }

    public enum TiposCuidado{
        BanhoETosa,
        Vacina,
        Fisioterapia
    }

    public String retornarDadosPet() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", dono=" + dono.retornarTodosDados() +
                ", tipoCuidado='" + tipoCuidado + '\'' +
                '}';
    }
}
