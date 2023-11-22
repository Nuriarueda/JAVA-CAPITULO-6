/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("El programa no parara de imprimir numeros pares hasta que salga el 24");
        int contador=0;
        int numero;
        do{
            numero=(int)(Math.random()*51);
            System.out.print(numero*2+" ");
            contador++;
        }while(numero*2!=24);
        System.out.print("Han salido "+contador+" numeros");
    }
}
