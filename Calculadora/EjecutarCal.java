import java.util.Scanner;

public class EjecutarCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String escoger;

        System.out.println("bienvenido a calculadora");
        System.out.println(" ");
        System.out.println("ingresa los  dos valores y escoge la operacion");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ingresa el primer valor: ");
        int op1 = sc.nextInt();
        System.out.println("ingresa el segundo valor: ");
        int op2 = sc.nextInt();

        Cal calculadora = new Cal(op1, op2);

        System.out.println("escoge tu operacion");
        System.out.println("suma = s");
        System.out.println("resta = r");
        System.out.println("division = d");
        System.out.println("multiplicacion = m");
        System.out.println("potencia = p");
        sc.nextLine();
        escoger = sc.nextLine();

        if (escoger.equalsIgnoreCase("s")) {
            System.out.println("el resultado de la suma de " + op1 + " y " + op2 + " es: " + calculadora.suma());
        } else if (escoger.equalsIgnoreCase("r")) {
            System.out.println("el resultado de la resta de " + op1 + " y " + op2 + " es: " + calculadora.resta());
        } else if (escoger.equalsIgnoreCase("d")) {
            System.out.println("el resultado de la division de " + op1 + " y " + op2 + " es: " + calculadora.resta());
        } else if (escoger.equalsIgnoreCase("m")) {
            System.out.println("el resultado de la multiplicacion de " + op1 + " y " + op2 + " es: "
                    + calculadora.multiplicacion());
        } else if (escoger.equalsIgnoreCase("p")) {
            System.out
                    .println("el resultado de la potencia de " + op1 + " y " + op2 + " es: " + calculadora.potencia());
        }

    }
}