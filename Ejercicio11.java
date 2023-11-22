/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra 20 notas");
        
        int contSuspenso=0;
        int contSuficiente=0;
        int contBien=0;
        int contNotable=0;
        int contSobresaliente=0;
         for(int i=1;i<=20;i++){
            int resultado= (int)(Math.random()*5+1);
            switch(resultado){
                case 1:
                    System.out.print("Suspenso  ");
                    contSuspenso++;
                    break;
                case 2:
                    System.out.print("Suficiente  ");
                    contSuficiente++;
                    break;
                case 3:
                    System.out.print("Bien  ");
                    contBien++;
                    break;
                case 4:
                    System.out.print("Notable  ");
                    contNotable++;
                    break;
                case 5:
                    System.out.print("Sobresaliente  ");
                    contSobresaliente++;
                    break;
            }
                
            }
        System.out.println("");
        System.out.println("Hay "+contSuspenso+" suspensos");
        System.out.println("Hay "+contSuficiente+" suficientes");
        System.out.println("Hay "+contBien+" bien");
        System.out.println("Hay "+contNotable+" notables");
        System.out.println("Hay "+contSobresaliente+" sobresalientes");
    }
}
