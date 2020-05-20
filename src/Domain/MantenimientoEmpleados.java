/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Aguilar
 */
public class MantenimientoEmpleados {

//    public static void insertarEmpleado() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static void suprimirEmpleado() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static void modificarEmpleado() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    String nombreArchivo;
    
    public MantenimientoEmpleados(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public void insertarEmpleado(Empleado e){
        
        Empleado [] empleadosArchivo = getEmpleadosArchivo();
        Empleado emple[] = new Empleado[cuentaRegistroEmpleados()+1];
        
        for(int i=0;i<empleadosArchivo.length;i++){      
             emple[i]= empleadosArchivo[i];          
        }//fin for
        
        emple[emple.length-1] = e;
        
        File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);//para que los datos del archivo sean consistentes
            PrintStream ps = new PrintStream(fos);
            
            Arrays.sort(emple,Comparator);//para mostrarlos en orden alfabetico
            
            for(int i=0;i<emple.length;i++){                
                ps.println(emple[i].getId()+";"+//agregar los datos al archivo
                emple[i].getLastname()+";"+
                emple[i].getFirstname()+";"+
                emple[i].getTitle()+";"+
                emple[i].getBirthday()+";"+
                emple[i].getContractstartDate()+";"+
                emple[i].getContractEndDate()+";"+
                emple[i].getGender()+";"+
                emple[i].getPhone()+";"+
                emple[i].getAddress());              
            }     
        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }           
        
    }//fin insertar empleado
    
    public BufferedReader getBufferedReader(){//para leer el archivo
        
        File archivo = new File(nombreArchivo);
        BufferedReader br = null;
        
        try{
        FileInputStream fis = new FileInputStream(archivo);
        InputStreamReader isr = new InputStreamReader(fis);
        br = new BufferedReader(isr);
        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
        return br;
    }//fin getBufferedReader
    
    public int cuentaRegistroEmpleados(){
        
        int cuentaRegistros=0;
        BufferedReader br = getBufferedReader();
        
        try{
        String RegistroActual = br.readLine();
            while(RegistroActual!=null){//para que no cuente la ultima linea que es un null
                cuentaRegistros++;
            RegistroActual=br.readLine();
            }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
        return cuentaRegistros;
    }//fin cuenta registrosEmpleados
    
    public Empleado [] getEmpleadosArchivo(){
        
        Empleado emple[] = new Empleado[cuentaRegistroEmpleados()];
        BufferedReader br = getBufferedReader();
        int indiceArreglo=0;
        
        try{
            String registroActual = br.readLine();
            while(registroActual!=null){
                String idEmple = "", lastnameEmple = "", firstnameEmple = "", titleEmple = "", birthdayEmple = "", 
                contractStartDateEmple = "", contractEndDateEmple = "", genderEmple = "", phoneEmple = "", addressEmple = "";
                StringTokenizer st = new StringTokenizer(registroActual, ";");
                int controlaTokens=1;
                
                while(st.hasMoreTokens()){
                    if(controlaTokens==1)
                        idEmple = st.nextToken();//crea un id que no se vea en mostrar contactos
                    else if(controlaTokens==2)
                        lastnameEmple = st.nextToken();
                    else if(controlaTokens==3)
                        firstnameEmple = st.nextToken();
                    else if(controlaTokens==4)
                        titleEmple = st.nextToken();
                    else if(controlaTokens==5)
                        birthdayEmple = st.nextToken();
                    else if(controlaTokens==6)
                        contractStartDateEmple = st.nextToken();
                    else if(controlaTokens==7)
                        contractEndDateEmple = st.nextToken();
                    else if(controlaTokens==8)
                        genderEmple = st.nextToken();
                    else if(controlaTokens==9)
                        phoneEmple = st.nextToken();
                    else if(controlaTokens==10)
                        addressEmple = st.nextToken();
                    
                    controlaTokens++;
                }//fin while
                
//                Empleado e = new Empleado(idEmple, lastnameEmple, firstnameEmple, titleEmple, birthdayEmple, contractStartDateEmple, contractEndDateEmple, genderEmple, phoneEmple, addressEmple);
//                emple[indiceArreglo]=e;
                
                indiceArreglo++;
                
               registroActual = br.readLine();
            }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
        return emple;
        
    }//fin getEmpleadosArchivo  
    
    public Empleado[] getEmpleadosParaInsertar(Empleado empleado){//lee el archivo y los hace un arreglo
    
        Empleado emple[] = new Empleado[cuentaRegistroEmpleados()];
        BufferedReader br = getBufferedReader();
        int indiceArreglo=0;
        
        try{
            String registroActual = br.readLine();
            while(registroActual!=null){
                String idEmple = "", lastnameEmple = "", firstnameEmple = "", titleEmple = "", birthdayEmple = "", 
                contractStartDateEmple = "", contractEndDateEmple = "", genderEmple = "", phoneEmple = "", addressEmple = "";
                StringTokenizer st = new StringTokenizer(registroActual, ";");
                int controlaTokens=1;
                
                while(st.hasMoreTokens()){
                    if(controlaTokens==1)
                        idEmple = st.nextToken();//crea un id que no se vea en mostrar contactos
                    else if(controlaTokens==2)
                        lastnameEmple = st.nextToken();
                    else if(controlaTokens==3)
                        firstnameEmple = st.nextToken();
                    else if(controlaTokens==4)
                        titleEmple = st.nextToken();
                    else if(controlaTokens==5)
                        birthdayEmple = st.nextToken();
                    else if(controlaTokens==6)
                        contractStartDateEmple = st.nextToken();
                    else if(controlaTokens==7)
                        contractEndDateEmple = st.nextToken();
                    else if(controlaTokens==8)
                        genderEmple = st.nextToken();
                    else if(controlaTokens==9)
                        phoneEmple = st.nextToken();
                    else if(controlaTokens==10)
                        addressEmple = st.nextToken();
                    
                    controlaTokens++;
                }//fin while
                
//                if(!empleado.getId().equals(idEmple)){
////                    Empleado e = new Empleado(idEmple, lastnameEmple, firstnameEmple, titleEmple, birthdayEmple, contractStartDateEmple, contractEndDateEmple, genderEmple, phoneEmple, addressEmple);
//                    emple[indiceArreglo]=e;
//                    indiceArreglo++;
//                }else {
//                }
                
                registroActual = br.readLine();
            }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        return emple;
    }//fin getEmpleadosParaInsertar
    
    
    public void suprimirEmpleado(Empleado e){
        
        Empleado [] empleadosArchivo = getEmpleadosParaInsertar(e);
        File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);
            PrintStream ps = new PrintStream(fos);
            
            Arrays.sort(empleadosArchivo,Comparator);//mostrar en orden alfabetico
            for(int i=0;i<empleadosArchivo.length;i++){  
                if(empleadosArchivo[i]!=null){ 
                    ps.println(empleadosArchivo[i].getId()+";"+//crea un id para darle un atributo de como borrar el contacto
                    empleadosArchivo[i].getLastname()+";"+
                    empleadosArchivo[i].getFirstname()+";"+
                    empleadosArchivo[i].getTitle()+";"+
                    empleadosArchivo[i].getBirthday()+";"+
                    empleadosArchivo[i].getContractstartDate()+";"+
                    empleadosArchivo[i].getContractEndDate()+";"+
                    empleadosArchivo[i].getGender()+";"+
                    empleadosArchivo[i].getPhone()+";"+
                    empleadosArchivo[i].getAddress());
                }
            }                                  
        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }
                
    }//fin SuprimirEmpleado
    
    
    public void modificarEmpleado(Empleado e ){
        
        Empleado[] empleadosArchivo = getEmpleadosArchivo();
        
        File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);//para que el archivo sea persistente
            PrintStream ps = new PrintStream(fos);
            Arrays.sort(empleadosArchivo,Comparator);//para darle un atributo de orden alfabetico
            for(int i=0;i<empleadosArchivo.length;i++){  
                 if(empleadosArchivo[i].getId().equals(e.getId())){
                    empleadosArchivo[i]= e;
                 }
                 
                ps.println(empleadosArchivo[i].getId()+";"+
                empleadosArchivo[i].getLastname()+";"+
                empleadosArchivo[i].getFirstname()+";"+
                empleadosArchivo[i].getTitle()+";"+
                empleadosArchivo[i].getBirthday()+";"+
                empleadosArchivo[i].getContractstartDate()+";"+
                empleadosArchivo[i].getContractEndDate()+";"+
                empleadosArchivo[i].getGender()+";"+
                empleadosArchivo[i].getPhone()+";"+
                empleadosArchivo[i].getAddress());
            }
        } 
        catch(FileNotFoundException fnfe){ 
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }
            
    }//Fin modificarEmpleado
    
    
       //Ordena el array de contactos
    public static Comparator<Empleado> Comparator  = new Comparator<Empleado>() {
	    public int compare(Empleado e1, Empleado e2) {
	    	
                String empleado1 = e1.getFirstname().toUpperCase();
                String empleado2 = e2.getFirstname().toUpperCase();

                //ascending order
                return empleado1.compareTo(empleado2);
	    }
    };    
}
