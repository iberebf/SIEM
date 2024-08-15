package com.mycompany.sistemae;
import java.util.Scanner;
//@author bere, liz, nao
 
public abstract class Persona implements Evaluar{
    //Persona es abstracta e implementa la interface Evaluar 
    protected 
        int id;
        String nombre;
        String apellidoP;
        String apellidoM;
        int edad;
        char genero;
    public Persona(){
        this.id = id;
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.edad = 0;
        this.genero = ' ';
    }
    public Persona(int id,String n, String ap, String am, int eda, char gene){
        this.id = id;
        this.nombre = n;
        this.apellidoP= ap;
        this.apellidoM = am;
        this.edad = eda;
        this.genero = gene;
    }
    
    public void crearPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        this.setNombre(scanner.nextLine());
        System.out.println("Introduce el apellido paterno: ");
        this.setApellidoP(scanner.nextLine());
        System.out.println("Introdece el apellido materno: ");
        this.setApellidoM(scanner.nextLine());
        System.out.println("Intoduce la edad: ");
        this.setEdad(scanner.nextInt());
        System.out.println("Introduce el genero (M)asculino / (F)emenino: ");
        this.setGenero(scanner.next().charAt(0));
    }
    public int getID() {
        return id; 
    }
    public void setID(int ID) {
        this.id = id; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    
    public String getApellidoM() {
        return apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    } 
     @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellidoP + ", Edad: " + edad;
    }
    public boolean evaluar(){
        Persona[] persona = new Persona[20];
        if (persona== null) {
            System.out.println("Error: la persona no está inicializado.");
            return false;
        }
        else{
            System.out.println("La persona está inicializado");
        return true;
        }
    }
}
