

import javax.swing.JFrame;

import Mapa.Mapa;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // não vai ser resizable
        window.setTitle("Guardioes das Lendas Antigas");

        Mapa mapa = new Mapa();
        window.add(mapa);

        window.pack();

        window.setLocationRelativeTo(null); // vai estar no centro
        window.setVisible(true);

        mapa.startGameThred();


    }
}
