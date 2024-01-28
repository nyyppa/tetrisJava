import java.awt.*;
import java.util.ArrayList;

public class BasicBlock implements Block{

    /**
     *holds blocks parts coordinates
     */
    ArrayList<Coordinate> coordinates = null;
    Color color=Color.BLUE;

    public BasicBlock(ArrayList<Coordinate> InitialCoordinates){
        coordinates=InitialCoordinates;
    }

    @Override
    public boolean move(MoveDirection moveDirection) {
        return false;
    }

    @Override
    public void rotate(RotationDirection rotationDirection) {

    }

    @Override
    public void paintYourSelf(Graphics g) {
        for(Coordinate coordinate:coordinates){
            g.setColor(color);
            g.fillRect(StaticModifiers.getLineWidth()+coordinate.getX()*StaticModifiers.getBlockWidth()+StaticModifiers.getLineWidth()*coordinate.getX(),StaticModifiers.getLineWidth()+coordinate.getY()*StaticModifiers.getBlockHeight()+StaticModifiers.getLineWidth()*coordinate.getY(),StaticModifiers.getBlockWidth(),StaticModifiers.getBlockHeight());
        }
    }

    @Override
    public void removeCoordinates(int[][] coordinates) {

    }
}
