/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaherencia;

/**
 *
 * @author kirih
 */
public class Professor extends Persona{
    protected String materia;
    
    public void Teacher(){
    System.out.println("El maestro de : " + materia + " " + "es" + " " + name + " " + apellido);
    }
    
        @Override
   public void saludar(){
       System.out.println("Bienvenido" + name);
   } 
}
