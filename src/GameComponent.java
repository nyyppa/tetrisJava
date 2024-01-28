import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameComponent extends JComponent {

    ArrayList<Block>blocks=new ArrayList<>();

    public GameComponent(){
        super();
        blocks.add(CreateBlock.createAnyBlock(CreateBlock.blockType.basicBlock));
    }


    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        for(int i=0;i<StaticModifiers.widthRows;i++){
            g.fillRect(i*StaticModifiers.getLineWidth()+i*StaticModifiers.widthRows,0,StaticModifiers.getLineWidth(),StaticModifiers.windowHeight);
        }
        for(int i=0;i<StaticModifiers.heightRows;i++){
            g.fillRect(0,i*StaticModifiers.getLineWidth()+i*StaticModifiers.heightRows,StaticModifiers.windowWidth,StaticModifiers.getLineWidth());
        }
        for(Block block:blocks){
            block.paintYourSelf(g);
        }
    }
}
