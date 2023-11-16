/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaherencia;

/**
 *
 * @author kirih
 */
public class PracticaHerencia {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();
        
        
        Student student = new Student();
        student.name = "Jose";
        student.apellido = "Barrantes";
        student.nota = 99 ;
        student.Mostrar();
        student.saludar();
        
        Professor professor = new Professor();
        professor.name = "Eric";
        professor.apellido = "Martinez";
        professor.materia = "Programación";
        professor.Teacher();
        professor.saludar();
                
        Persona student2 = new Student();
        System.out.println(student2.getName());
    }
}
