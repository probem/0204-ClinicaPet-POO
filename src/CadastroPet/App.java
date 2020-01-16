package CadastroPet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Responsavel pessoa = new Responsavel(
                 "Jefferson",
                 "Brito",
                 "05883-260",
                 "550",
                 20,
                 "jerfferson@mastertech.com.br",
                 "99999-9999"
         );

         Responsavel pessoa2 = new Responsavel(
                 "Roger",
                 "José",
                 "02092092",
                 "9328392",
                 77,
                 "oi@oi.com",
                 "40028922"
         );


         Pet cachorro = new Pet(
                 "Toddy",
                 "Cachorro",
                 "Vira-Lata",
                 24,
                 "Marrom",
                 pessoa,
                 Pet.TiposCuidado.Fisioterapia.toString()
         );

         Pet papagaio = new Pet(
                 "Loro",
                 "papagaio azul com neon",
                 "ave",
                 40,
                 "laranja",
                 pessoa2,
                 Pet.TiposCuidado.Vacina.toString()
         );

         pessoa.setNome("Cleiton");
         System.out.println(pessoa.getNome());

         System.out.println(pessoa.verificarMaioridade(pessoa.getIdade()));
         System.out.println(cachorro.retornarDadosPet());
         System.out.println(papagaio.retornarDadosPet());

    }
}
