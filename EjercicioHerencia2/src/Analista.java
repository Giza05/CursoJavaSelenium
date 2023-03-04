public class Analista extends Empleado{



    public Analista (String nombre, int edad, double pago){

        //para reducir codigo se  usa el super y se quita los this y el costructor

        super(nombre,edad,pago);

    }

    // MEtodo

    public double getBonoAnual(){
    return this.pago * .05;

    }

}
