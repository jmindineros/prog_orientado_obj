public class Cal {
    private int valor2;
    private int valor1;


    // constructos
    public Cal(int valor1, int valor2) {
        this.valor2 = valor2;
        this.valor1 = valor1;


    }
    public int suma(){
        int suma= this.valor1 + this.valor2;
        return suma;
    }
    public int resta(){
        int resta= this.valor1 - this.valor2;
        return resta;
    }
    public int multiplicacion(){
        int multiplicacion= this.valor1 * this.valor2;
        return multiplicacion;
    }
    public double division(){
        Double division= (double) valor1 / valor2;
        return division;
    }
    public double potencia(){

        return Math.pow(valor2, valor1);
    }

}