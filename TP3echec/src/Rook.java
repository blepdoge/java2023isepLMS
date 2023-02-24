import java.util.List;

public class Rook extends Pieces{
    public Rook(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "R"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }

}
