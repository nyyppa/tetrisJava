import javax.swing.*;
import java.awt.*;

public class GameComponent extends JComponent {


    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        for(int i=0;i<StaticModifiers.widthRows;i++){
            g.fillRect(i*StaticModifiers.getLineWidth()+i*StaticModifiers.widthRows,0,StaticModifiers.getLineWidth(),StaticModifiers.windowHeight);
        }
        for(int i=0;i<StaticModifiers.heightRows;i++){
            g.fillRect(0,i*StaticModifiers.getLineWidth()+i*StaticModifiers.heightRows,StaticModifiers.windowWidth,StaticModifiers.getLineWidth());
        }
    }
}
