/**
 *
 * @author stevenpc
 * @Description clase para vehiculos Deportivo
 */
public class Deportivo extends Vehiculo{
    
    int codDeportivo;
    public float cilindraje;
    public String  caja;
    public String descapotable;
 /*
 *
 * @author stevenpc
 * @Description constructor de la clase Deportivo
 * @param codDeportivo
 * @param Cilndraje
 * @param caja
 * @param descapotable
 */
    
    
    
    public Deportivo(int codDeportivo, float cilindraje, String caja, String descapotable) {
        this.codDeportivo = codDeportivo;
        this.cilindraje = cilindraje;
        this.caja = caja;
        this.descapotable = descapotable;
        
    }

        
    public Deportivo(int codVehiculo, String marca, int modelo, float costo, String color) {
        super(codVehiculo, marca, modelo, costo, color);
    }
    
    

    public Deportivo() {
    }

      /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */
    
    
    public int getCodDeportivo() {
        return codDeportivo;
    }

    public void setCodDeportivo(int codDeportivo) {
        this.codDeportivo = codDeportivo;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(String descapotable) {
        this.descapotable = descapotable;
    }

}