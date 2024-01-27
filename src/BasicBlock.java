import java.awt.*;
import java.util.ArrayList;

public class BasicBlock implements Block{

    /**
     *holds blocks parts coordinates
     */
    ArrayList<ArrayList<Integer>> coordinates = null;

    public BasicBlock(ArrayList<ArrayList<Integer>> InitialCoordinates){
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

    }

    @Override
    public void removeCoordinates(int[][] coordinates) {

    }
}
