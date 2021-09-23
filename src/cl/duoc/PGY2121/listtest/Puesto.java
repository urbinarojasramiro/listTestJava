/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.listtest;

/**
 *
 * @author escor
 */
public class Puesto {
    private String nombrePuesto;
    private long sueldo;

    public Puesto(String nombrePuesto, long sueldo) {
        this.nombrePuesto = nombrePuesto;
        this.sueldo = sueldo;
    }

    public Puesto() {
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
