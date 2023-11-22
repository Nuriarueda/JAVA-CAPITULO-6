/* Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”. */
public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Este programa es una maquina tragaperras");

        int diamantes=0;
        int corazon=0;
        int herradura=0;
        int campana=0;
        int limon=0;
        for(int i=1;i<=3;i++){

                int figuras= (int)(Math.random()*5+1);
                
                switch(figuras){
                    case 1:
                    System.out.print("diamantes ");
                    diamantes++;
                    break;
                    case 2:
                    System.out.print("corazon ");
                    corazon++;
                    break;
                    case 3:
                    System.out.print("herradura ");
                    herradura++;
                    break;
                    case 4:
                    System.out.print("campana ");
                    campana++;
                    break;
                    case 5:
                    System.out.print("limon ");
                    limon++;
                    break;
                }
            }
            System.out.println("");
        if(diamantes==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        }    
        if(corazon==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } 
        if(herradura==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } 
        if(campana==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } 
        if(limon==3){
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } 
        if(diamantes==2){
            System.out.print("Bien, ha recuperado su moneda");
        } 
        if(corazon==2){
            System.out.print("Bien, ha recuperado su moneda");
        } 
        if(herradura==2){
            System.out.print("Bien, ha recuperado su moneda");
        } 
        if(campana==2){
            System.out.print("Bien, ha recuperado su moneda");
        } 
        if(limon==2){
            System.out.print("Bien, ha recuperado su moneda");
        }
        if(corazon==1 && diamantes==1 && herradura==1 ){
            System.out.print("Lo siento, ha perdido");
        }
        if(corazon==1 && diamantes==1 && limon==1 ){
            System.out.print("Lo siento, ha perdido");
        }  
        if(corazon==1 && diamantes==1 && campana==1 ){
            System.out.print("Lo siento, ha perdido");
        } 
        if(corazon==1 && limon==1 && herradura==1 ){
            System.out.print("Lo siento, ha perdido");
        } 
        if(corazon==1 && limon==1 && campana==1 ){
            System.out.print("Lo siento, ha perdido");
        } 
    }
}
