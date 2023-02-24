import java.util.List;

public class Pawn extends Pieces {
    public Pawn(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "P"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }


}
