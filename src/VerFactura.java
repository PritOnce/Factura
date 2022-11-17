public class VerFactura {
    public static void main(String[] args) {
        Factura factura1=new Factura("L35");
        Factura factura2=new Factura("N96");

        //Emitir factura
        factura1.emision(150);
        factura2.emision(100);

        //Mostrar cantidad de factura
        System.out.println(factura1);
        System.out.println(factura2);
    }
}
