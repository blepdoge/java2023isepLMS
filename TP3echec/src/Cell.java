import lombok.Getter;
import lombok.Setter;

public class Cell {
    public final Position pos;
    @Getter @Setter
    private Pieces piece;

    public Cell(Position pos) {
        super();
        this.pos = pos;
    }

    public boolean isEmpty() {
        return piece==null;
    }

}
