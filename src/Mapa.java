
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.datatransfer.SystemFlavorMap;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class Mapa extends JPanel implements Runnable {

    //SCREE SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale =3;

    final int tileSize = originalTileSize * scale; //48x48
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
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




    public Mapa() {

            this.setPreferredSize(new Dimension(screenWidth, screenHeight));
            this.setBackground(Color.black);
            this.setDoubleBuffered(true);
            this.addKeyListener(keyH);
            this.setFocusable(true);
    }

    public void startGameThred() {

        gameThread = new Thread(this); //passando mapa para esse construtor
        gameThread.start(); //automaticamente chamar run method

    }

    @Override
    public void run() {

        double drawInterval = 1000000000/fps; // 0.01666
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
                double remaininTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if(remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long)remaininTime);

                nextDrawTime += drawInterval;
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            


        }
    }


    public void update(){

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

            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;

            g2.setColor(Color.white);
            g2.fillRect(playerX, playerY, tileSize, tileSize);
            g2.dispose();
    }




}
