package com.misiontic.project08.views;

import com.misiontic.project08.packages.test.Profesor;

/**
 *Se ha importado la superclase Profesor desde otro paquete.
 * El modificador protected permite el acceso desde las subclases desde 
 * otro paquete
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @author Ramon
 */
public class Template extends Profesor{
   private int bonos;
  
   /**
    * En el método aún se puede acceder a los miembros protected de la superclase
    * @return cualquier cosa para probar
    */
  public double salarioConBonos(){
      return (925 + getAnosConsolidados() + bonos + edad);
  }
  
  /**
    * En el método aún se puede acceder a los miembros protected por ser subclase,
    * y public de la superclase
    */
  public void metodo(){
      this.edad = 56;
      this.nombre = "Pepito";
      this.primaria = false;
      this.setAnosConsolidados(11);
      System.out.println(this.getAnosConsolidados());
  }
}
