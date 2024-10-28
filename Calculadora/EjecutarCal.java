import java.util.Scanner;

public class EjecutarCal{
public static void main(String[] args) {
 
    Scanner sc = new Scanner (System.in);
    EjecutarCal Cal = new EjecutarCal();

    String escoger; 

    System.out.println("bienvenido a calculadora");
    System.out.println(" ");
    System.out.println("ingresa los  dos valores y escoge la operacion");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("ingresa el primer valor: ");
    valor1=sc.nextDouble();
    System.out.println("ingresa el segundo valor: ");
    valor2=sc.nextDouble();

    System.out.println("escoge tu operacion");
    System.out.println("suma = s");   
    System.out.println("resta = r");
    System.out.println("division = d");
    System.out.println("multiplicacion = m");
    System.out.println("potencia = p");
    escoger=sc.nextInt();

    if (escoger.equals("s")){
        Cal.suma();

    }




}
}