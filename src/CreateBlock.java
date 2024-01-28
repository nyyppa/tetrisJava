import java.util.ArrayList;

public class CreateBlock {

    public enum blockType{basicBlock,square};

    /**
     * creates block of desired type.
     * @param blockType
     * @return
     */
    public static Block createAnyBlock(blockType blockType){
        Block block=null;
        switch (blockType){
            case basicBlock:
                block=createBasicBlock();
                break;
        }
        return block;
    }
    private static BasicBlock createBasicBlock(){
        ArrayList<Coordinate>list=new ArrayList<>();
        list.add(new Coordinate(5,5));
        list.add(new Coordinate(6,5));
        list.add(new Coordinate(5,6));
        list.add(new Coordinate(6,6));
        return new BasicBlock(list);
    }
}
