
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
    static Scanner dato1 = new Scanner(System.in);
    static Scanner dato2 = new Scanner(System.in);

    
    static ArrayList<Inventario> libros = new ArrayList();

    
    public static void Solicitar(){
    	//varibles
        int codigo;
        String titulo, autor;
        double precio;
        int cantidad;
        Inventario AUX;
        int i, n;
        
        do {
            System.out.print("Ingrese numero libros(Fisico)");
            n = dato1.nextInt();
        } while (n < 0);
        dato1.nextLine();
        
        for (i = 1; i <= n; i++) {
            System.out.println("\nLibro #" + i);
            
            System.out.print("Codigo: ");
            codigo = dato1.nextInt(); 
            
            System.out.print("Titulo: ");
            titulo = dato2.nextLine(); 
            
            System.out.print("Autor: ");
            autor = dato2.nextLine(); 
            
            System.out.print("Precio: ");
            precio = dato1.nextDouble();
            
            System.out.print("Cantidad: ");
            cantidad = dato1.nextInt();
            dato1.nextLine();
            
            AUX = new Inventario();
            
            AUX.setCodigo(codigo);
            AUX.setTitulo(titulo);
            AUX.setAutor(autor);
            AUX.setPrecio(precio);
            AUX.setCantidad(cantidad);
            
            libros.add(AUX);
        }
        
    }
    
    public static void Consultar(){
        int codigo;
        System.out.println("\nConsulte un libro del inventario por medio del codigo");
        System.out.print("Introduzca codigo: ");
        codigo = dato1.nextInt();
        System.out.println("Libro consultado por el codigo " + codigo);
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getCodigo()== codigo){
                System.out.println(libros.get(i));
                } 
            }           
    }
   
    public static void ActualizarVenta(){
        int codigo; 
        Inventario AUX;
        int venta=0;
        double precio=0;
        String titulo, autor;
        System.out.println("\nConsulte un libro que desee comprar");
        System.out.print("Introduzca el codigo: ");
        codigo = dato1.nextInt();
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getCodigo()== codigo){
                precio=libros.get(i).getPrecio();
                titulo=libros.get(i).getTitulo();
                autor=libros.get(i).getAutor();
                AUX = new Inventario();
                
                if(libros.get(i).getCantidad()>0){
                    venta = libros.get(i).getCantidad();
                    venta--;
                } else if(libros.get(i).getCantidad()==0){
                    venta = libros.get(i).getCantidad();
                    System.out.println("Libro Agotado");
                }

                AUX.setCodigo(codigo);
                AUX.setTitulo(titulo);
                AUX.setAutor(autor);
                AUX.setPrecio(precio);
                AUX.setCantidad(venta);
              
                libros.set(i,AUX);
                }
            
            System.out.println(libros.get(i));
    }
        System.out.println("\nInventario Actualizado");
    }
 
    
    public static void MayoresCosto(){
        Inventario mayor1 = libros.get(0);
        Inventario mayor2 = libros.get(0);
        Inventario mayor3 = libros.get(0);
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()> mayor1.getPrecio()){
                mayor1 = libros.get(i);
            }
        }
        
        
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()< mayor1.getPrecio() && libros.get(i).getPrecio()> mayor2.getPrecio()){
                mayor2 = libros.get(i);
            }
        }
        
        
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()< mayor1.getPrecio() && libros.get(i).getPrecio()< mayor2.getPrecio() && libros.get(i).getPrecio()> mayor3.getPrecio()){
                mayor3 = libros.get(i);
            }
        }
        
        
        System.out.println("\nLos 3 libros mas costosos");
        System.out.println(mayor1);
        System.out.println(mayor2);
        System.out.println(mayor3);
    }
    
    
    public static void main(String[] args) {
       Solicitar();
       Consultar();
       ActualizarVenta();
       MayoresCosto();
    }    
}
