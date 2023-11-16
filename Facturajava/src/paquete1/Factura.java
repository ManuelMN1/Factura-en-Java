/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del comprador
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        // Calcular el descuento
        double porcentajeDescuento = 0;

        if (montoCompra >= 200000) {
            porcentajeDescuento = 0.15;
        } else if (montoCompra >= 50000) {
            porcentajeDescuento = 0.02;
        } else if (montoCompra >= 20000) {
            porcentajeDescuento = 0.015;
        }

        // Calcular el valor del descuento
        double valorDescuento = montoCompra * porcentajeDescuento;

        // Calcular el total a pagar
        double totalPagar = montoCompra - valorDescuento;

        // Imprimir la factura
        System.out.println("\n----- Factura -----");
        System.out.println("Nombre del comprador: " + nombre);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("Gracias por su compra, " + nombre + "!");
    }
}
