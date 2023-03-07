package com.mycompany.pos;

import java.util.LinkedList;

public class Sucursal {

    private int codigo, telefono;
    private String nombre, direccion, correo;

    static LinkedList<Sucursal> cuentasSucursales = new LinkedList<Sucursal>();

    public Sucursal(int codigo, String nombre, String direccion, String correo, int telefono) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
