package Semana11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Scanner entradaString = new Scanner(System.in);
            Scanner entradaChar = new Scanner(System.in); // espacio en memoria

            String nombre =""; //Variables iniciadas.
            String apellidos ="";
            int edad=0;
            int dni=0;
            char letra =' ';

            System.out.println("Introduce tu edad");//Solicitamos datos
            try {
                edad = entrada.nextInt();
            }catch(InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ edad);
            }

            System.out.println("Intruduce tu nombre");//Solicitamos datos
            try{
            nombre  = entradaString.nextLine();
            }catch(InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es: "+ nombre);
            }

            System.out.println("Introduce tus apellidos");//Solicitamos datos
            try {
                apellidos = entradaString.nextLine();
            }catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es: "+ apellidos);
            }

            System.out.println("Introduce el número de tu DNI");//Solicitamos datos
            try {
                dni = entrada.nextInt();
            }catch(InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ dni);
            }

            System.out.println("Introduce la letra de tu DNI");//Solicitamos datos
            try{
                letra = entradaChar.next().charAt(0);
            }catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ letra);
            }

            System.out.println("Tienes "+edad+" años" + " Tu nombres completo es: "+nombre+" "+apellidos+" y tu DNI es: "+dni + letra);

        }
}
