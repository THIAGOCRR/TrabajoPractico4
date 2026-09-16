/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author estef
 */
public class Colegio {
    public static void main(String[] args) {
        
        Materia web2 = new Materia(1, "Wen 2", 2);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia labo1 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno alu1 = new Alumno(1001, "Lopez", "Martin");
        Alumno alu2 = new Alumno(1002, "Martinez", "Brenda");
        
        alu1.agregarMateria(web2);
        alu1.agregarMateria(matematicas);
        alu1.agregarMateria(labo1);
        
        alu2.agregarMateria(web2);
        alu2.agregarMateria(matematicas);
        alu2.agregarMateria(labo1);
        
        alu2.agregarMateria(labo1);
        
        //Visualizar la cantidad de materias a las que está inscripto cada alumno.
        //ver donde se muestra
        alu1.cantidadMateria();
        alu2.cantidadMateria();
        
    }
}
