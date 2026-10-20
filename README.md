Este programa está diseñado para modelar y gestionar la emisión y el cálculo impositivo de una **factura** comercial utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Factura`:** Modela un comprobante comercial conteniendo sus atributos principales: el número de identificación (`numeroFactura`), el nombre del cliente (`cliente`) y el monto neto sin impuestos (`montoNeto`).
* **Incorpora constructor y validaciones:** Utiliza un constructor completo junto con validaciones estrictas para asegurar que el monto neto inicial nunca admita valores negativos.
* **Calcula el total con impuestos (`calcularTotalConIVA`):** Implementa un método que procesa y retorna el monto neto incrementado automáticamente en un **21%** en concepto de Impuesto al Valor Agregado (IVA).
* **Ejecuta la prueba (`main`):** Crea un objeto de tipo `Factura` asignándole un valor de prueba específico, invoca el cálculo impositivo y muestra el detalle completo del resultado por consola.
