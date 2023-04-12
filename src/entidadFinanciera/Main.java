/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        try {
            CCuenta objetoCuenta;
            double saldoActual;
            
            
            
            objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
            saldoActual = objetoCuenta.estado();
            System.out.println("El saldo actual es"+ saldoActual );
            
            probarIngresar(objetoCuenta, 3000, 3000);
            probarRetirar(objetoCuenta, 1000, 1000);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    }
}
