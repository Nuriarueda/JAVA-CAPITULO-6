/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra 4 renglones de caracteres aleatorios");

        for(int j=1;j<=4;j++){
            for(int i=1;i<=40;i++){
                int resultado= (int)(Math.random()*7+1);
                switch(resultado){
                    case 1:
                    System.out.print("*");
                    break;
                    case 2:
                    System.out.print("-");
                    break;
                    case 3:
                    System.out.print("=");
                    break;
                    case 4:
                    System.out.print(".");
                    break;
                    case 5:
                    System.out.print("|");
                    break;
                    case 6:
                    System.out.print("@");
                    break;
                }
                
            }
            System.out.println("");
        }
    }
}
