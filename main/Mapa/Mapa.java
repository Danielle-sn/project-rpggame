package Mapa;

import java.awt.Dimension;

import java.awt.Color;

import javax.swing.JPanel;

public class Mapa extends JPanel implements Runnable {

    //SCREE SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale =3;

    final int tileSize = originalTileSize * scale; //48x48
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    Thread gameThread; // iniciar o tempo no jogo, pode iniciar e parar, deixa o programa rodando até parar

    public Mapa() {

            this.setPreferredSize(new Dimension(screenWidth, screenHeight));
            this.setBackground(Color.black);
            this.setDoubleBuffered(true);
    }

    public void startGameThred() {

        gameThread = new Thread(this); //passando mapa para esse construtor
        gameThread.start(); //automaticamente chamar run method

    }

    @Override
    public void run() {

        //GAME LOOP

        while(gameThread != null) {

            System.out.println("O jogo esta rodando");
        }
    }
}
