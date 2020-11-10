
package Agenda;

import java.util.HashMap;
import java.util.Scanner;


public class Agenda {

  
    public static void main(String[] args) {
       HashMap<String, Long> agenda = new HashMap<String, Long>();
                menu(agenda);
        
    }
    public static void AgendarContacto(HashMap<String, Long> agenda){
        Scanner sc=new Scanner(System.in);
        String nombre;
        long numero ;
        imprimir("-------AGENDANDO NÚMERO------");
        imprimir("nombre: ");
        nombre=sc.nextLine();
        imprimir("numero: ");
        numero=sc.nextLong();
        agenda.put(nombre,numero);
        imprimir("-----------------------------");
        imprimir("Número agendado correctamente");
        imprimir("-----------------------------");
        

    }
    public static void buscarContato(HashMap<String, Long> agenda){
        Scanner sc=new Scanner(System.in);
         String nombre;
         boolean seguirBuscando;
        
        imprimir("----------BUSCAR-------------");
         do{
           nombre = ingresarStringPedidoPorPantalla("Nombre");
           if(agenda.containsKey(nombre)){
               imprimir("número: "+agenda.get(nombre));
           }else{
               imprimir("El nombre ingresado no se encuentra en su agenda");
         
        
           }
           seguirBuscando=validacion_TrueOfalse("desea seguir buscando s/n??");
         }while(seguirBuscando);
          imprimir("-----------------------------");  
    }
    public static void mostrarAgenda(HashMap<String, Long> agenda){
        imprimir("---------AGENDA------------");
        for(String n: agenda.keySet() ){
            imprimir("Nombre: "+n+" "+"Número: "+ agenda.get(n));
        }
        
        imprimir("---------------------------");
    
    
    }
    public static void menu(HashMap<String, Long> agenda){
        int opcion;
       
        imprimir("----------MENÚ------------");
        imprimir("1 - Agendar un contato");
        imprimir("2 - Buscar  contato ");
        imprimir("3 - ostrar agenda");
        imprimir("4 - Salir");
        opcion= ingresarIntPedidoPorPantalla("opcion: ");
        switch(opcion){
            case 1:
                AgendarContacto(agenda);
                menu(agenda);
            case 2:
                if(agenda.size()==0){
                    imprimir("No tiene ningún contactaco agendado");  
                    menu(agenda);
                }else{
                buscarContato(agenda);}
                menu(agenda);
            case 3:
                if(agenda.size()==0){
                imprimir("No tiene ningún contactaco agendado");
                    menu(agenda);
                }else{mostrarAgenda(agenda);}
                menu(agenda);
            case 4:
                imprimir("Saliendo de agenda....");
                imprimir("---------------------");
                break;
            default:
                imprimir("opcion incorrecta");
                menu(agenda);
        
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
    
}
