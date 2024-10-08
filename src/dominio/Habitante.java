package dominio;

public class Habitante {

    private String nombre;
    private String apellido;
    private String apellido2;

    public Habitante() {
        
    }
    public Habitante (String nombre_, String apellido1_, String apellido2_){
        nombre = nombre_;
        apellido = apellido1_;
        apellido2 = apellido2_;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre_){
      nombre = nombre_;  
    }

    public String toString(){
        return "Nombre: " + nombre + " " + apellido + " " + apellido2;
    }
}