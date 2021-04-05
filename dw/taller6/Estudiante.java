/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dw.taller6;

/**
 *
 * @author Andres
 */
public class Estudiante 
{
    private String cedula, nombre, apellidos, direccion;
    float valorMatricula;
    boolean becado;

    public Estudiante(String cedula, String nombre, String apellidos, String direccion) 
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.becado = false;
    }
    
    public void asignarMatricula(float valor)
    {
        if (becado)
            setValorMatricula(valor * (float)(0.1));
        else
            setValorMatricula(valor);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public float getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(float valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
    
}
