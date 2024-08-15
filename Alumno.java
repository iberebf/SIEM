package com.mycompany.sistemae;
import java.util.Scanner;
//@author bere, liz, nao
public class Alumno extends Aspirante implements Evaluar{
    // Alumno hereda de Aspirante e implementa la interface Evaluar
    private
        int matricula;
        float prom;
        String materia;
        double prmfe;
        double prmfm;
        private double promfinal;
        Aspirante aspirante; // atributo de tipo Aspirante llamado aspirante
        
    public Alumno(){
        super();
        this.matricula = 0;
        this.prom = 0.0f;
        this.materia = "";
        this.prmfe = 0.0f;
        this.prmfm = 0.0f;
        this.promfinal = 0.0f;
    }                                                          
    public Alumno(int id,String n, String ap, String am, int eda, char gene,String nE, float pP,String C,int nF, float pE, int m, float p, String matria, double prE, double prM, double pfinal){
        super(id,n,ap,am,eda,gene,nE, pP,C, nF, pE); 
        this.matricula = m;
        this.prom = p;
        this.materia = matria;
        this.prmfe = prE;
        this.prmfm = prM;
        this.promfinal = pfinal;
    }
    public void modificarAlu(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es el Promedio: ");
        this.prom = scanner.nextFloat();
        System.out.println("Cual es la Materia: ");
        this.materia  = scanner.nextLine();
    }
    public void Enero24(){ // funcion de lista para el periodo Enero2024
        double promfinal = 9.1;
        System.out.println("Expresion Oral y Escrita        - >   9");
        System.out.println("Algoritmos                      - >   10");
        System.out.println("Fundamento de Programacion      - >   9");
        System.out.println("Algebra lineal                  - >   8");
        System.out.println("Quimica Basica                  - >   9");
        System.out.println("Ingles I                        - >   10");
        System.out.println("Tu promedio fina es: " +promfinal);
        this.setPrmfe(promfinal);
    }
    public void Mayo24(){ // funcion de lista para el periodo Mayo 2024
        double promfinal = 9.4;
        System.out.println("Desarrollo Humano y Valores                     - >   8");
        System.out.println("Programacion Orientada a Objetos                - >   10");
        System.out.println("Estructuras de datos                            - >   10");
        System.out.println("Ingenieria de Software Asistida por Computadora - >   9");
        System.out.println("Procesos de Desarrollo de Software              - >   10");
        System.out.println("Calculo Diferencial                             - >   9");
        System.out.println("Ingles II                                       - >   10");
        System.out.println("Tu promedio fina es: " +promfinal);
        this.setPrmfm(promfinal);
    }

    /**
     * @return the prmfe
     */
    public double getPrmfe() {
        return prmfe;
    }

    /**
     * @param prmfe the prmfe to set
     */
    public void setPrmfe(double prmfe) {
        this.prmfe = prmfe;
    }

    /**
     * @return the prmfm
     */
    public double getPrmfm() {
        return prmfm;
    }

    /**
     * @param prmfm the prmfm to set
     */
    public void setPrmfm(double prmfm) {
        this.prmfm = prmfm;
    }
    public double calcularPromedioAnual() {
        double historial;
        historial = (this.prmfe + this.prmfm)/2;
        this.setPromfinal(historial);
        return historial;
    }

    /**
     * @return the promfinal
     */
    public double getPromfinal() {
        return promfinal;
    }

    /**
     * @param promfinal the promfinal to set
     */
    public void setPromfinal(double promfinal) {
        this.promfinal = promfinal;
    }
    public Aspirante getAspirante() {
        return aspirante;
    }

    /**
     * @param aspirante the aspirante to set
     */
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    
    
    @Override
    public boolean evaluar() { // metodo de la interface 
        Aspirante[] aspirante = new Aspirante[20];
        if (aspirante== null) {
            System.out.println("Error: El alumno no está inicializado.");
            return false;
        }
        else{
            System.out.println("El alumno está inicializado");
        return true;
        }
    }

    @Override
    public String obtenerResultado() {
        // Lógica para obtener el resultado de la evaluación del Alumno
        return "El Alumno está registrado";
    }

}
