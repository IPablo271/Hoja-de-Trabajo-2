
import java.util.Scanner;
import java.io.FileNotFoundException;
class Main{
     public static void main(String[] args) throws FileNotFoundException{
        calculadora c =new calculadora();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al programa que lo ayudara a calcular la expresion ingresada en su archivo");
        System.out.println("1. Ingresar arhivo para dar resultado");
        System.out.println("2. Terminar programa");
        boolean run2=true;
        while(run2){
            int opc=0;
            boolean run = true;
            while(run){
                try{
                    System.out.println("Ingrese la ocion que desee");
                    opc=scan.nextInt();
                    if(opc<1 || opc>2){
                        System.out.println("Porfavor ingrese un numero valido");
                    }
                    else{
                    run =false;}
                }catch(Exception e){
                    System.out.println("Ingrese solo numeros unicamente");
                   
                }
            }
            if(opc==1){
                archivos arch=new archivos();
                System.out.println("Ingrese el camino para realizar su operacion: ");
                scan.nextLine();
                String camino=scan.nextLine();
                String a=arch.leer(camino);
                System.out.println(c.calculo(a));
                System.out.println(c.evaluate("+"));
                
                break;
            }
            if(opc==2){
                run2=false;
            }
        }
        


        


        
      
        

        
        

    }
}