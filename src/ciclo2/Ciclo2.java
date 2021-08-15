/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ciclo2 {
    public static Scanner scan = new Scanner(System.in);
    public static int menu(){
        int opc;
        System.out.println("Menú");
        System.out.println("1. Cargar calificaciones Estudiante.\n" +
                            "2. Imprimir Boletin (Todas las Asignaturas)\n" +
                            "3. Imprimir Estado Asignatura (Ver calificaciones de la Asignatura seleccionada)\n" +
                            "4. Salir");
        opc = scan.nextInt();
        return opc;
    }
    public static void main(String[] args) {
        estudiante est = new estudiante();
        boolean salir = true,salir2 = true;
        while(salir2){
            System.out.println("Digite los nombres del estudiante");
            est.setNombres(scan.nextLine());
            //Profe aqui hay un problema y es que si continua con otro estudiante da problemas con el buffer
            //y no se puede llenar el campo de nombres nuevamente
            System.out.println("Digite los apellidos del estudiante");
            est.setApellidos(scan.nextLine());
            do{
                int opc = menu();
                switch(opc){
                    case 1 -> {
                        est.calificaciones();
                    }
                    case 2 ->{
                        est.imprimir();
                    }
                    case 3 ->{
                        est.imprimirUna();
                    }
                    case 4 ->{
                        salir = false;
                    }
                    default -> System.out.println("Esa no es una opción!");
                }
            }while(salir);
            
                System.out.println("¿Desea gestionar las calificaciones de otro estudiante?");
                System.out.println("1. Si -- cualquier otro número No");
                int opc2 = scan.nextInt();
                if(opc2 == 1){
                   salir  = true;
                }
                else{
                   salir2 = false;
                }
           
        }
    }
    
}
