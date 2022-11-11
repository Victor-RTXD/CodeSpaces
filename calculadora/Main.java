package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Selecciona la opcion deseada");
        do {
            System.out.println("1: Carga Eléctrica y Campo Eléctrico");
            System.out.println("2: Corrientes Eléctricas , Resistencia y Fuerza Electromotriz");
            System.out.println("3: Circuitos en Corriente Directa");
            System.out.println("4: Ley de Gauss");
            System.out.println("5: Potencial Eléctrico");
            System.out.println("0: Salir");

            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("funciona");
                break;
                case 2:
                    System.out.println();
                break;
                case 3:
                    System.out.println();
                break;
                case 4:
                    System.out.println();
                break;
                case 5:
                    System.out.println();
                break;
                default:
                    System.out.println();
                break;
            }
        } while (i != 0);
    }
}
