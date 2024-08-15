
package com.mycompany.sistemae;
import java.util.Scanner;
import java.util.Random;

// @author bere, liz, nao

public class SistemaE {
    
    public static void clearConsole() { // funcion para limpiar pantalla
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int opc, preciPgar, comprobantePago, resp, comprobantePagoInscri, matri, selec;
        double histo;
        Persona[] P = new Persona[20]; // declaracion de clases
        Estudiante[] estudiantes = new Estudiante[20];
        Aspirante[] A = new Aspirante[1];
        AspiranteCRUD[] aspiranteCRUD = new AspiranteCRUD[20];
        Alumno[] Al = new Alumno[20];
        Pagar[] Pag = new Pagar[20];
        HashTable<Aspirante> aspiranteTable = new HashTable<>();
        // Crear una instancia de Random
        int nuevoId = aspiranteTable.generateRandomKey();
         
        Scanner scanner = new Scanner(System.in);
        do{ // menu de opciones con un switch dentro de un do while
            clearConsole();
            System.out.println("         Bienvenido al Sistema Informatico Escolar Mackenzie         ");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1. Registrarte");
            System.out.println("2. Aspirante");
            System.out.println("3. Alumno");
            System.out.println("4. CRUD");
            System.out.println("---------------------------------------------------------------------");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch(opc){
                case 1 -> { //  1. Registrarse
                    clearConsole();
                    System.out.println("Ingresa tus datos personales");
                    for (int i = 0; i < 1; ++i){
                        estudiantes[i] = new Estudiante(); // Se inicializa la clase
                        estudiantes[i].crearPersona(); // llamas a la funcion de esa clase
                        estudiantes[i].evaluar();
                    } 
                }
                case 2 -> { 
                    clearConsole();
                    if (estudiantes[0] == null) { // condicion para que no permita registrarse como aspirante 
                        System.out.println("Por favor regístrate primero."); // antes de registrarse como persona
                        break;
                    }
                    System.out.println("Ingresa tus datos para Aspirante");
                    for (int i = 0; i < 20; ++i){ // se llena la infomacion para aspirante
                        A[i] = new Aspirante();
                        A[i].crearAspirante();
                        A[i].evaluar();
                        aspiranteTable.create(nuevoId, A[i]);
                        System.out.println("Este es su numero de ficha: " + nuevoId);
                        Pag[i] = new Pagar();
                        Pag[i].setAspirante(A[i]);
                        Pag[i].evaluar();
                        System.out.println("Para continuar debes de realizar el pago de examen. ----- Presiona 1 para pagar 0 para salir -----");
                        preciPgar = scanner.nextInt();
                        if(preciPgar ==1){
                            Pag[i].pagarFicha();
                            clearConsole();
                            System.out.print("Digita el número de comprobante de pago por examen: ");
                            comprobantePago = scanner.nextInt();
                            if (comprobantePago == Pag[i].getComproPago()){ // el #comprobante se compara con un metodo get de la clase Pagar
                                System.out.println("Comprobante verificado.");
                                System.out.println(" ");
                                System.out.println("Tu siguiente paso es realizar tu examen");
                                A[i].examen();
                                System.out.println("Ya puedes calcular tu puntaje. ----- Presiona 1 para pagar 0 para salir -----");
                                resp = scanner.nextInt();
                                if(resp == 1){
                                    if (Pag[i].puedeInscribirse()) {
                                        System.out.println("Puedes inscribirte como alumno.");
                                        System.out.println(" ");
                                        Al[i] = new Alumno();
                                        System.out.println("Debes de realizar el pago de inscripcion. ----- Presiona 1 para pagar 0 para salir -----");
                                        preciPgar = scanner.nextInt();
                                        if(preciPgar ==1){
                                            Pag[i] = new Pagar();
                                            Pag[i].pagarInscripcion();
                                            clearConsole();
                                            System.out.println("Digita el numero de comprobante de pago por inscripcion: ");
                                            scanner.nextLine();
                                            comprobantePagoInscri = scanner.nextInt();
                                            if(comprobantePagoInscri == Pag[i]. getComproPagoInscri()){
                                                System.out.println("Comprobante verificado. ");
                                                System.out.println("Matrícula del aspirante " + ": " + A[i].getMatricula());
                                                break;
                                            }else{
                                                System.out.println("No fue verificado tu comprobante");
                                            }
                                        }else{
                                            System.out.println("No cumples con los requisitos para inscribirte.");
                                        }
                                    }else{
                                        System.out.println("El aspirante no cumple los requisitos para inscribirse.");
                                    }
                                }
                            }
                        }
                    }
                }
                case 3 -> { 
                    for (int i = 0; i < 1; ++i){
                        System.out.println("                            Alumno         ");
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("Matricula");
                        matri = scanner.nextInt();
                        if(matri == A[i].getMatricula()){    // #matricula se compara con el metodo get de Aspirante 
                            do{
                                Al[i] = new Alumno();
                                if(Al[i].evaluar()){
                                    System.out.println("Bienvenido");
                                }
                                System.out.println("                            Alumno         ");
                                System.out.println("---------------------------------------------------------------------");
                                System.out.println("1. Calificaciones"); 
                                System.out.println("2. Becas");
                                System.out.println("3. Extracurricular");
                                System.out.println("4. Intercambios");
                                resp = scanner.nextInt();
                                switch(resp){
                                    case 1 -> {
                                        int answ;
                                        System.out.println("Selecciona un periodo");
                                        System.out.println("1.Enero - Mayo");
                                        System.out.println("2.Mayo - Agosto");
                                        answ = scanner.nextInt();
                                        if(answ == 1){
                                            System.out.println("Enero - Mayo");
                                        Al[i].Enero24();
                                        }else{
                                            System.out.println("Mayo - Agosto");
                                            Al[i].Mayo24();
                                        }
                                    }
                                    case 2 -> {
                                        Al[i].Enero24();
                                        Al[i].Mayo24();
                                        System.out.println(" ");
                                        System.out.println("Bienvenide al Sistema de Becas");
                                        if(Al[i].calcularPromedioAnual()>=9){
                                            System.out.println("Selecciona la beca a al que deses aplicar");
                                            System.out.println("1. Beca Bienestar");
                                            System.out.println("2. Beca Felipe Angeles");
                                            System.out.println("3. Beca Benito Juarez");
                                            selec = scanner.nextInt();
                                            System.out.println("Has sido inscrito");
                                        }else{
                                            System.out.println("Tu historial academico no te permite aplicar esta ocasion");
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Bienvenide al Sistema de Extracurriculares");
                                        System.out.println("Selecciona un Extracurricular al que deses aplicar");
                                        System.out.println("1. Club de Lectura         Lunes y Martes 12:00 - 13:00 pm");
                                        System.out.println("2. FitnessDance            Lunes y Miercoles 16:00 - 17:00 pm");
                                        System.out.println("3. Club de Ajedrez         Martes y Jueves 18:00 - 19:00 pm");
                                        System.out.println("4. Jardineria              Jueves 12:00 pm - 13:00");
                                        selec = scanner.nextInt();
                                        System.out.println("Has sido inscrito");
                                    }
                                    case 4 -> {
                                        System.out.println("Bienvenide al Sistema de Intercambios");
                                        if(Al[i].getPromfinal()>=8){
                                            System.out.println("Selecciona la universidad a al que deses aplicar");
                                            System.out.println("1. Universidad Complutense de Madrid");
                                            System.out.println("2. Universidad Politécnica de Madrid");
                                            System.out.println("3. Universidad Rey Juan Carlos");
                                            selec = scanner.nextInt();
                                            System.out.println("Has postulado correctamente, te notificaremos");
                                        }else{
                                            System.out.println("Tu historial academico no te permite aplicar esta ocasion");
                                        }
                                    }
                                }
                                System.out.println("Quires volver al menu. Si = 1 / No = 0: ");
                                opc=scanner.nextInt();
                            }while(opc ==1 );
                            break;
                        }
                        
                        break;
                    }
                }
                case 4 -> {
                    // Leer un aspirante existente
                    // Crear un nuevo aspirante
                    /*int id1 = aspiranteTable.generateRandomKey();
                    Aspirante aspirante1 = new Aspirante("Juan", "Pérez");
                    aspiranteTable.create(id1, aspirante1);
                    */
                    System.out.println("Ingrese el ID del aspirante que desea ** actualizar **: ");
                    int idActualizar = scanner.nextInt();
                    Aspirante aspiranteActualizado = new Aspirante(10,"Juan","Barcenas", "Ramirez", 19, 'M',"Cbtis", 9.9, "Software", 3425,9.81);
                    aspiranteTable.update(idActualizar, aspiranteActualizado);
                    // Leer nuevamente el aspirante para ver los cambios
                    aspiranteTable.read(nuevoId);
                    // Eliminar un aspirante
                    System.out.print("Ingrese el ID del aspirante que desea ** eliminar **: ");
                    int idAEliminar = scanner.nextInt();
                    aspiranteTable.delete(idAEliminar);
                    // Listar todos los aspirantes después de la eliminación
                    aspiranteTable.listAll();
                }
                default -> System.out.println("Esa opcion no existe");
            }
             System.out.println("Quires volver al menu. Si = 1 / No = 0: ");
            opc=scanner.nextInt();
        }while(opc==1);
        scanner.close();   
    }
}
