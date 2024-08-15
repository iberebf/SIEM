package com.mycompany.sistemae;
import java.util.Scanner;
//@author bere, liz, nao

 public class Pagar extends Aspirante implements Evaluar{
     //clase Pagar hereda de Aspirante e implementa la interface Evaluar
    private 
        int dia;
        int mes;
        int anio;
        String tipoPago;
        int comproPago;
        int comproPagoInscri;
        Aspirante aspirante;
    public Pagar(){
        super();
        this.dia = 07;
        this.mes = 07;
        this.anio = 2024;
        this.tipoPago = "";
        
    }
    public Pagar(int d, int m, int a, String tP, Aspirante aspirante){
       super();
       this.dia = d;
       this.mes = m; 
       this.anio = a;
       this.tipoPago= tP;
       this.aspirante = aspirante;
               
    }
    public void pagarFicha(){ // metodo para pagar Ficha
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fecha en que realizaste tu pago como limite tienes: 07/07/2024");
        int a2,m2,d2;
        do{
            a2 =0;
            System.out.println("Introduce el anio: ");
            a2 = scanner.nextInt();
            if(2024 == a2){
                this.setAnio(a2);
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante");
            }
        }while(a2<0||a2>2100);
        do{
            m2=0;
            System.out.println("Introduce el mes: ");
            m2 = scanner.nextInt();
            if(07 == m2){
                this.setMes(m2);
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante");
            }
        }while(m2<0||m2>12);
        do{
            d2=0;
            System.out.println("Introduce el dia: ");
            d2 = scanner.nextInt();
            if(07 == d2){
                this.setDia(d2);
                setComproPago(1234567);
                System.out.println("Tu No.Comprobante es: 1234567");
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante");
                
            }
        }while(d2<0||d2>31);
    }
    public void pagarInscripcion(){ // metodo o funcion para pagar la Inscripcion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fecha en que realizaste tu pago como limite tienes: 07/07/2024");
        int a2,m2,d2;
        do{
            a2 =0;
            System.out.println("Introduce el anio: ");
            a2 = scanner.nextInt();
            if(2024 == a2){
                this.setAnio(a2);
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante de Pago Inscrip");
            }
        }while(a2<0||a2>2100);
        do{
            m2=0;
            System.out.println("Introduce el mes: ");
            m2 = scanner.nextInt();
            if(07 == m2){
                this.setMes(m2);
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante de Pago Inscrip");
            }
        }while(m2<0||m2>12);
        do{
            d2=0;
            System.out.println("Introduce el dia: ");
            d2 = scanner.nextInt();
            if(07 == d2){
                this.setDia(d2);
                setComproPagoInscri(12345678);
                System.out.println("Tu No.Comprobante es: 12345678");
            }else{
                System.out.println("No realizaste tu pago a tiempo, no obtendras tu No.Comprobante de Pago Inscrip");
                
            }
        }while(d2<0||d2>31);
    }
    
    public void registrarComprobantePago(int comprobante) {
        this.setComproPago(comprobante);
    }
    public void registrarComprobantePagoInscri(int comprobante){
        this.setComproPagoInscri(comprobante);
    }
    public boolean puedeInscribirse() { // funcion para determinar si se puede inscribir
        if (aspirante == null) { // si no hay un aspirante, no se podra realizar nada
            System.out.println("Error: El aspirante no está inicializado.");
            return false;
        }
        double prom = aspirante.getPromedioPrepa(); // de la clase persona se obtiene el metodo getPromedioPrepa
        int punt = aspirante.getPuntaje();
        double puntaje = (prom + punt) / 2;
        return puntaje >8;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    } 
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the tipoPago
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
     * @return the comproPago
     */
    public int getComproPago() {
        return comproPago;
    }

    /**
     * @param comproPago the comproPago to set
     */
    public void setComproPago(int comproPago) {
        this.comproPago = comproPago;
    }

    /**
     * @return the aspirante
     */
    public Aspirante getAspirante() {
        return aspirante;
    }

    /**
     * @param aspirante the aspirante to set
     */
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }

    /**
     * @return the comproPagoInscri
     */
    public int getComproPagoInscri() {
        return comproPagoInscri;
    }

    /**
     * @param comproPagoInscri the comproPagoInscri to set
     */
    public void setComproPagoInscri(int comproPagoInscri) {
        this.comproPagoInscri = comproPagoInscri;
    }
    @Override
    public boolean evaluar() {
        Aspirante[] aspirante = new Aspirante[20];
        if (aspirante== null) {
            System.out.println("Error: El aspirante no está inicializado.");
            return false;
        }
        else{
            System.out.println("El Aspirante está inicializado");
        return true;
        }
    }
    @Override
    public String obtenerResultado() {
        return("Resultado del Aspirante"); 
    }
    
    
}


