package CadastroPet;

public class Responsavel {
    String nome;
    String sobrenome;
    String cep;
    String numeroResidencial;
    int idade;
    String email;
    String telefone;

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    // Método que não retorna um valor e apenas imprime os dados basicos do dono do pet
    public void retornarDadosBasicos(){
        if(nome == "Jefferson"){
            System.out.println("Esse cara é do bem!");
        }
        System.out.println("Nome: " + nome + "\n" + "E-mail: " + email);
    }

    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean verificarMaioridade(int idade){
        if(idade >= 18){
            return true;
        }
        else{
            return false;
        }
    }


}





