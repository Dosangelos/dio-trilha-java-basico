import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformacoesPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua data de nascimento (no formato DD/MM/AAAA): ");
        String dataNascimentoStr = scanner.next();

        // Validação do formato de data de nascimento
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);
        try {
            Date dataNascimento = formatoData.parse(dataNascimentoStr);

            // Validação do CPF
            if (validarCPF(cpf)) {
                System.out.println("=== Informações Pessoais ===");
                System.out.println("Nome completo: " + nomeCompleto);
                System.out.println("CPF: " + cpf);
                System.out.println("Idade: " + idade);
                System.out.println("Data de Nascimento: " + formatoData.format(dataNascimento));
            } else {
                System.out.println("CPF inválido.");
            }
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Certifique-se de digitar no formato DD/MM/AAAA.");
        }

        scanner.close();
    }

    // Método para validar CPF
    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Cálculo dos dígitos verificadores
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }

        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }

        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verifica se os dígitos calculados são iguais aos dígitos informados
        return (cpf.charAt(9) - '0') == digito1 && (cpf.charAt(10) - '0') == digito2;
    }
}
