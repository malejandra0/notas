/*Se tiene almacenado en un arreglo las notas de 15 alumnos de la evaluación final correspondiente al CADIS  de “Álgebra lineal”. Calcular: 
- la mayor nota 
- el porcentaje de alumnos que aprobaron el parcial con nota superior a 3.0 
- el promedio de las notas 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author maria alejandra
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese 15 notas :");
        double[]notas = new double[15]; // atributo
        
        for(int a=0; a<15 ; a++){
            notas[a] = entra.nextDouble();
                
        }
        notas_alumnos entrada= new notas_alumnos(notas); //tambien es un setter, (es el objeto)
        
        entrada.posicion();
        entrada.porcentaje();
        entrada.promedio();
        entrada.menor();
       
        double posicion=entrada.resulmayor();
        double promedio=entrada.resulprome();
        double porcentaje=entrada.resulporcen();
        double menor=entrada.resulmenor();
         
        System.out.println("el promedio es " +promedio); 
        System.out.println("el porcentaje es "+ porcentaje); 
        System.out.println("la nota mayor es "+posicion);
        System.out.println("la nota menor es "+menor);
       }
        
    }
    

