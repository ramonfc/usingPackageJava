package com.misiontic.project08.packages.test;

/**
 *Dado que se está heredando de la clase Profesor y la subclase está dentro del
 * mismo paquete que la superclase, se puede acceder directamente a los miembros
 * declarados como protected.
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @author Ramon
 * Basado en:
 * https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=665:public-private-y-protected-javatipos-de-modificadores-de-acceso-visibilidad-en-clases-subclases-cu00693b&catid=68&Itemid=188
 */
public class ProfesorEmerito extends Profesor{
   private int anosEmerito;
  
   /**
    * método de prueba para verificar el comportamiento de protected de la super clase
    * El atributo edad y el método getAnosConsolidados son protected en la super clase
    * y como la sub clase está en el mismo paquete es posible acceder a los atributos
    * y métodos protected
    * @return cualquier cosa para probar
    */
   double obtenerSalarioBase () {
       return (925 +  (edad - getAnosConsolidados()) * 33.25 + 47.80 * anosEmerito);
   }
   
   /**
    *Método de preuba para verificar una instancia de Profesor
    * Dado que la super clase está en el mismo paquete es posible acceder a los
    * atributos y métodos protected
    */
   public void prueba(){
       Profesor p = new Profesor();
       p.nombre = "Pepito";
       p.edad = 78;
       p.setAnosConsolidados(34);
   }
   
   public void setAnosEmerito(int anosEmerito){
       this.anosEmerito = anosEmerito;
   }
}
