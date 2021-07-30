package com.misiontic.project08.packages.test;

/**
 *Explicación de control de acceso a los miembros de clases:
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @author Ramon
 */
public class Test2 {

    public static void main(String[] args) {
        /*
         * Estando dentro del mismo paquete se puede hacer una instacia
         * de una subclase y acceder a los miembros protected de la 
         * superclase que fueron heredados en la subclase
         */
         ProfesorEmerito pe = new ProfesorEmerito();
         pe.nombre = "Pepito";
         pe.edad = 98;
         pe.setAnosConsolidados(70);
         pe.setAnosEmerito(18);
         double salario = pe.obtenerSalarioBase();
         System.out.println(salario);
         
         /*
         * Estando dentro del mismo paquete se puede hacer una instacia
         * de una superclase y acceder a los miembros protected de la 
         */
         Profesor p = new Profesor();
         p.nombre = "Perancito";
         p.edad = 67;
    }
  
}
