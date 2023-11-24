import java.util.Scanner;

public class EjercicioExamen {
  public static void numeroCarta(int n){
    String cartaString = "";
    double NCarta;
    switch (n/10) {
        case 0:
          cartaString = "As";
          NCarta = 1;
          break;
          
        case 1:
          cartaString = "2";
          NCarta = 2;
          break;
          
        case 2:
          cartaString = "3";
          NCarta = 3;
          break;
          
        case 3:
          cartaString = "4";
          NCarta = 4;
          break;
        
        case 4:
          cartaString = "5";
          NCarta = 5;
          break;

        case 5:
          cartaString = "6";
          NCarta = 6;
          break;

        case 6:
          cartaString = "7";
          NCarta = 7;
          break;

        case 7:
          cartaString = "Sota";
          NCarta = 0.5;
          break;

        case 8:
          cartaString = "Caballo";
          NCarta = 0.5;
          break;

        case 9:
          cartaString = "Rey";
          NCarta = 0.5;
          break;
      
        default:
          break;
      }
  }
  public static void palos(int n){
    String cartaString = "";
    switch (n/10) {
        case 0:
          cartaString += " de oros";
          break;
          
        case 1:
          cartaString += " de copas";
          break;
          
        case 2:
          cartaString += " de espadas";
          break;
          
        case 3:
          cartaString += " de bastos";
          break;
      
        default:
          break;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String terminar = "";
    double NCarta =-1;
      double sumaCarta = 0;
      System.out.println("TURNO DEL JUGADOR");
    do {
      String cartaString = "";
      int carta = (int)(Math.random()*40);
      sumaCarta += NCarta;
      
      System.out.printf(cartaString+"\nSu puntuacion ahora mismo es de: %.1f\n",sumaCarta);
      System.out.print("Desea plantarse? ");
      terminar = sc.next();
      System.out.println("TURNO DE LA CPU");

    } while (terminar.equals("no") || terminar.equals("No"));
  }
}
