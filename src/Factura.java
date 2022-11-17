public class Factura {
    private String cod_factura;
    private double cantidad;

    //Creamos constructor
    public Factura(){

    }
    //Constructor objeto
    public Factura(Factura f){
        this.cod_factura=f.cod_factura;
        this.cantidad=f.cantidad;
    }

    public Factura(String cod_factura){
        this.cod_factura=cod_factura;
        this.cantidad=0;
    }
    public Factura (String cod_factura, double cantidad){
        this.cod_factura=cod_factura;
        if(cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad=cantidad;
        }
    }
    //metodos o funciones
    public String getCod_factura (){
        return cod_factura;
    }
    public void setCod_factura (String cod_factura){this.cod_factura=cod_factura;}
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }

    public void emision (double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad+cantidad*0.21;
        }
    }
    @Override
    public String toString(){ return " El cliente con codigo " +cod_factura+ " tiene una factura de " +cantidad;}
}
