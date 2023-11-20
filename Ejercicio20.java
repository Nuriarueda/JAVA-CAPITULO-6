import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = sc.nextInt();
        int cantidad = (int)(Math.random()*capacidad+1);
        for (int i = capacidad; i >= 1; i--) {
        if (i <= cantidad) {
            System.out.println("===");
        } else {
            System.out.println("   ");
        }

        }
        System.out.println("**");
        System.out.println("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+cantidad+" litros de agua");
        sc.close();
    }
}
