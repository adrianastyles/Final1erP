import java.util.*;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Imprimir lista invertida");
        System.out.println("2. Imprimir lista sin números repetidos");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nLista invertida:");
                for (int i = numeros.size() - 1; i >= 0; i--) {
                    System.out.print(numeros.get(i) + " ");
                }
                break;

            case 2:
                System.out.println("\nLista sin números repetidos:");
                Set<Integer> sinRepetidos = new LinkedHashSet<>(numeros);
                for (int num : sinRepetidos) {
                    System.out.print(num + " ");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}