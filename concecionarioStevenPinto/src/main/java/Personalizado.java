/*
 * @author stevenpc
 * @Description clase para vehiculos Personalizado
 */
public class Personalizado extends Vehiculo  {
    
    int codPersonalizado;
    public String vidrios;
    public String rines;
       
   /*
 *
 * @author stevenpc
 * @Description constructor de la clase Personalizado
 * @param codPersonalizado
 * @param vidrios
 * @param rines
 */
    public Personalizado(int codPersonalizado, String vidrios, String rines, String cogineria) {
        this.codPersonalizado = codPersonalizado;
        this.vidrios = vidrios;
        this.rines = rines;
        this.cogineria = cogineria;
    }

    public Personalizado() {
    }
    
      /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */
    public String cogineria;

    public int getCodPersonalizado() {
        return codPersonalizado;
    }

    public void setCodPersonalizado(int codPersonalizado) {
        this.codPersonalizado = codPersonalizado;
    }

    public String getVidrios() {
        return vidrios;
    }

    public void setVidrios(String vidrios) {
        this.vidrios = vidrios;
    }

    public String getRines() {
        return rines;
    }

    public void setRines(String rines) {
        this.rines = rines;
    }

    public String getCogineria() {
        return cogineria;
    }

    public void setCogineria(String cogineria) {
        this.cogineria = cogineria;
    }
    
    
}
