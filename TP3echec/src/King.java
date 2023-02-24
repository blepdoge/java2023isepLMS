import java.util.List;

public class King extends Pieces{
    public King(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "K"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }
}
