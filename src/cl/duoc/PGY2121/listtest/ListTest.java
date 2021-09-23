/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author escor
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Puesto puesto = new Puesto("Desarrollador Junior", 450000);
        List<Empleado> empresaList = new ArrayList<Empleado>(); 
        System.out.println("Ingrese la cantidad de empleados: ");
        int empleados = s.nextInt();
        s.nextLine();
        for (int i = 0; i < empleados; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i +1));
            String nombre = s.nextLine();
            Empleado emp = new Empleado(nombre,puesto);
            empresaList.add(emp);
        }
        
        Empresa empresa = new Empresa(empresaList);
        //for que se enfoca en el recorrido del objeto dentro de la lista
        System.out.println("Metodo 1");
        for (Empleado ep: empresa.getEmpleado()) {
            System.out.println(ep.getNombre());
        }
        
        empresaList.remove(0);
        System.out.println("Metodo 2");
        //for que se enfoca en el index de los elementos de la lista
        for (int i = 0; i < empresaList.size(); i++) {
            System.out.println(empresaList.get(i).getNombre());
            
        }
        
        
        System.out.println("Ingrese un nuevo trabajador");
        String nuevo = s.nextLine();
        Empleado emp2 = new Empleado(nuevo, puesto);
        if(empresaList.contains(emp2)){
        } else {
            System.out.println("Si existe");
        }
        
        if(empresaList.isEmpty()){
            System.out.println("Lista Vacía");
        }
        
        System.out.println("Limpieza de la lista");
        empresaList.clear();
        for (int i = 0; i < empresaList.size(); i++) {
            System.out.println(empresaList.get(i).getNombre());
            
        }
        if(empresaList.isEmpty()){
            System.out.println("Lista Vacía");
        }
    }
    
}
