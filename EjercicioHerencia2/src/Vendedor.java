public class Vendedor extends Empleado{

    public double comision;


  // Constructor

    public Vendedor(String nombre, int edad, double pago, double comision){

        super(nombre,edad,pago);

        /*
        this.nombre = nombre;
        this.edad = edad;
        this.pago = pago;*/


        this.comision = comision;

    }


    // metodo


    public void aumentoComision(){

        if(this.comision < .30){
            this.comision = this.comision * 1.2;
        }
    }

}
