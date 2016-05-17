/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */

public class AgendaUtil {

    private static JPanel panelBase;
    
    public static void iniciar(JPanel _panelBase){
        panelBase = _panelBase;
    }
    
    public static void addTela(JPanel tela){
        panelBase.add(tela, tela.getClass().getName());        
    }
    
    public static void mostrar(String name){
        CardLayout layout = (CardLayout) panelBase.getLayout();
        layout.show(panelBase, name);
    }

    
}

    

