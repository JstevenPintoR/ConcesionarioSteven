/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class Venta {
    
    private int codVenta;
    public int codVehiculo;

    public Venta(int codVenta, int codVehiculo) {
        this.codVenta = codVenta;
        this.codVehiculo = codVehiculo;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public int getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(int codVehiculo) {
        this.codVehiculo = codVehiculo;
    }
    
}
