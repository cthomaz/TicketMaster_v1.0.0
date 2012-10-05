/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregate;
import Iterator.TrocoIterator;


/**
 *
 * @author 40715231
 */
public class Troco {

    public Troco(int valor) {
    }
    
    public TrocoIterator getIterator(){
        return new TrocoIterator();
    }
    
}
