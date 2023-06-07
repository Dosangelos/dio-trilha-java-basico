import java.util.Scanner;

public class identidadePessoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.println("=== Informações Pessoais ==");
        System.out.println(" Nome: " + nome);
        System.out.println(" Idade: " + idade);
        System.out.println(" Data Nascimento: " + dataNascimento);
        scanner.close();

    }
}
