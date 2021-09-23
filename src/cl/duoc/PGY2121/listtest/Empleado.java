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
public class Empleado {
    private String nombre;
    private Puesto puesto;

    public Empleado(String nombre, Puesto puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    
}
