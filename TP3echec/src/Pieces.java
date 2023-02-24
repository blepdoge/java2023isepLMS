import java.util.List;

public abstract class Pieces {
    public final boolean color;

    public Pieces(boolean color) {
        this.color = color;
    }

    public abstract String name();
    public String colorName() {
        return color?"w":"b";
    }

    public abstract List<Position> canMoveTo(Chess chess, Position fromPos);

}
