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
public abstract class ProductoElectronico {
    private String nombre;
    private String marca;
    private int precio;
    private Scanner scanner;
    public ProductoElectronico(){
        this.nombre = "";
        this.marca = "";
        this.precio = 0;
        this.scanner = new Scanner(System.in);
    }

    public ProductoElectronico(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public abstract ProductoElectronico crearProducto() throws ParseException;        
    
    
}
