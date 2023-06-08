import java.util.Scanner;

/**
 * Este método é utilizado para somar três números inteiros
 * e dividir por 3
 * 
 * @param n1 este é o primeiro parâmetro para o método
 * @param n2 este é o segundo parâmetro para o método
 * @param n3 este é o segundo parâmetro para o método
 * @media é o resultado deste método multiplicado por 3
 */
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("A média dos números é: " + media);

        scanner.close();

    }
}
