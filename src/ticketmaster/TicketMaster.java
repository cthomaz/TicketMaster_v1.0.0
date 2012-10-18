/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmaster;

import Exception.PapelMoedaInvalidaException;
import Exception.SaldoInsuficienteException;

/**
 *
 * @author 40715231
 */
public class TicketMaster {        
    
    private PapelMoeda dinheiro;
    private int precoDoBilhete;
    private int saldo;
    
    public TicketMaster(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
    }
    
    public void inserir(int quantia) throws PapelMoedaInvalidaException{
        if(quantia == 1 
                || quantia == 2 
                || quantia == 5 
                || quantia == 10 
                || quantia == 20 
                || quantia == 50 
                || quantia == 100){            
            dinheiro = new PapelMoeda(quantia, 1);
            saldo = saldo + dinheiro.getValor();
        }
        else throw new PapelMoedaInvalidaException();
    }
    
    public int getSaldo(){        
        return saldo;
    }
    
    public int getTroco() throws SaldoInsuficienteException{
        int troco = this.saldo;
        this.saldo = 0;
        if (troco == 0)
            throw new SaldoInsuficienteException();
        return troco;
    }
    
    public String imprimir() throws SaldoInsuficienteException{        
        if(this.saldo >= precoDoBilhete)
            this.saldo = saldo - precoDoBilhete;
        else throw new SaldoInsuficienteException();        
        return Integer.toString(this.saldo);        
    }
}
