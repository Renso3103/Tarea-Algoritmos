/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Empleado {
    
    private String id;
    private String lastname;
    private String firstname;
    private String title;
    private String birthday;
    private String contractstartDate;
    private String contractEndDate;
    private String gender;
    private String phone;
    private String address;
    
    //Constructor Sobrecargado

    public Empleado(String id, String lastname, String firstname, String title, String birthday, String contractstartDate, String contractEndDate, String gender, String phone, String address) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.birthday = birthday;
        this.contractstartDate = contractstartDate;
        this.contractEndDate = contractEndDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    //Constructor Default
    public Empleado() {
        id = "" ;//Id empleado
        lastname = "" ;//Apellido
        firstname = "" ;//Nombre
        title = "" ;//Profesión
        birthday = "" ;//Fecha Nacimiento
        contractstartDate = "" ;//Inicio Contrato
        contractEndDate = "" ;//Fin Contrato
        gender = "" ;//Género
        phone = "" ;//Teléfono
        address = "" ;//Dirección
    }
    
    //Getters

    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getTitle() {
        return title;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getContractstartDate() {
        return contractstartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setContractstartDate(String contractstartDate) {
        this.contractstartDate = contractstartDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //To String

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", title=" + title + ", birthday=" + birthday + ", contractstartDate=" + contractstartDate + ", contractEndDate=" + contractEndDate + ", gender=" + gender + ", phone=" + phone + ", address=" + address + '}';
    }

}//Fin de la clase
