package practice3;

public class PieceWorker extends Employee {

    private static final int SALARY_PER_PIECE = 100;

    private int piecesNumber;

    public PieceWorker(int id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        return getPiecesNumber() * SALARY_PER_PIECE;
    }

    public int getPiecesNumber() {
        return piecesNumber;
    }

    public void setPiecesNumber(int piecesNumber) {
        this.piecesNumber = piecesNumber;
    }

    @Override
    public String toString() {
        return "PieceWorker{" +
                "piecesNumber=" + piecesNumber +
                '}';
    }
}
