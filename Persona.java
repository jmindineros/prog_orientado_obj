public class Persona {
    private String nombre;
    private Double altura;
    private Double peso;
    private int edad;

    // constructor
    public Persona(String nombre, double altura, double peso, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public void caminar() {
        System.out.println("caminando");
    }

    public String imc() {
        double indice = peso / (altura * altura);
        String msg = "imc: " + indice;
        return msg;
    }

    public String mayorEdad(int edad) {
        String msg = "";
        if (edad >= 18) {
            msg = "mayor de edad";

        } else {
            msg = "menor de edad";
        }
        return msg;
    }
}