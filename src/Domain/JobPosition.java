/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Kevin Aguilar
 */
public class JobPosition {
    
    private String id;
    private String description;
    private String hourlyWage;

    public JobPosition(String id, String description, String hourlyWage) {
        this.id = id;
        this.description = description;
        this.hourlyWage = hourlyWage;
    }
    
    public JobPosition(){
        id = "" ;//ID Trabajo
        description = "" ;
        hourlyWage = "" ;//Salario por hora
    }
    
    //Getters
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getHourlyWage() {
        return hourlyWage;
    }
    
    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHourlyWage(String hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    //To String

    @Override
    public String toString() {
        return "JobPosition{" + "id=" + id + ", description=" + description + ", hourlyWage=" + hourlyWage + '}';
    }
    
}
