public class Position {
    public final int row;
    public final int col;
    public final String positionName;
    public static String rowToName(int row){
        return ""+(8-row);
    }
    public static String colToName(int col){
        return ""+(char)('a'+col);
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
        this.positionName = colToName(col)+rowToName(row);
    }
}
