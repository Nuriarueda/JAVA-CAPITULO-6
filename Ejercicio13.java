/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.print("Este programa tira dos dados y no parara hasta que sus dos numeros sean iguales");
        int dado1;
        int dado2;
        
        do{
            dado1=(int)(Math.random()*6+1);
            System.out.print(dado1+"  ");
            dado2=(int)(Math.random()*6+1);
            System.out.print(dado2+"  ");
            System.out.println("  ");
        }while(dado1!=dado2);
    }
}
