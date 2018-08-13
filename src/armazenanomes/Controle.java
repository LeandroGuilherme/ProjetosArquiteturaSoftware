/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazenanomes;

import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Controle {
     
    ArrayList<Usuarios> nomes = new ArrayList();
    
    public void Salvar(Usuarios u){
        nomes.add(u);
    }
    
    public ArrayList imprimir(){
        for (Usuarios nome : nomes) {
            return nomes;
        }
        return null;
    }
    

       
  
    
}
