package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns]; // Initialize the matrix with the number of rows and columns
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column) { // Return a piece from the matrix
        return pieces[row][column];
    }

    public Piece piece(Position position) { // Return a piece from the matrix
        return pieces[position.getRow()][position.getColumn()];
    }
    
}
