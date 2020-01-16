package CadastroPet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Responsavel pessoa = new Responsavel(
                 "Jerfferson",
                 "Brito",
                 "05883-260",
                 "550",
                 23,
                 "jerfferson@mastertech.com.br",
                 "99999-9999"
         );

         Pet cachorro = new Pet(
                 "Toddy",
                 "Cachorro",
                 "Vira-Lata",
                 24,
                 "marrom",
                 pessoa,
                 "Banho e Tosa"
         );

         System.out.println(cachorro.dono.cep);

    }
}
