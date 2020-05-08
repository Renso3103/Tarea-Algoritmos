/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author eduardo
 */
public class Empleado {

    private String nombreEmpleado;
    private int edadEmpelado;
    private String idEmpleado;//Cedula
    private double salarioEmpleado;//Mensual

    //Constructor Sobrecargado
    public Empleado(String nombreEmpleado, int edadEmpelado, String idEmpleado, double salarioEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.edadEmpelado = edadEmpelado;
        this.idEmpleado = idEmpleado;
        this.salarioEmpleado = salarioEmpleado;
    }

    //Constructor Default
    public Empleado() {
        nombreEmpleado = "" ;//Nombre
        edadEmpelado = 0;//Edad
        idEmpleado = "";//Cédula
        salarioEmpleado = 0;//Salario Mensual
    }

    //Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getEdadEmpelado() {
        return edadEmpelado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    //Setters
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setEdadEmpelado(int edadEmpelado) {
        this.edadEmpelado = edadEmpelado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", edadEmpelado=" + edadEmpelado + ", idEmpleado=" + idEmpleado + ", salarioEmpleado=" + salarioEmpleado + '}';
    }

}//Fin de la clase
