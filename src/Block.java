import java.util.ArrayList;

public interface Block {

    /**
     *holds blocks parts coordinates
     */
    ArrayList<ArrayList<Integer>> coordinates=null;

    /**
     * moves the block in given direction,
     * returns if block can move downwards to detect when block has reached bottom point for it.
     * @param moveDirection
     * @return can block move downwards.
     */
    public boolean move(MoveDirection moveDirection);

    /**
     * Rotates block in given direction
     * @param rotationDirection
     */
    public void rotate(RotationDirection rotationDirection);

    // TODO: 18.1.2024 add pointThySelf Method

    /**
     * removes coordinates from the block,
     * primarily used when a row is removed when it becomes full during the game.
     * @param coordinates
     */
    public void removeCoordinates(int[][]coordinates);
}