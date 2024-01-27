import javax.swing.*;


public class GameWindow  extends JFrame {

    GameWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GameComponent());
        this.setSize(StaticModifiers.windowWidth,StaticModifiers.windowHeight);
        this.setVisible(true);
    }
}
