
import java.util.Scanner;

/**
 *clase que contiene el menu principal
 * @author Stevenpc
 */
public class Menu {
    Scanner datos = new Scanner(System.in);
    /**
     * constructor que inicializa la clase
     */
    public Menu() {
        Inicio();
    }//Construrctor
    
    private void Inicio(){
        byte opcion;
        System.out.println("\tBienvenido");
        System.out.println("Seleccione la opcion deseada:");
        System.out.println("1. Vehiculo.");
        opcion = datos.nextByte();
        Seleccion(opcion);
    }//Inicio
    
    private void Seleccion(byte opcion){
        switch(opcion){
            case 1:{
                Stock inventario = new Stock();
                inventario.MenuAgregar();
                break;
            }//case 1
            case 2:{
                System.out.println("opcion 2");
                break;
            }//case 2
            case 3:{
                System.out.println("opcion 3");
                break;
            }//case 3
            default:{
                System.out.println("default");
                break;
            }//default
        }//switch
    }//seleccion

    
}//Menu
