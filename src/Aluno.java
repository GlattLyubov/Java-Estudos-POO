public class Aluno {

    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    double calcularMediaNumeros (int nota1, int nota2, int nota3, int nota4){
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    String verificarStatus (double media){
        if (media >= 9.5) return "Excelente! Aprovado";
        else if (media >= 7) return "Aprovado";
        else return "Reprovado";
    }

}
