/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import static Domain.MantenimientoEmpleados.Comparator;
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
public class MantenimientoPuestos {
    
    String nombreArchivo;
    
    public MantenimientoPuestos(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public void insertarPerfildePuestos(JobPosition jP){
        
        JobPosition [] puestoArchivo = getPuestoArchivo();
        JobPosition job[] = new JobPosition[cuentaRegistroPuestos()+1];
        
        for(int i=0;i<puestoArchivo.length;i++){      
             job[i]= puestoArchivo[i];          
        }//fin for
        
        job[job.length-1] = jP;
        
        File archivo = new File(nombreArchivo);
         
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);//para que los datos del archivo sean consistentes
            PrintStream ps = new PrintStream(fos);
            
            Arrays.sort(job,Comparator);//para mostrarlos en orden alfabetico
            
            for(int i=0;i<job.length;i++){                
                ps.println(job[i].getId()+";"+//agregar los datos al archivo
                job[i].getId()+";"+
                job[i].getDescription()+";"+
                job[i].getHourlyWage());           
            }     
        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }           
         
    }//Fin insertarPerfildePuestos
    
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
    
    public int cuentaRegistroPuestos(){
        
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
    
    public JobPosition [] getPuestoArchivo(){
        
        JobPosition job[] = new JobPosition[cuentaRegistroPuestos()];
        BufferedReader br = getBufferedReader();
        int indiceArreglo=0;
        
        try{
            String registroActual = br.readLine();
            while(registroActual!=null){
                String idPuesto = "", descriptionPuesto = "", hourlyWagePuesto = "";
                StringTokenizer st = new StringTokenizer(registroActual, ";");
                int controlaTokens=1;
                        
                while(st.hasMoreTokens()){
                    if(controlaTokens==1)
                        idPuesto = st.nextToken();//crea un id que no se vea en mostrar contactos
                    else if(controlaTokens==2)
                        descriptionPuesto = st.nextToken();
                    else if(controlaTokens==3)
                        hourlyWagePuesto = st.nextToken();
                    controlaTokens++;
                }
                
                JobPosition jP = new JobPosition(idPuesto, descriptionPuesto, hourlyWagePuesto);
                job[indiceArreglo] = jP;
                
                indiceArreglo++;
                
                registroActual = br.readLine();
            }
        }catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
        return job;
    }//Fin getPuestoArchivo
    
    
    public JobPosition [] getPuestoParaInsertar(JobPosition jobposition){
        
        JobPosition job[] = new JobPosition[cuentaRegistroPuestos()];
        BufferedReader br = getBufferedReader();
        int indiceArreglo=0;
        
        try{
            String registroActual = br.readLine();
            while(registroActual!=null){
                String idPuesto = "", descriptionPuesto = "", hourlyWagePuesto = "";
                StringTokenizer st = new StringTokenizer(registroActual, ";");
                int controlaTokens=1;
                        
                while(st.hasMoreTokens()){
                    if(controlaTokens==1)
                        idPuesto = st.nextToken();//crea un id que no se vea en mostrar contactos
                    else if(controlaTokens==2)
                        descriptionPuesto = st.nextToken();
                    else if(controlaTokens==3)
                        hourlyWagePuesto = st.nextToken();
                    controlaTokens++;
                }//fin while
        
                if(!jobposition.getId().equals(idPuesto)){
                    JobPosition jP = new JobPosition(idPuesto, descriptionPuesto, hourlyWagePuesto);
                    job[indiceArreglo]=jP;
                    indiceArreglo++;
                }else{
                }
                registroActual = br.readLine();
            }
        }catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        return job;
    }//fin getPuestoParaInsertar
            
    
    public void suprimirPuesto(JobPosition jP){
        
        JobPosition [] puestoArchivo = getPuestoParaInsertar(jP);
        File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);
            PrintStream ps = new PrintStream(fos);
            
            Arrays.sort(puestoArchivo,Comparator);//mostrar en orden alfabetico
            
            for(int i=0;i<puestoArchivo.length;i++){  
                if(puestoArchivo[i]!=null){ 
                    ps.println(puestoArchivo[i].getId()+";"+//crea un id para darle un atributo de como borrar el contacto
                    puestoArchivo[i].getDescription()+";"+
                    puestoArchivo[i].getHourlyWage());
                }
            }
        }catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }
    }//fin suprimirPuesto
    
    
    public void modificarPuesto(JobPosition jP){
        
        JobPosition[] puestoArchivo = getPuestoArchivo();
        
        File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter writer = new PrintWriter(nombreArchivo);
            writer.print("");
            writer.close();
            
            archivo = new File (nombreArchivo);
            
            FileOutputStream fos = new FileOutputStream(archivo, true);//para que el archivo sea persistente
            PrintStream ps = new PrintStream(fos);
            Arrays.sort(puestoArchivo,Comparator);//para darle un atributo de orden alfabetico
            for(int i=0;i<puestoArchivo.length;i++){  
                if(puestoArchivo[i].getId().equals(jP.getId())){
                    puestoArchivo[i]= jP;
                }
                ps.println(puestoArchivo[i].getId()+";"+
                puestoArchivo[i].getDescription()+";"+
                puestoArchivo[i].getHourlyWage());
            }
        } catch(FileNotFoundException fnfe){ 
            JOptionPane.showMessageDialog(null, "Problemas al escribir el archivo");
        }
        
    }//fin modificarPuesto
    
    //Ordena el array de contactos
    public static Comparator<JobPosition> Comparator  = new Comparator<JobPosition>() {
	    public int compare(JobPosition j1, JobPosition j2) {
	    	
                String jobPosition1 = j1.getDescription().toUpperCase();
                String jobPosition2 = j2.getDescription().toUpperCase();

                //ascending order
                return jobPosition1.compareTo(jobPosition2);
	    }
    };    
    
}
