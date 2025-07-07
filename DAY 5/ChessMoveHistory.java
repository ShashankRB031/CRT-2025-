// Node to store each move
class Move {
    String from; // e.g., "e2"
    String to;   // e.g., "e4"
    String capturedPiece;
    Move prev, next;

    public Move(String from, String to, String capturedPiece) {
        this.from = from;
        this.to = to;
        this.capturedPiece = capturedPiece;
        this.prev = null;
        this.next = null;
    }
}

public class ChessMoveHistory {
    private Move head;
    private Move current;

    // Add a move to the list
    public void makeMove(String from, String to, String capturedPiece) {
        Move newMove = new Move(from, to, capturedPiece);

        if (current != null) {
            // Remove all future moves after undo
            current.next = null;
            newMove.prev = current;
        } else {
            head = newMove;
        }

        if (current != null) current.next = newMove;
        current = newMove;
    }

    // Undo last move
    public void undo() {
        if (current != null) {
            System.out.println("Undo: " + current.from + " -> " + current.to);
            current = current.prev;
        } else {
            System.out.println("No move to undo.");
        }
    }

    // Redo the next move
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.from + " -> " + current.to);
        } else if (current == null && head != null) {
            current = head;
            System.out.println("Redo: " + current.from + " -> " + current.to);
        } else {
            System.out.println("No move to redo.");
        }
    }

    // Print move history
    public void printHistory() {
        System.out.println("Move History:");
        Move temp = head;
        while (temp != null) {
            System.out.println(temp.from + " -> " + temp.to + 
                (temp.capturedPiece != null ? " (Captured: " + temp.capturedPiece + ")" : ""));
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ChessMoveHistory history = new ChessMoveHistory();

        history.makeMove("e2", "e4", null);
        history.makeMove("e7", "e5", null);
        history.makeMove("g1", "f3", null);
        history.makeMove("b8", "c6", null);
        history.makeMove("f1", "c4", null);

        history.printHistory();

        history.undo();
        history.undo();

        history.redo();
        history.makeMove("f1", "b5", null);  // New move after undo clears future moves

        history.printHistory();
    }
}
