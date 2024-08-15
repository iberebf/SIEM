package com.mycompany.sistemae;

import java.util.Scanner;
//@author bere, liz, nao
 
public class Aspirante extends Estudiante implements Evaluar{
    //La clase Aspirante hereda de Estudiante e implementa la interface Evaluar
    private
        String nombreEscuela;
        int noFicha;
        String carrera;
        float puntajeExamen;
        float promedioPrepa;
        int matricula;
        int puntaje;
        Estudiante estudiante;
    public Aspirante(){
        super();
        this.nombreEscuela = "";
        this.promedioPrepa = 0.0F;
        this.carrera = "";
        this.noFicha = 0;
        this.puntajeExamen = 0.0F;
        this.matricula = 123456789;
    }
    
    public Aspirante(int id, String n, String ap, String am, int eda, char gene, String nE, double pP, String C, int nF, double pE){
        super(id,n, ap, am, eda, gene);
        this.nombreEscuela = nE;
        this.promedioPrepa = (float) pP;
        this.carrera = C;
        this.noFicha = nF;
        this.puntajeExamen = (float) pE;
        
    }

    public void crearAspirante(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es el nombre de la Preparatoria de precedencia: ");
        this.setNombreEscuela(scanner.nextLine());
        System.out.println("Ingresa una carrera: ");
        System.out.println("1. Ingenieria en Software");
        System.out.println("2. Biomedica");
        System.out.println("3. Ingenieria Mecatronica ");
        System.out.println("4. Licenciatura en Ciencias de Datos");
        System.out.println("Ingresa tu carrera: ");
        this.setCarrera(scanner.nextLine());
        System.out.println("Cual es el promedio de preparatoria: ");
        this.setPromedioPrepa(scanner.nextFloat());
        
    }
    public void examen(){
        int h1,h2,h3,h4,m1,m2,m3,m4, ph, pe, pm, r;
        String e1,e2,e3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("  ");
        System.out.println("Este examen se necesita realizar sin ningun material de apoyo:");
        System.out.println("calculadora, manual, acordeon, smartphone y tablet");
        System.out.println("    ");
        System.out.println("Historia, 5 preguntas; Español, 3 preguntas; Matematicas, 4 preguntas ");
        System.out.println("   ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                            Historia         ");
        System.out.println("En que año ocurrio la Independencia de México");
        h1 = scanner.nextInt();
        System.out.println("En que año ocurrio la Revolucion Mexicana");
        h2 = scanner.nextInt();
        System.out.println("En que año se creo la SEP");
        h3 = scanner.nextInt();
        System.out.println("En que año ocurrio la primera guerra mundial");
        h4 = scanner.nextInt();
        if(h1== 1810 && h2 == 1910 && h3 == 1920 && h4 == 1914){
            ph= 10;
        }else{
            ph=9;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                             Español         ");
        System.out.println("Cual es el artículo correcto para el sustantivo calor: ´la´ o ´el´  ");
        e1 = scanner.nextLine();
        e1 = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Cual es el acento diacritico correcto para el siguiente enunciado: ");
        System.out.println("Yo prefiero que la maestra Martina me ___ clases de Matematicas");
        System.out.println("´de´ o ´dé´");
        e2 = scanner.nextLine();
        System.out.println("  ");
        System.out.println("Cual es el artículo correcto para referirnos a un hombre: ´él´o ´el´ ");
        e3 = scanner.nextLine();
        if(e1== "el" && e2 == "dé" && e3 == "él"){
            pe= 10;
        }else{
            pe=9;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                             Matematicas     ");
        System.out.println("Cual es el resulato de la raiz de 49?");
        m1 = scanner.nextInt();
        System.out.println("Cual es el resultado de tan x/ tan x");
        m2 = scanner.nextInt();
        System.out.println("Cual es el resultado del sen de 90°");
        m3 = scanner.nextInt();
        System.out.println("Cual es el resultado del la derivada de π+3/π+5/8");
        m4 = scanner.nextInt();
        if(m1== 7 && m2 == 1 && m3 == 1 && m4 == 0){
            pm= 10;
        }else{
            pm=9;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                            Resultado     ");
        r=(ph+pe+pm)/3;
        System.out.println(r);
        setPuntaje(r);
    }
    
    /**
     * @return the nombreEscuela
     */
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    /**
     * @param nombreEscuela the nombreEscuela to set
     */
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public int getNoFicha() {
        return noFicha;
    }

    public void setNoFicha(int noFicha) {
        this.noFicha = noFicha;
    }

    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPuntajeExamen() {
        return puntajeExamen;
    }
    
    public void setPuntajeExamen(float puntajeExamen) {
        this.puntajeExamen = puntajeExamen;
    }

    public float getPromedioPrepa() {
        return promedioPrepa;
    }

    public void setPromedioPrepa(float promedioPrepa) {
        this.promedioPrepa = promedioPrepa;
    } 

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
        
    public boolean evaluar() {
        Estudiante[] estudiante = new Estudiante[20];
        if (estudiante == null) {
            System.out.println("Error: La Persona no está inicializada.");
            return false;
        }
        else{
            System.out.println("El Aspirante está inicializado");
        return true;
        }
    }
    
    @Override
    public String obtenerResultado() {
        return("El Aspirante se puede registrar"); 
    }

    /**
     * @return the persona
     */
    public Persona getEstudiante() {
        return estudiante;
    }

   public void setEstudiante(Persona persona) {
    this.estudiante = (Estudiante) persona; // Asumiendo que `persona` es de tipo `Persona`
}
    
    

}

