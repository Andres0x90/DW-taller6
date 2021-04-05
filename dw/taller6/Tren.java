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
public class Tren 
{
    private String id, marca, modelo;
    int año;
    boolean altaVelocidad;

    public Tren(String id, String marca, String modelo, int año) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.altaVelocidad = false;
    }

    public String comprobarModelo()
    {
        if (this.año >=2022)
            return "Modelo futuro";
        else if (this.año == 2021)
            return "Ultimo modelo";
        else if (this.año == 2020)
            return "Modelo nuevo";
        else if (this.año >= 2017)
            return "Modelo reciente";
        else
            return "Modelo antiguo";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isAltaVelocidad() {
        return altaVelocidad;
    }

    public void setAltaVelocidad(boolean altaVelocidad) {
        this.altaVelocidad = altaVelocidad;
    }
    
    
}
