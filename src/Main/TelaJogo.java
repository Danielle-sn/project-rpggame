package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class TelaJogo extends JPanel implements Runnable {
    // Game screen
    //SCREE SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale =3;

    final int tileSize = originalTileSize * scale; //48x48
    final int maxScreenCol = 16; // total de colunas
    final int maxScreenRow = 12; // total de linhas
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    //FPS
    int fps = 60;

    KeyHandler keyH = new KeyHandler();

    Thread gameThread; // iniciar o tempo no jogo, pode iniciar e parar, deixa o programa rodando até parar


    //posicao padrao player
    int playerX = 100;
    int playerY = 100;
    int playerSpeed =4; //quantidade de pixels para andar ou voltar




    public TelaJogo() {

            this.setPreferredSize(new Dimension(screenWidth, screenHeight));
            this.setBackground(Color.black); // color base da tela
            this.setDoubleBuffered(true); //all the drawing from this component will be done
        // in an offscreen paiting buffer. Using 'true' this an improve game´s rendering performace
            this.addKeyListener(keyH);
            this.setFocusable(true);
    }

    public void startGameThred() {

        gameThread = new Thread(this); //passando mapa para esse construtor
        gameThread.start(); //automaticamente chamar run method

    }

    @Override
    public void run() {

        double drawInterval = 1000000000/fps; // 0.01666 segundos
        double nextDrawTime = System.nanoTime() + drawInterval;

        //GAME LOOP

        while(gameThread != null) {

            long currentTime = System.nanoTime();
        

            System.out.println("O jogo esta rodando");

            // (UPDATE) atualizar informacao como as posicoes dos personagens
            update();

            
            // (DRAW) mostrar na tela essa atualizacao
            repaint();
            
            
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if(remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long)remainingTime);

                nextDrawTime += drawInterval;
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            


        }
    }


    public void update(){
        //  teclas de movimentacao
        if(keyH.upPressed == true) {
            playerY -= playerSpeed; 
        }
        else if (keyH.downPressed == true) {
            playerY += playerSpeed;
        }

        else if (keyH.leftPressed == true){
            playerX -= playerSpeed;
        }
        else if (keyH.rightPressed == true){
            playerX += playerSpeed; 
        }
    }

    public void paintComponent(Graphics g){ //metodo padrao
        // desenhar coisas na tela
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;

            g2.setColor(Color.white);
            g2.fillRect(playerX, playerY, tileSize, tileSize); // desenhou o retângulo na tela
            // fillRect(coord. em x, coord. em y, larg, altura)
            g2.dispose(); // dispose of this graphics context and release any system resources that it is using

    }




}
