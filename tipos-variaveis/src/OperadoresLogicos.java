public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        // se a condicao1 e(&&) condicao2 forem verdadeiras, atraves da variaveis
        // boleanas
        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        // operador de barra dupla vertical (||) é o operador lógico OR (ou).
        if (condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("Fim");

    }

}
