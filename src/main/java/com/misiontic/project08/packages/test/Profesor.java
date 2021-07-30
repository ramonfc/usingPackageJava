package com.misiontic.project08.packages.test;

/**
 * El modificador de acceso protected puede aplicarse a todos los miembros de
 * una clase, es decir, tanto a campos como a métodos o constructores. En el
 * caso de métodos o constructores protegidos, estos serán visibles/utilizables
 * por las subclases y otras clases del mismo package.
 *https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * @author Ramon
 * Basado en:
 * https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=665:public-private-y-protected-javatipos-de-modificadores-de-acceso-visibilidad-en-clases-subclases-cu00693b&catid=68&Itemid=188
 */
public class Profesor {

    protected String nombre;
    protected int edad;
    private int anosConsolidados; //modificador private. Unicamente se accede dento de la misma clase
    public boolean primaria; 
    
     public void setAnosConsolidados(int anosConsolidados) {
        this.anosConsolidados = anosConsolidados;
    }

    protected int getAnosConsolidados() {
        return anosConsolidados;
    }

   
}
