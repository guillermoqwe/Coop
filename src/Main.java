/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Main {
    public  static void main(String[]args){
        
        Administrador administrador1=new Administrador();
        administrador1.setCuentas("cuentas de el admisnistrador");
        administrador1.getCuenta();
        administrador1.getContraseña();
        Usuario usuario1=new Usuario();
        usuario1.setCuentas("Cuentas Usuario ");
        usuario1.getCuenta();
        usuario1.getContraseña();
        Cliente cliente1= new Cliente();
        cliente1.setCuentas("cuentas Cliete ");
        cliente1.getCuenta();
        cliente1.getContraseña();
        cliente1.getNombre();
        
        administrador1.setCuentas("Cuenta de el adminsitador");
        usuario1.setCuentas( "Cuenta de el usuario");
        cliente1.setCuentas("cuentas de el cliente");
        cliente1.setEdad(18);
        
         System.out.println("Sistema Bancario");
         System.out.println("---------------------------");
         System.out.println("Administador");
         System.out.println(administrador1.setId(2));
         System.out.println("----------------------------");
         System.out.println("Usuario");
         System.out.println(usuario1.setId(4));
         System.out.println("----------------------------");
         System.out.println("Cliente");
         System.out.println(cliente1.setEdad(476136630));
         System.out.println("----------------------------");
         
            
        
         
         
    }
}