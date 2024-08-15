package com.mycompany.sistemae;
//@author bere, liz, nao
 
public class Estudiante extends Persona implements Evaluar {
    // Clase Estudiante hereda la clase abstracta Persona para que se puedan crean instancias 
    public Estudiante(){
        super();
        
    }
    public Estudiante(int id, String n, String ap, String am, int eda, char gene) {
        super(id, n, ap, am, eda, gene);
    }

    @Override
    public String obtenerResultado() {
        throw new UnsupportedOperationException("Persona creada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean evaluar(){
        Estudiante[] estudiante = new Estudiante[20];
        if (estudiante== null) {
            System.out.println("Error: La Persona no está inicializado.");
            return false;
        }
        else{
            System.out.println("La persona fue crada");
        return true;
        }
    }
}
