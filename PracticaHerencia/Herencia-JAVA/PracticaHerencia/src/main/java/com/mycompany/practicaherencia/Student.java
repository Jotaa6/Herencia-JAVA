/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaherencia;

/**
 *
 * @author kirih
 */
public class Student extends Persona{
    protected int nota;
    
   public Student(){
       this.name = " Estudiante quedado: Pedro Alejandro";
   
   }

    public void Mostrar(){
        System.out.println("Hola la nota de: " + name + " " + apellido + " " + "es: " + " " + nota);
    }
    
    @Override
    public void saludar(){
       System.out.println("Bienvenido" + name);
   }
}
