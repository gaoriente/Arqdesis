/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import javaapplication1.Cliente;

/**
 *
 * @author goriente
 */
public class EfetuarSaqueTeste {
   
    public static void main(String[] args) {
       
        EfetuarSaque es;
        es = new EfetuarSaque(null, null, saldo, saque);
        es.sacar();
        System.out.println(es);
        es.setSaldo(500);
        

    }

}


