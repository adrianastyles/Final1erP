import java.util.Scanner;

public class SumarDigitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número de tres digitos: ");
            numero = scanner.nextInt();
        }

        while (numero < 100 || numero > 999);

        int digito1 = numero / 100;
        int digito2 = (numero / 10) % 10;
        int digito3 = numero % 10;

        int suma = digito1 + digito2 + digito3;

        System.out.println("La suma de la cantidad ingresada es: " + suma);
    }

}
