
package colecciones3.computadora;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class CostoComputadora {
    public static void main(String[] args){
        boolean validacion2;
        do{
           Computadora computadora=new Computadora();
           String marca= ingresarStringPedidoPorPantalla("Ingrese  marca de la computadora");
           computadora.setMarca(marca);
           String modelo = ingresarStringPedidoPorPantalla("ingrese el modelo");
           computadora.setModelo(modelo);
          
            boolean validacion;
               do{
                   
                   ComponenteCpu componente1=new ComponenteCpu();
                   String componente= ingresarStringPedidoPorPantalla("ingrese un componente");
                   componente1.setComponente(componente);
                   
                   String marcaComponente=ingresarStringPedidoPorPantalla("ingrese la marca del componente");
                   componente1.setMarca(marcaComponente);
                   double precio=ingresarDoublePedidoPorPantalla("precio");
                   componente1.setPrecio(precio);
                   int cantidadComponente=ingresarIntPedidoPorPantalla("ingrese cantidad deseada");
                   componente1.setCantidad(cantidadComponente);
                   componente1.setSubtotal( subtotalComponentes(precio, cantidadComponente));
                    computadora.guardarcomponente(componente1);
                   
                    
                   validacion= validacion_TrueOfalse("desea ingresar otro componete?? s/n");  

               }while(validacion);
                computadora.total();
                computadora.totalConInteres();
               imprimirComputadora(computadora);
               validacion2=validacion_TrueOfalse("desea cotizar una nueva computadora?? s/n");
        }while(validacion2);
    }
    public static double subtotalComponentes(double precio, int cantidad){
        double subtotal= precio*cantidad;
    
    return subtotal;
    }
    public static void imprimirComputadora(Computadora computadora){
        imprimir("Marca: "+ computadora.getMarca());
        imprimir("Modelo: "+ computadora.getModelo());
        imprimir("Componentes: ");
        imprimir(rellenarEspacio("Componente", 20)+rellenarEspacio("Marca", 20)+rellenarEspacio("cantidad", 15)+rellenarEspacio("Precio x Unidad",20)+rellenarEspacio("SubTotal", 20));
        for(ComponenteCpu c:computadora.getComponente()){
            imprimir(rellenarEspacio(c.getComponente(), 20)+rellenarEspacio(c.getMarca(), 20)+rellenarEspacio(String.valueOf(c.getCantidad()),15)+rellenarEspacio(String.valueOf(c.getPrecio()),20)+
                    rellenarEspacio(String.valueOf(c.getSubtotal()), 20));
        }
        imprimir(rellenarEspacio(" ", 55)+rellenarEspacio("TOTAL: ", 20)+rellenarEspacio(String.valueOf(computadora.getTotal()) , 20));
       
        if(computadora.getTotal()<50000){
             double interes=computadora.getTotal()*0.4;
             double total=computadora.getTotal()+interes;
            imprimir("El precio sugerido de venta es: "+ computadora.getTotalConInteresAgregado()+" + "+interes+" = "+total);
        
        }else{
             double interes=computadora.getTotal()*0.3;
             double total=computadora.getTotal()+interes;
            imprimir("El precio sugerido de venta es: "+ computadora.getTotalConInteresAgregado()+" + "+interes+" = "+total);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public static String ingresarStringPedidoPorPantalla(String cartel){
        Scanner sc=new Scanner(System.in);
      String string;
        System.out.println(cartel);
         string=sc.nextLine();
    
       return string;
    }
    public static String leerString(){
        Scanner sc=new Scanner(System.in);
        String string;
        string=sc.next();
        
        return string;
    }
    public static long ingresarLongPedidoPorPantalla(String cartel){
     Scanner sc=new Scanner(System.in);
      long Long;
        System.out.println(cartel);
         Long=sc.nextLong();
    
       return Long;
    }
     public static double ingresarDoublePedidoPorPantalla(String cartel){
     Scanner sc=new Scanner(System.in);
      double Double;
        System.out.println(cartel);
         Double=sc.nextDouble();
    
       return Double;
   }
     public static int ingresarIntPedidoPorPantalla(String cartel){
     Scanner sc=new Scanner(System.in);
      int entero;
        System.out.println(cartel);
         entero=sc.nextInt();
    
       return entero;
   }
    public static double leerDouble(String dato){
        Scanner sc=new Scanner(System.in);
        double Double;
        Double=sc.nextDouble();
        
        return Double;
   } 
    public static void imprimir(String string){
        System.out.println(string);
    }
    public static boolean validacion_TrueOfalse(String cartel){
        Scanner sc=new Scanner(System.in);
        boolean validacion;
        String opcion;
        String palabraValida="S";
        System.out.println(cartel);
            opcion=sc.nextLine();
            if(opcion.equalsIgnoreCase(palabraValida)){
              validacion=true;
            }else{validacion=false;}          
     return validacion;
    }
     public static String rellenarEspacio(String string, int cantidad){
        String rellenado=string;
    for(int i=string.length();i<cantidad;i++){
        rellenado +=" ";
    
    }
    
    return rellenado;
    
    }
    
}
