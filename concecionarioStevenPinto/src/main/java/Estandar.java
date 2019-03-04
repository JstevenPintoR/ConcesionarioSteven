/**
 * @author stevenpc
 * @Description clase para vehiculos Estandar
 */
public class Estandar extends Vehiculo{
     
    int codigoEstandar;
    public float cilindraje;
    public String caja;
 /*
 *
 * @author stevenpc
 * @Description constructor de la clase Estandar
 * @param codEstandar
 * @param Cilndraje
 * @param caje
 */
    public Estandar(int codigoEstandar, float cilindraje, String caja, int codVehiculo, String marca, int modelo, float costo, String color) {
        super(codVehiculo, marca, modelo, costo, color);
        this.codigoEstandar = codigoEstandar;
        this.cilindraje = cilindraje;
        this.caja = caja;
    }

    public Estandar() {
    }

     /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */
    public int getCodigoEstandar() {
        return codigoEstandar;
    }

    public void setCodigoEstandar(int codigoEstandar) {
        this.codigoEstandar = codigoEstandar;
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

}