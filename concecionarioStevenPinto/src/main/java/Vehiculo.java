/**
 * @author stevenpc
 * @Description clase padre que tiene los atributos 
 */
public class Vehiculo {
 int codVehiculo;
 public String marca;
 public int modelo;
 public float costo;
 public String color;

 /*
 *
 * @author stevenpc
 * @Description constructor de la clase Vehiculo
 * @param codVehiculo
 * @param marca
 * @param modelo
 * @param costo
 * @param  color
 */
    public Vehiculo(int codVehiculo, String marca, int modelo, float costo, String color) {
        this.codVehiculo = codVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.color = color;
    }

    public Vehiculo() { 
    }
   /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */
    public int getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(int codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 

}
