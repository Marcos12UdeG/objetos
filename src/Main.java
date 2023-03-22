import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1,n2,suma;
        System.out.println("INGRESAR 1ER NUMERO");
        n1 = entrada.nextInt();
        System.out.println("INGRESAR 2DO NUMERO");
        n2 = entrada.nextInt();

        suma = n1+n2;

        System.out.println("LA SUMA ES " +suma);
    }
}