/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class Vendedor {
    
    private int codVendedor;
    public String nombreVendedor;
    public String apellidoVendedor;
    public float comision;
    
    /*
 *
 * @author stevenpc
 * @Description constructor de la clase Vendedor
 * @param codVendedor
 * @param apellidoVendedor
 * @param comision
 */

    public Vendedor(int codVendedor, String nombreVendedor, String apellidoVendedor, float comision) {
        this.codVendedor = codVendedor;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.comision = comision;
    }
    
      /*
    @Descripcion Metodos set para recibir los atributos 
    @Descripcion Metodos get para obtener los atributos
    */

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
}
