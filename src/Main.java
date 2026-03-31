import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n===== MENU =====\n");
            System.out.println("\t1 - Calcular média");
            System.out.println("\t2 - Verificar idade");
            System.out.println("\t3 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularMedia(scanner);
                    break;

                case 2:
                    verificarIdade(scanner);
                    break;

                case 3:
                    sairSistema();
                    break;

                default:
                    System.out.println("\nOpção inválida\n");

            }


        } while (opcao != 3);

        scanner.close();
    }

    static void calcularMedia(Scanner scanner) {

        System.out.println("\nVocê escolheu a opção calcular média");

        scanner.nextLine();

        System.out.print("\tDigite seu nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("\tDigite sua Idade: ");
        int idadeAluno = scanner.nextInt();

        Aluno aluno = new Aluno();
        aluno.setNome(nomeAluno);
        aluno.setIdade(idadeAluno);

        System.out.print("\tDigite sua primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.print("\tDigite sua segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.print("\tDigite sua terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.print("\tDigite sua quarta nota: ");
        int nota4 = scanner.nextInt();

        scanner.nextLine();

        double media = aluno.calcularMediaNumeros(nota1, nota2, nota3, nota4);
        String status= aluno.verificarStatus(media);

        System.out.println("\n===== DADOS ALUNO =====\n");
        System.out.println("\tNome do Aluno: " + aluno.getNome());
        System.out.println("\tIdade do Aluno: " + aluno.getIdade());
        System.out.println("\tMédia: " + media);
        System.out.println("\tStatus: " + status);

    }

    static void verificarIdade(Scanner scanner ){

        System.out.println("\nVocê escolheu a opção verificar idade");

        scanner.nextLine();

        System.out.print("\tDigite o seu nome: ");
        String usuarioNome = scanner.nextLine();
        System.out.print("\tColoque seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.nextLine();

        Usuario usuario = new Usuario();
        usuario.setNome(usuarioNome);
        usuario.setAnoNascimento(anoNascimento);

        System.out.println("\n===== SEUS DADOS =====\n");
        System.out.printf("\tOlá, %s.\n", usuario.getNome());
        System.out.printf("\tSua idade é %d anos.\n",  usuario.calcularIdade());
        System.out.printf("\tVocê é %s\n",  usuario.verificarMaiorIdade());

    }

    static void sairSistema(){
        System.out.println("\n\tSaindo do Sistema...\n");
    }

}