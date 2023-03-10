import java.util.ArrayList;
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
    public List<Position> canMoveTo(boolean currColor, Chess chess, Position fromPos) {
        List<Position> sp = new ArrayList<Position>();
        int startRow = fromPos.row;
        int startCol = fromPos.col;

        computeMoveLine(currColor, chess, sp, startRow, startCol, Math.min(8-startRow,8-startCol),0, 1);
        computeMoveLine(currColor, chess, sp, startRow, startCol, Math.min(startRow,8-startCol), -1, 0);
        computeMoveLine(currColor, chess, sp, startRow, startCol, Math.min(startRow,startCol), 0, -1);
        computeMoveLine(currColor, chess, sp, startRow, startCol, Math.min(8-startRow,startCol), 1, 0);
        return sp;


    }

    private void computeMoveLine(boolean currColor, Chess chess, List<Position> sp, int startRow, int startCol, int min, int i, int i1) {
    }

}
