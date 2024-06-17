package Main;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // não vai ser resizable
        window.setTitle("Guardioes das Lendas Antigas");

        TelaJogo telaJogo = new TelaJogo();
        window.add(telaJogo); // adicionar telaJogo a tela

        window.pack(); // ajusta  ajanela de acordo com as dfinições estabelecidas

        window.setLocationRelativeTo(null); // vai estar no centro
        window.setVisible(true);

        telaJogo.startGameThred();


    }
}
