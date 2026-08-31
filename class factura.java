class factura{
    String numeroFactura;
    String cliente;
    double montoNeto;

public factura (String numeroFactura, String cliente, double montoNeto){
    this.numeroFactura = numeroFactura;
    this.cliente = cliente;
    if(montoNeto < 0){
        System.out.println("El monot debe ser mayor a cero.");
    }
    this.montoNeto = montoNeto;
}

void calcularTotalConIva(){
double montoIva = this.montoNeto * 1.21;
System.out.println("---------------------------------------");
System.out.println("Precio final con IVA incluido: " + montoIva);
}

void mostrarDetalles(){
    System.out.println("-----------------------------------");
    System.out.println("Numero de factua: " + numeroFactura);
    System.out.println("Nombre del cliente: " + cliente);
    System.out.println("-----------------------------------");
}

public static void main(String[] args) {
    factura f1 = new factura("00-2034", "Juan Perez", 1500);
    f1.calcularTotalConIva();
    f1.mostrarDetalles();
}
}