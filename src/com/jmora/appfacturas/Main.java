package com.jmora.appfacturas;

import com.jmora.appfacturas.modelo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("10011921");
        cliente.setNombre("Julian Mora");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        Factura factura = new Factura(scanner.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i<5; i++) {
           producto = new Producto();
            System.out.print("Ingrese el producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
            scanner.nextLine();
        }
        System.out.println(factura);
    }
}
