
package colecciones3.computadora;

import java.util.HashMap;
import java.util.HashSet;

public class Computadora {
    String marca;
    String modelo;
    HashSet<ComponenteCpu> componente;
    double totalConInteresAgregado;
    double total;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCpu> getComponente() {
        return componente;
    }

    public void setComponente(HashSet<ComponenteCpu> componente) {
        this.componente = componente;
    }

    public double getTotalConInteresAgregado() {
        return totalConInteresAgregado;
    }

    public void setTotalConInteresAgregado(double totalConInteresAgregado) {
        this.totalConInteresAgregado = totalConInteresAgregado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     
    
    public void guardarcomponente(ComponenteCpu componente1){
     if(this.componente==null){
     this.componente=new HashSet<ComponenteCpu>();
     }
     this.componente.add(componente1);
    }
    public void totalConInteres (){
        double sumaSubtotales=0;
        for(ComponenteCpu c:this.componente){
            sumaSubtotales+=c.getSubtotal();
        }
      if(sumaSubtotales<50000){
      this.totalConInteresAgregado=sumaSubtotales+(sumaSubtotales*0.4);
         // System.out.println("El precio sugerido de venta es de: "+sumaSubtotales+"+"+(sumaSubtotales*0.4)
         // +" = "+sumaSubtotales+(sumaSubtotales*0.4));
      }else{
      this.totalConInteresAgregado=sumaSubtotales+(sumaSubtotales*0.3);
      //System.out.println("El precio sugerido de venta es de: "+sumaSubtotales+"+"+(sumaSubtotales*0.3)
        //  +" = "+sumaSubtotales+(sumaSubtotales*0.3));
      }
      
    }
    public void total(){
        double sumaSubtotales=0;
        for(ComponenteCpu c:this.componente){
            sumaSubtotales+=c.getSubtotal();
        }
      
      this.total=sumaSubtotales;
     
    }
}   
