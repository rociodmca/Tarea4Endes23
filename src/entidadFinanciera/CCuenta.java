/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private static String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Constructor por defecto
     * @version 1.0
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los atributos
     * 
     * @param nom Nombre
     * @param cue Cuenta
     * @param sal Salario
     * @param tipo Tipo
     * @version 1.0
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo que devuelve el saldo de la cuenta
     * 
     * @return saldo
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Metodo que ingresa una determinada cantidad en una cuenta, si la cantidad es negativa
     * lanza una excepcion
     * 
     * @param cantidad Cantidad del ingreso
     * @throws Exception Excepcion general
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que retira una determinada cantidad de una cuenta, si es negativa o es
     * superior a el saldo lanza una excepcion
     * @param cantidad Cantidad de la retirada
     * @throws Exception Excecion general
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the ERRORCANTIDADNEGATIVA
     */
    public static String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     * @param aERRORCANTIDADNEGATIVA the ERRORCANTIDADNEGATIVA to set
     */
    public static void setERRORCANTIDADNEGATIVA(String aERRORCANTIDADNEGATIVA) {
        ERRORCANTIDADNEGATIVA = aERRORCANTIDADNEGATIVA;
    }
    
    
}


    
   