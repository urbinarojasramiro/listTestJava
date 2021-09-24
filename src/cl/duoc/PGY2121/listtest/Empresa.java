/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.listtest;

import java.util.List;

/**
 *
 * @author escor
 */
public class Empresa {
    private List<Empleado> empleado;

    public Empresa(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public Empresa() {
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }
    
    
}
