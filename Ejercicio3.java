/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */
public class Ejercicio3 {
    public static void main(String[] args) {
        

        int numCarta = (int)(Math.random()*11) + 1; 

        switch(numCarta) {
            case 1:
                System.out.print("As");
                break;
            case 2:
                System.out.print("2");
            break;
            case 3:
                System.out.print("3"); 
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("Sota");
                break;
            case 9:
                System.out.print("Caballo");
                break;
            case 10:
                System.out.print("Rey");
                break;
        }  

        System.out.print(" de ");

        int numPalo = (int)(Math.random()*4) + 1; 

        switch (numPalo) {
            case 1:
                System.out.print("bastos");
                break;
            case 2:
                System.out.print("oro");
                break;
            case 3:
                System.out.print("copas");
                break;
            case 4:
                System.out.print("espadas");
                break;
        }
    }
}
