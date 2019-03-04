 /**
 * @author stevenpc
 * @Description clase para vehiculos MPesada
 */
public class Mpesada extends Vehiculo {
    int codigoMpesada;
    public String peso;
    public String tipoMaquina;
    public String ejes;
 /*
 *
 * @author stevenpc
 * @Description constructor de la clase Estandar
 * @param codMpesada
 * @param peso
 * @param TipoMaquina
 * @param ejes  
 */
    public Mpesada(int codigoMpesada, String peso, String tipoMaquina, String ejes) {
        this.codigoMpesada = codigoMpesada;
        this.peso = peso;
        this.tipoMaquina = tipoMaquina;
        this.ejes = ejes;
    }

    public Mpesada(int codVehiculo, String marca, int modelo, float costo, String color) {
        super(codVehiculo, marca, modelo, costo, color);
    }
    
    

    public Mpesada() {
    }

     /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */
    public int getCodigoMpesada() {
        return codigoMpesada;
    }

    public void setCodigoMpesada(int codigoMpesada) {
        this.codigoMpesada = codigoMpesada;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }
}
    