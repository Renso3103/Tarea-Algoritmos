/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Empleado;
import TDA.SinglyLinkedList;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author eduardo
 */
public class EmployeeMaintenanceData {

    File EmployeeFile = new File(Util.ControlDeEmpladosUtility.EMPLOYEEFILE);
    SinglyLinkedList listEmployee = new SinglyLinkedList();

    //Constructor
    public EmployeeMaintenanceData() {
    }

    /**
     *
     * @param emp recibe un objeto tipo empleado
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    //Serializable
    public void setEmployeeOnFile(Empleado emp) throws FileNotFoundException, IOException, ClassNotFoundException {

//        File EmployeeFile = new File(Util.ControlDeEmpladosUtility.EMPLOYEEFILE);
//        SinglyLinkedList listEmployee = new SinglyLinkedList();

//        if (EmployeeFile.exists()) {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(EmployeeFile));
//            Object aux = objectInputStream.readObject();
//            //listEmployee = (SinglyLinkedList) aux;
//            listEmployee.addInSortedList(aux);
//            objectInputStream.close();
//        }//Fin if
//        listEmployee.addInSortedList(emp);
//
//        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(EmployeeFile));
//        output.writeUnshared(listEmployee);
//        output.close();
//
//        listEmployee.toString();
        while (!this.EmployeeFile.exists()) {
            this.listEmployee.addInSortedList(emp);

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(this.EmployeeFile));
            output.writeUnshared(this.listEmployee);
            output.close();

            this.listEmployee.toString();
        }
        
        ObjectInputStream InputStream = new ObjectInputStream(new FileInputStream(this.EmployeeFile));
        //Object aux = InputStream.readObject();
        
        //listEmployee = (SinglyLinkedList) aux;
        //this.listEmployee.addInSortedList(aux);

//        this.listEmployee.addInSortedList(emp);
        this.listEmployee = (SinglyLinkedList) InputStream.readObject();
        
        InputStream.close();
        this.listEmployee.toString();

    }//Fin setEmployeeOnFile

    //Muestra todos los empleados en la lista
    public SinglyLinkedList findEmployee() throws FileNotFoundException, IOException, ClassNotFoundException {

//        File miArchivo = new File(Util.ControlDeEmpladosUtility.EMPLOYEEFILE);
//        SinglyLinkedList employeeList = new SinglyLinkedList();

        if (this.EmployeeFile.exists()) {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.EmployeeFile));
            Object aux = objectInputStream.readObject();
            this.listEmployee = (SinglyLinkedList) aux;
            objectInputStream.close();
            return listEmployee;

        }//Fin if

        return null;

    }//leerCanalesSerial

}//Fin de la clase EmployeeMaintenanceData
