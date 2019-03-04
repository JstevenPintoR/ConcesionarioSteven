
import java.util.ArrayList;



/**
 *
 * @author stevenpc
 */
public class Quemado {
    ArrayList <Estandar>  estandar = new ArrayList <>();
    ArrayList <Deportivo>  deportivo = new ArrayList <>();
    ArrayList <Mpesada>  mpesada = new ArrayList <>();
     ArrayList <Personalizado>  personalizado = new ArrayList <>();
     
 /*
     *@Descripcion constructor para realizar y llamar las funciones que abajo se realizan
     
     */    
     public Quemado () {
    
         Estandar();
         Deportivos();
         Mpesada();
         Personalizado();
    
}
     /*
     *@funciones en las cuales se ingresan los datos de las clases.
     
     */
     
     public void Estandar (){
         
         Estandar es = new Estandar ();
         es.setCodigoEstandar(1);
         es.setCaja("mecanica");
         es.setCilindraje(1200);
         es.setColor("rojo");
         es.setCosto(20000000);
         es.setMarca("Renautl");
         es.setModelo(2009);
         estandar.add(es);
         
         Estandar es1 = new Estandar ();
         es1.setCodigoEstandar(2);
         es1.setCaja("mecanica");
         es1.setCilindraje(1300);
         es1.setColor("verde");
         es1.setCosto(40000000);
         es1.setMarca("kia");
         es1.setModelo(2012);
         estandar.add(es1);
         
         Estandar es2 = new Estandar ();
         es2.setCodigoEstandar(3);
         es2.setCaja("automatico");
         es2.setCilindraje(1600);
         es2.setColor("morado");
         es2.setCosto(50000000);
         es2.setMarca("mazda");
         es2.setModelo(2018);
         estandar.add(es2); 
     }
     
    public void Deportivos (){
    
         Deportivo de = new Deportivo ();
         de.setCodDeportivo(1);
         de.setModelo(2002);
         de.setMarca("Mazda");
         de.setDescapotable("si");
         de.setCosto(200000000);
         de.setColor("verde");
         de.setCilindraje(2000);
         de.setCaja("automatico");
         deportivo.add(de);
         
         Deportivo de1 = new Deportivo ();
         de1.setCodDeportivo(2);
         de1.setModelo(2004);
         de1.setMarca("kia");
         de1.setDescapotable("no");
         de1.setCosto(30000000);
         de1.setColor("gris");
         de1.setCilindraje(2000);
         de1.setCaja("Mecanico");
         deportivo.add(de1);
    
         
         Deportivo de2 = new Deportivo ();
         de2.setCodDeportivo(3);
         de2.setModelo(2002);
         de2.setMarca("Renault");
         de2.setDescapotable("si");
         de2.setCosto(45000000);
         de2.setColor("Negro");
         de2.setCilindraje(2000);
         de2.setCaja("automatico");
         deportivo.add(de2);
} 
     public void Mpesada (){
      
         Mpesada mp = new Mpesada ();
         mp.setCodigoMpesada(1);
         mp.setTipoMaquina("Tractor");
         mp.setPeso("1ton");
         mp.setModelo(2010);
         mp.setMarca("Cat");
         mp.setEjes("4");
         mp.setCosto(80000000);
         mp.setColor("amarillo");
         mpesada.add(mp);
         
        
         
         Mpesada mp1 = new Mpesada ();
         mp1.setCodigoMpesada(2);
         mp1.setTipoMaquina("escabadora");
         mp1.setPeso("2ton");
         mp1.setModelo(2013);
         mp1.setMarca("Cat");
         mp1.setEjes("5");
         mp1.setCosto(1200000000);
         mp1.setColor("amarillo");
         mpesada.add(mp1);

         Mpesada mp2 = new Mpesada ();
         mp2.setCodigoMpesada(3);
         mp2.setTipoMaquina("Furgon");
         mp2.setPeso("3ton");
         mp2.setModelo(2017);
         mp2.setMarca("Cat");
         mp2.setEjes("6");
         mp2.setCosto(200000000);
         mp2.setColor("azul");
         mpesada.add(mp2);
     }
     
 public void Personalizado (){
    
         Personalizado pe = new Personalizado ();
         pe.setCodPersonalizado(1);
         pe.setModelo(2002);
         pe.setMarca("Mazda");
         pe.setCogineria("cuero");
         pe.setCosto(200000000);
         pe.setColor("verde");
         pe.setVidrios("electricos");
        
         personalizado.add(pe);
 }
}






