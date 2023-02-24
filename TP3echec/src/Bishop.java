import java.util.List;

public class Bishop extends Pieces {
    public Bishop(boolean color) {
        super(color);
    }

    @Override
    public String name() {
        return "B"+colorName();
    }

    @Override
    public List<Position> canMoveTo(Chess chess, Position fromPos) {
        return null;
    }
}
