package Semana11;

import java.awt.image.Kernel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

       /* Perfil Persona = new Perfil();*/ //Creamos Objeto de la clase Perfil

        Scanner memoria = new Scanner(System.in);//Memoria
        Scanner memoriaString = new Scanner(System.in);//Memmoria para evitar errores en la pantalla

        int edad; //Variables a trabajar
        String nombre;
        String apellidos;
        int numero_dni;
        char letra;



        Perfil usuarios [] = new Perfil[5]; //Creamos array para guardar los perfiles

        try{

        for(int i=0; i<usuarios.length;i++) { //Rellenamos cada perfil con los metodos setter.
            System.out.println("Ingresa tu edad");
            edad = memoria.nextInt();
            //Persona.setEdad(memoria.nextInt()); // --> Objeto + método + espacio memoria + tipo de dato.

            System.out.println("Ingresa tu nombre");
            nombre = memoriaString.nextLine();
            //Persona.setNombre(memoriaString.nextLine());

            System.out.println("Ingresa tus apellidos");
            apellidos = memoriaString.nextLine();
            //Persona.setApellidos(memoriaString.nextLine());

            System.out.println("Ingresa tu número de DNI");
            numero_dni = memoria.nextInt();
            //Persona.setNumero_dni(memoria.nextInt());

            System.out.println("Ingresa la letra de tu DNI");
            letra = memoria.next().charAt(0);
            //Persona.setLetra(memoria.next().charAt(0));
            usuarios [i] = new Perfil(edad,nombre,apellidos,numero_dni,letra);
        }

        }catch (InputMismatchException error){
            System.out.println("Ha ocurrido un error de tipo " + error);
        }

       for(int i=0; i<usuarios.length;i++){//Mostramos los datos de los perfiles con los metodos getter.
            System.out.println("Usuario: "+ i +":");
            System.out.println("Edad: "+ usuarios[i].getEdad());
            System.out.println("Nombre y apellidos: "+ usuarios[i].getNombre()+" "+usuarios[i].getApellidos());
            System.out.println("DNI: "+usuarios[i].getNumero_dni()+usuarios[i].getLetra());
            System.out.println("---------------------------------------------------------");
        }




    }
}
