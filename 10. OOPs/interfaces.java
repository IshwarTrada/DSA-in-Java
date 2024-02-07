// Interface
// Multiple Inheritance is possible in java due to interface

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, digonal (all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}