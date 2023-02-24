import java.util.List;

public class Queen extends Pieces{
    public Queen(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "Q"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }
}
