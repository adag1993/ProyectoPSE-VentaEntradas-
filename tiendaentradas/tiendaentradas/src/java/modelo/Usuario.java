package modelo;
// Generated 03-jun-2014 19:55:21 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombre;
     private String contrasenia;
     private String email;
     private Float saldo;
     private Integer telefono;
     private int edad;
     private boolean esAdmin;
     private Set ticketscompradoses = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String contrasenia, String email, int edad, boolean esAdmin) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
        this.edad = edad;
        this.esAdmin = esAdmin;
    }
    public Usuario(String nombre, String contrasenia, String email, Float saldo, Integer telefono, int edad, boolean esAdmin, Set ticketscompradoses) {
       this.nombre = nombre;
       this.contrasenia = contrasenia;
       this.email = email;
       this.saldo = saldo;
       this.telefono = telefono;
       this.edad = edad;
       this.esAdmin = esAdmin;
       this.ticketscompradoses = ticketscompradoses;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isEsAdmin() {
        return this.esAdmin;
    }
    
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
    public Set getTicketscompradoses() {
        return this.ticketscompradoses;
    }
    
    public void setTicketscompradoses(Set ticketscompradoses) {
        this.ticketscompradoses = ticketscompradoses;
    }




}


