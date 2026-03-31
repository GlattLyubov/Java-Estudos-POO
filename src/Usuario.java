public class Usuario {

    private String nome;
    private int anoNascimento;

    public String getNome() {return nome;}
    public void setNome(String nome){
        this.nome = nome;
    }


    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    int calcularIdade (){

        int anoAtual = 2026;

        return anoAtual- this.anoNascimento;
    }

    String verificarMaiorIdade () {

        int idade = calcularIdade();

        if (idade >= 18) return "maior de idade.";
        else return "menor de idade.";
    }
}
