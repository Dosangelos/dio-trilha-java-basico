public class OperadoresRelacionais {

    public static void main(String[] args) {
        String nomeUm = "ANGELO";
        String nomeDois = new String("ANGELO");
        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois)); // usar para comparar objeto, usar equals

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira");

        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior a numeroDois? " + simNao);
    }

}