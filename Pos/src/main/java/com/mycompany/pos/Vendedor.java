package com.mycompany.pos;

import java.util.LinkedList;

public class Vendedor{
    
   static LinkedList<Vendedor> cuentasVendedores = new LinkedList<Vendedor>();

    public static LinkedList<Vendedor> getCuentasVendedores() {
        return cuentasVendedores;
    }

    public static void setCuentasVendedores(LinkedList<Vendedor> cuentasVendedores) {
        Vendedor.cuentasVendedores = cuentasVendedores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    private int codigo,caja,ventas;
    private String nombre,genero, pass;

    public Vendedor(int codigo, int caja,String nombre, String genero, String pass) {
        this.codigo = codigo;
        this.caja = caja;
        this.nombre = nombre;
        this.genero = genero;
        this.pass = pass;
    }

    

    
}
