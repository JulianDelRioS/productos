/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public class Telefono extends ProductoElectronico {
    private int sigla;
    private int numero;
    private Scanner scanner;

    public Telefono() {
        super();
        this.sigla = sigla;
        this.numero = numero;
        this.scanner = new Scanner(System.in);
    }

    public Telefono(int sigla, int numero, String nombre, String marca, int precio) {
        super(nombre, marca, precio);
        this.sigla = sigla;
        this.numero = numero;
    }

    public int getSigla() {
        return sigla;
    }

    public void setSigla(int sigla) {
        this.sigla = sigla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ProductoElectronico crearProducto() throws ParseException{
        Telefono nuevo = new Telefono();
        System.out.println("nombre");
        nuevo.setNombre(scanner.nextLine());
        System.out.println("marca");
        nuevo.setMarca(scanner.nextLine());
        System.out.println("Precio");
        nuevo.setPrecio(scanner.nextInt());
        System.out.println("Sigla");
        nuevo.setSigla(scanner.nextInt());
        System.out.println("numero");
        nuevo.setNumero(scanner.nextInt());      
        return nuevo;        
        
    }
    
}
