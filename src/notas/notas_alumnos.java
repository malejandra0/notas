/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

/**
 *
 * @author maria alejandra
 */

public class notas_alumnos {
    
 double[]notas = new double[15];
 double porcentaje, promedio, posicion, menor;
 
 public notas_alumnos(double[]notas){ //constructor
     this.notas=notas;
    }
    
    public void promedio(){ 
        double suma=0;
        for(int a=0; a<15; a++){
            suma += notas[a];
            promedio=suma/15;
        }
    }
    public void porcentaje(){ 
        double temp=0;
        for(int a=0; a<15; a++){
            if(notas[a]>3.0){
                temp++;
            }
            porcentaje = (temp/15)*100;
        }
    }
        
    public void posicion(){ 
        double temp=notas[0];
        for(int a=0; a<15; a++){
            if(notas[a]>temp){
                temp=notas[a];
            }
        posicion= temp;      
        }
    }
    public void menor(){
        double temp=notas[0];
        for(int a=0; a<15; a++){
            if(notas[a]<temp){
                temp=notas[a]; 
            }
            menor=temp;
        }
     }
        
    public double resulprome(){ //getter, abajo tambien son getter
        return promedio; 
    }
    public double resulporcen(){
        return porcentaje;
    }
    public double resulmayor(){
        return posicion;
    }
    public double resulmenor(){
        return menor;
    }
}
