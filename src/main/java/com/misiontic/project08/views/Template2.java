package com.misiontic.project08.views;

import com.misiontic.project08.packages.test.Profesor;

/**
 *Explicación de control de acceso a los miembros de clases:
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @author Ramon
 */
public class Template2 {
    /**
   * Método de prueba intentando instanciar la superclase Profesor.
   * Gracias al import hecho se puede hacer la instancia, pero
   * como no es el paquete donde originalmente está la superclase
   * ya no se puede acceder a los miembros protected, únicamente a los 
   * declarados como public-recordar que el modificador protected especifíca que
   * el miembro solo puede ser accedido en el ámbito de su propio paquete y
   * adicionalmente, a subclases de su clase en otro paquete.
   */
  public void prueba(){
    Profesor p = new Profesor();
    p.primaria = true;
    p.setAnosConsolidados(10);
    //p.nombre = "Josefo"; // No se puede acceder al miembro tipo protected
                          //desde otro paquete, no siendo una subclase.
  }
}
