public class Ejecutar {
    public static void main(String[] args) {
        Persona objp1 =new Persona("pipe", 1.80, 80, 22);
        objp1.caminar();
        String respuesta = objp1.imc();
        System.out.println(respuesta);
        System.out.println(objp1.mayorEdad(17));
    }
}
