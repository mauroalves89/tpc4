import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Random
        Random r = new Random();

        // Gera um número inteiro aleatório entre 0 e 10
        int numInt = r.nextInt(11);
        System.out.println("Número inteiro aleatório entre 0 e 10: " + numInt);

        // Gera um número de ponto flutuante aleatório entre 0.0 e 1.0
        double numDouble = r.nextDouble();
        System.out.println("Número de ponto flutuante aleatório entre 0.0 e 1.0: " + numDouble);

        // Gera um valor booleano aleatório
        boolean bool = r.nextBoolean();
        System.out.println("Valor booleano aleatório: " + bool);

    }
}