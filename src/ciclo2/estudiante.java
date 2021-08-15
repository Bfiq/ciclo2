/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class estudiante {
    private String nombres,Apellidos;
    Scanner scan = new Scanner(System.in);
    float calificaciones[][] = new float[5][4];
    float[] notafinal = new float[5];
    String materias[] = {"Matemáticas","Ciencias","Ingles","Informática","Deportes"};

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public void calificaciones(){
        float suma = 0;
        System.out.println("Digite las calificaciones del estudiante");
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 4; j++){
                boolean ban = true;
                do{
                    int ind = j+1;
                    System.out.println("Digite la nota #"+ind+" de "+materias[i]);
                    calificaciones[i][j] = scan.nextFloat();
                    if(calificaciones[i][j] > 0 && calificaciones[i][j]<100){
                        suma += calificaciones[i][j];
                        ban = false;
                    }
                    else{
                        System.out.println("Esta nota no esta dentro del rango de 0 -> 100");
                    }
                }while(ban);
            }
            notafinal[i] = suma/4;
            suma = 0;
        }
        
    }
    
    public void imprimir(){
        for (int i=0; i < 5; i++) {
            System.out.println(materias[i]);
            for (int j=0; j < 4; j++){
                    int ind = j+1;
                    System.out.println("Periodo #"+ind+": "+calificaciones[i][j]);
            }
            System.out.println("Nota Final: "+notafinal[i]);
        }
    }
    
    public void imprimirUna(){
        System.out.println("¿Que materia desea ver?");
        System.out.println("1. Matemáticas\n" +
                            "2. Ciencias\n" +
                            "3. Ingles\n" +
                            "4. Informática\n" +
                            "5. Deportes");
        int opc = scan.nextInt();
        if(opc<6 && opc>0){
            for (int i=0; i < 5; i++) {
                if(opc-1 == i){
                    System.out.println(materias[i]);
                    for (int j=0; j < 4; j++){
                            int ind = j+1;
                            System.out.println("Periodo #"+ind+": "+calificaciones[i][j]);
                    }
                    System.out.println("Nota Final: "+notafinal[i]);
                }  
            }
        }
        else{
            System.out.println("Esta no es una opción");
        }
    }
}
