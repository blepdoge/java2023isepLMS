import java.util.List;

public class Knight extends Pieces{
    public Knight(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "N"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }

}
