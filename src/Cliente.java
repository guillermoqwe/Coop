/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Cliente extends Usuario implements Cli {

    public Cliente(String Cuentas) {
        super(Cuentas);
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String MostrarUsuario() {
        return("Dame las carateristicas de los clientes ");

    }

    @Override
    public void setCuentas(String cuentas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int setEdad(int Numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Domicilio() {
    }

    @Override
    public void Curp() {
    }

    @Override
    public void Acta() {
    }

    @Override
    public void Dinero() {
    }
    
    
}
