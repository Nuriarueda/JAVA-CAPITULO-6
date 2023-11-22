public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Este programa lanza monedas");
        for(int i=1;i<=5;i++){
            int monedas= (int)(Math.random()*8+1);        
            int caras=(int)(Math.random()*2+1);
            switch (monedas) {

                case 1:
                System.out.print("1 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 2:
                System.out.print("2 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 3:
                System.out.print("5 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 4:
                System.out.print("10 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 5:
                System.out.print("20 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 6:
                System.out.print("50 cent - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;

                case 7:
                System.out.print("1 euro - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;
                
                case 8:
                System.out.print("2 euros - ");
                if(caras==1){
                    System.out.println("cara");
                }else{
                    System.out.println("cruz");
                }
                break;
            }
        }
    }
}
