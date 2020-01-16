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


         Pet cachorro = new Pet(
                 "Toddy",
                 "Cachorro",
                 "Vira-Lata",
                 24,
                 "Marrom",
                 pessoa,
                 Pet.TiposCuidado.Fisioterapia.toString()
         );

         System.out.println(pessoa.verificarMaioridade(pessoa.idade));
         System.out.println(cachorro.retornarDadosPet());

    }
}
