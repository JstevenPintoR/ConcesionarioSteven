import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
   *@Description clase que contiene los atributos del inventario y los metodos propios del mismo
 * @author Stevenpc
 */
public class Stock {
    Scanner datos = new Scanner(System.in);
    /**
     * atributo que contiene el codigo del inventario
     */
    private int codStock;
   
    /**
     * objeto que controla los atributos de los autos deportivos
     */
    Deportivo deportivo = new Deportivo();
    /**
     * objeto que contiene los atributos de los autos estandar
     */
    Estandar estandar = new Estandar();
    /**
     * objeto que contiene los atributos de los vehiculos de tipo maquinaria pesada
     */
    Mpesada mpesada = new Mpesada();
    /**
     * objeto que contiene los atributos de los vehiculos personalizados
     */
    Personalizado  personalizado = new Personalizado ();
    /**
     * array que contiene los vehculos deportivos
     */
    ArrayList<Deportivo> listaDeportivo = new ArrayList();
    /**
     * array que contiene los vehiculos estandar
     */
    ArrayList<Estandar> listaEstandar = new ArrayList();
    /**
     * array que contiene los vehiculos tipo maquinaria pesada
     */
    ArrayList<Mpesada> listaMaquinaria = new ArrayList();
    /**
     * array que contiene los vehiculos personalizados
     */
    ArrayList<Personalizado> listaPersonalizado = new ArrayList();
    /**
     * array que contiene el inventario general del consecionario
     */
  
    ArrayList<Vehiculo> stock = new ArrayList<>();
    
    /**
     * constructor que incializa las variables
     */
    public Stock() {
    }//constructor
    /**
     * metodo que enseña el menu de seleccion y rediige segun la opcion
     */
    public void MenuAgregar(){
        byte opcion;
        
        do{
        System.out.println("Seleccione el tipo de vehiculo a agregar:");
        System.out.println("1.Deportivo.");
        System.out.println("2.Estandar.");
        System.out.println("3.Maquinaria Pesada.");
        System.out.println("4.Personalizado.");
        System.out.println("5. El vehiculo mas costoso.");
        System.out.println("6. EL vehiculo mas Economico.");
        System.out.println("7.Vehiculos Estandar.");
        System.out.println("8.Vehiculos Deportivos.");
        System.out.println("9.Vehiculos Maquinaria Pesada.");
        System.out.println("10.Vehiculos Personalizados.");
        opcion = datos.nextByte();      
        
       switch(opcion){
            case 1:{
                AgregarDeportivo( );
                break;
            }case 2:{
                AgregarEstandar( );
                break;
            }case 3:{
                AgregarMpesada( );
                break;
            }case 4:{
                AgregarPersonalizado( );
                break;
            }case 5:{
                MasCaro( );
                 break;
            }case 6:{
                MasBarato( );
                break;
            }case 7:{
                imprimirEstandar();
                break;
            }case 8:{
                imprimirDeportivo();
                break;
            }case 9:{
                imprimirMpesada();
                break;
            }case 10:{
                imprimirPersonalizado();
                break;
            }default:{
                System.out.println("Entrada incorrecta");
                break;
             }}
        }while(opcion != 10);
        
        }   /**
      /**
     * metodo que permite agregar un vehiculo deportivo
     */
         public void AgregarDeportivo(){
        System.out.println("Ingrese codigo del vehiculo: ");
        deportivo.codDeportivo = datos.nextInt();
        System.out.println("Ingrese color del vehiculo: ");
        deportivo.color = datos.next();
        System.out.println("Ingrese marca del vehiculo: ");
        deportivo.marca = datos.next();
        System.out.println("Ingrese precio del vehiculo: ");
        deportivo.costo = datos.nextFloat();
        System.out.println("Ingrese cilindraje del vehiculo: ");
        deportivo.setCilindraje(datos.nextInt());
        System.out.println("Ingrese modelo del vehiculo: ");
        deportivo.setModelo(datos.nextInt());
        listaDeportivo.add(deportivo);
        agregarInventario(deportivo);
        MenuAgregar();
    }//AgregarEstandar
    /**
     * metodo que permite agregar un vehiculo Estandar
     */
    public void AgregarEstandar(){
        System.out.println("Ingrese codigo del vehiculo: ");
        estandar.codigoEstandar = datos.nextInt();
        System.out.println("Ingrese color del vehiculo: ");
        estandar.color = datos.next();
        System.out.println("Ingrese tipo de caja del vehiculo: ");
        estandar.caja = datos.next();
        System.out.println("Ingrese marca del vehiculo: ");
        estandar.marca = datos.next();
        System.out.println("Ingrese precio del vehiculo: ");
        estandar.costo = datos.nextFloat();
        System.out.println("Ingrese cilinfdraje del vehiculo: ");
        estandar.cilindraje = datos.nextFloat();        
        listaEstandar.add(estandar);
        agregarInventario(estandar);
        MenuAgregar();
    }//AgregarMpesada
    /**
     * metodo que permite agregar un vehiculo de tipo maquinaria pesada
     */
    public void AgregarMpesada(){
        System.out.println("Ingrese codigo del vehiculo: ");
        mpesada.codigoMpesada = datos.nextInt();
        System.out.println("Ingrese el peso del vehiculo: ");
        mpesada.peso = datos.next();
        System.out.println("Ingrese color del vehiculo: ");
        mpesada.color = datos.next();
        System.out.println("Ingrese marca del vehiculo: ");
        mpesada.marca = datos.next();
        System.out.println("Ingrese precio del vehiculo: ");
        mpesada.costo = datos.nextFloat();
        System.out.println("Ingrese el numero de ejes del vehiculo: ");
        mpesada.ejes = datos.next();
        listaMaquinaria.add(mpesada);
        agregarInventario(mpesada);
        MenuAgregar();
    }//AgregarPersonalizado
    /**
     * metodo que permite agregar un vehiculo persoalizado
     */
    public void AgregarPersonalizado(){
        System.out.println("Ingrese Id del vehiculo: ");
        personalizado.codPersonalizado = datos.nextInt();
        System.out.println("Ingrese tipo de vidrios del vehiculo: ");
        personalizado.vidrios = datos.next();
        System.out.println("Ingrese color del vehiculo: ");
        personalizado.color = datos.next();
        System.out.println("Ingrese marca del vehiculo: ");
        personalizado.marca = datos.next();
        System.out.println("Ingrese precio del vehiculo: ");
        personalizado.costo = datos.nextFloat();
        System.out.println("Ingrese el tipo de rines si son de lujo o no del vehiculo: ");
        personalizado.rines = datos.next();
        listaPersonalizado.add(personalizado);
        agregarInventario(personalizado);
        MenuAgregar();
    }//AgregarPersonalizado
    /**
     * Metodo que agrega los vehiculos al inventario general
     * @param vehiculo 
     */
    public void agregarInventario(Vehiculo vehiculo){
        stock.add(vehiculo);
    }//agregarInventario
    /**
     * metodo que selecciona el vehiculo mas costoso del inventario
     */
    public void MasCaro(){
      float mayor = 0;
      String marca="";
      for(Vehiculo prueba : stock){
          if(prueba.getCosto()>mayor){
              mayor = prueba.costo;
              marca = prueba.marca;
          }//if
      }//for
        System.out.println("El auto mas caro es "+marca+" con un precio de: "+mayor);
    }//MasCaro
    /**
     * metodo que selecciona el vehiculo mas barato del inventario
     */
    public void MasBarato(){
      float menor = 1999999999;
      String marca="";
      for(Vehiculo prueba : stock){
          if(prueba.getCosto()<menor){
              menor = prueba.costo;
              marca = prueba.marca;
          }//if
      }//for
        System.out.println("El auto mas Barato es "+marca+" con un precio de: "+menor);
    }//MasBarato
    /**
     * metodo que lleva a cabo el proceso de venta de vehiculos
     */
    public void venta(){
        int codigo;
        char opcion;
        System.out.println("Ingrese el codigo del vehiculo de venta: ");
        codigo = datos.nextInt();
        List<Vehiculo> venta = new ArrayList<>();
        for (Vehiculo vehiculo : stock) {
            if(vehiculo.codVehiculo == codigo){
                System.out.println("El vehiculo que desea vender es: "+vehiculo.marca+" con un precio de: "+vehiculo.costo);
                System.out.println("¿Es correcto? S/N");
                opcion = datos.next().charAt(0);
                switch(opcion){
                    case 's':{
                        venta.add(vehiculo);
                        stock.remove(vehiculo);
                        comision();
                        break;
                    }case 'n':{
                        venta();
                    }
                }//switch
            }//if
        }//for
    }//venta
    
    
    /*
   @Descripcion de imprimen todos los vehiculos estandar
   */
   
   
   public  void imprimirEstandar(){
       if(listaEstandar.isEmpty()){
           System.out.println("No hay autos Registrados");
       }else{
       for(Estandar estan : listaEstandar){
           System.out.println("CodVehiculo: " + estan.getCodVehiculo() + 
           "\nMarca: " + estan.getMarca() + 
           "\nModelo: " + estan.getModelo() + 
           "\nCosto: " + estan.getCosto() + 
           "\nColor: " + estan.getColor() + 
           "\nCodEstandar: " + estan.getCodigoEstandar() + 
           "\nCilindraje: " + estan.getCilindraje() + 
           "\nCaja: " + estan.getCaja());
       }
       }
       
   }
    /*
   @Descripcion de imprimen todos los vehiculos DEportivos
   */
   
   
   public  void imprimirDeportivo(){
       if(listaDeportivo.isEmpty()){
           System.out.println("No hay autos Registrados");
       }else{
       for(Deportivo depor : listaDeportivo){
           System.out.println("CodVehiculo: " + depor.getCodVehiculo()+
           "\nMarca: " + depor.getMarca() + 
           "\nModelo: " + depor.getModelo() + 
           "\nCosto: " + depor.getCosto() + 
           "\nColor: " + depor.getColor() + 
           "\nCodDeportivo: " + depor.getCodDeportivo()+ 
           "\nCilindraje: " + depor.getCilindraje() + 
           "\nCaja: " + depor.getCaja()+
           "\nDescapotable"+ depor.getDescapotable());
       }
       }
   }
    /*
   @Descripcion de imprimen todos los vehiculos MPesada
   */
   
   public  void imprimirMpesada(){
       if(listaMaquinaria.isEmpty()){
           System.out.println("No hay autos Registrados");
       }else{
       for(Mpesada mp : listaMaquinaria){
           System.out.println("CodVehiculo: " + mp.getCodVehiculo()+
           "\nMarca: " + mp.getMarca() + 
           "\nModelo: " + mp.getModelo() + 
           "\nCosto: " + mp.getCosto() + 
           "\nColor: " + mp.getColor() + 
           "\nCodDeportivo: " + mp.getCodigoMpesada()+ 
           "\nCilindraje: " + mp.getEjes()+ 
           "\nCaja: " + mp.getPeso()+
           "\nDescapotable"+ mp.getTipoMaquina());
       }
       }
       
   }
    /*
   @Descripcion de imprimen todos los vehiculos Personalizados
   */
   
    public   void imprimirPersonalizado(){
       if(listaPersonalizado.isEmpty()){
           System.out.println("No hay autos Registrados");
       }else{
       for(Personalizado per : listaPersonalizado){
           System.out.println("CodVehiculo: " + per.getCodVehiculo() + 
           "\nMarca: " + per.getMarca() + 
           "\nModelo: " + per.getModelo() + 
           "\nCosto: " + per.getCosto() + 
           "\nColor: " + per.getColor() + 
           "\nCogineria: " + per.getCogineria()+ 
           "\nCogineria: " + per.getVidrios()+ 
           "\nRines : " + per.getRines());
       }
       }
   }
    public void comision(){
        float comision;
        
    }//comision
    /**
     * retorna el codigo del inventario
     * @return codInventario
     */
    public int getCodInventario() {
        return codStock;
    }//getCodInventario
    /**
     *modifica el codigo del inventario
     * @param codInventario 
     */
    public void setCodInventario(int codInventario) {
        this.codStock = codInventario;
    }//setCodInventario
    /**
     * retorna el array con los vehiculos deportivos agregados
     * @return listaDeportivo
     */
    public ArrayList<Deportivo> getDeportivo() {
        return listaDeportivo;
    }//getDeportivo
    /**
     * modifica el array con los vehiculos deportivos agregados
     * @param deportivo 
     */
    public void setDeportivo(ArrayList<Deportivo> deportivo) {
        this.listaDeportivo = deportivo;
    }//setDeportivo
    /**
     * retorna el array con los vehiculos estandar agregados
     * @return listaEstandar
     */
    public ArrayList<Estandar> getEstandar() {
        return listaEstandar;
    }//getEstandar
    /**
     * modifica el array con los vehiculos estandar agregados
     * @param estandar 
     */
    public void setEstandar(ArrayList<Estandar> estandar) {
        this.listaEstandar = estandar;
    }//setEstandar
    /**
     *retorna el array con los vehiculos tipo maquinaria pesada agragados 
     * @return listaMaquinaria
     */
    public ArrayList<Mpesada> getMpesada() {
        return listaMaquinaria;
    }//getMaquinaria
    /**
     * modifica el array con los vehiculos de tipo maquinaria pesada agregados
     * @param maquinaria 
     */
    public void setMaquinaria(ArrayList<Mpesada> mpesada) {
        this.listaMaquinaria = mpesada;
    }//setMaquinaria
    /**
     * retorna el array con los vehiculos personalizados agregados
     * @return listaPersonalizados
     */
    public ArrayList<Personalizado> getPersonalizado() {
        return listaPersonalizado;
    }//getPersonalizado
    /**
     * modifica el array con los vehiculos personalizados agregados
     * @param personalizado 
     */
    public void setPersonalizado(ArrayList<Personalizado> personalizado) {
        this.listaPersonalizado = personalizado;
    }//setPersonalizado
    
}//Inventario
