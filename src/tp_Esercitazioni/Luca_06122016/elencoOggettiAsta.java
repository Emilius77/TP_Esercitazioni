/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_Esercitazioni.Luca_06122016;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class elencoOggettiAsta {
    String nomeAsta;
    ArrayList<oggettoAsta> elencoOggetti= new ArrayList<oggettoAsta>();
    
    public void addOggettoAsta(oggettoAsta o){
    elencoOggetti.add(o);
    }
}
