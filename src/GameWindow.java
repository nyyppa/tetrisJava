import javax.swing.*;


public class GameWindow  extends JFrame {
    /**
     * window width
     */
    int sizeX=400;

    /**
     * window height
     */
    int sizeY=500;
    GameWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GameComponent());
        this.setSize(StaticModifiers.windowWidth,StaticModifiers.windowHeight);
        this.setVisible(true);
    }
}
