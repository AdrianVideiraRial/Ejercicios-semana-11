package Semana11;
//EJERCICIO 2

public class Perfil{ //Clase Semana11.Perfil
    int edad;
    private String nombre;
    private String apellidos;
    private int numero_dni;
    private char letra;

    //Método constructor de la clase Semana11.Perfil.
    public  Perfil(int edad, String nombre, String apellidos, int numero_dni, char letra){
        this.edad = edad;
        this.nombre =nombre;
        this.apellidos=apellidos;
        this.numero_dni=numero_dni;
        this.letra=letra;

    }

        //Métodos Getter y Setter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumero_dni() {
        return numero_dni;
    }

    public void setNumero_dni(int numero_dni) {
        this.numero_dni = numero_dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


}

