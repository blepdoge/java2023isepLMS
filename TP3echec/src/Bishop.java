import java.util.ArrayList;
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
    public List<Position> canMoveTo(boolean currColor, Chess chess, Position fromPos) {
        List<Position> sp = new ArrayList<Position>();
        int startRow = fromPos.row;
        int startCol = fromPos.col;

        computeDiagonal(currColor, chess, sp, startRow, startCol, Math.min(8-startRow,8-startCol),1, 1);
        computeDiagonal(currColor, chess, sp, startRow, startCol, Math.min(startRow,8-startCol), -1, 1);
        computeDiagonal(currColor, chess, sp, startRow, startCol, Math.min(startRow,startCol), -1, -1);
        computeDiagonal(currColor, chess, sp, startRow, startCol, Math.min(8-startRow,startCol), 1, -1);
        return sp;


    }

    private void computeDiagonal(boolean currColor, Chess chess, List<Position> sp, int startRow, int startCol, int min, int i, int j) {
        int iMax = 8 - Math.max(startRow, startCol);
        for (int i1 = 1; i1<iMax; i1++) {
            Cell cell = chess.getCell(startRow+i1, startCol+i1);
            Pieces piece = cell.getPiece();
            if (piece==null) {
                sp.add(cell.pos);
            } else {
                if (piece.color!=color) {
                    sp.add(cell.pos);
                }
                break;
            }
        }
    }


}
