/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int tirada;
        int suma = 0;
        int media = 0;

        for (int i = 0; i<50; i++){
            tirada=((int)(Math.random()*99)+100);
            System.out.println(tirada + " ");
            suma += tirada;
            media = suma/50;
        }

        System.out.println("La media es " + media);
    }
}
