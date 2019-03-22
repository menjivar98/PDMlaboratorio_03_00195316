package com.example.laboratorio_03_00195316;

public class JSON {

     String nombre;
     String email;
     String password;
     String gender;

    public JSON(String nombre, String email, String password, String gender) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String ImprimirJSON (){
        return "{ Nombre: " + nombre + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Gender: " + gender + "}";
    }

}
