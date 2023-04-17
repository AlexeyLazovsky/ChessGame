import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player : players) {

            System.out.println(player);
        }

       HashMap<String, Piece > pieceHashMap= main.createPieces();
        System.out.println(pieceHashMap);

        main.play(players, pieceHashMap);
    }


//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);
//
//        try {
//            whitePlayer.setRank(10000);
//            //    blackPlayer.setRank(-10000);
//        } catch (IllegalArgumentException err) {
//            System.out.println("please update rank to valid");
//        }
//        System.out.println(whitePlayer.getRank());
//    }

        public ArrayList <Player> createPlayers () {
            Player whitePlayer = new Player("Beth Harmon", "Beth.harmon@gmail.com", true, 2000, 20);
            Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@gmail.com", false, 2500, 45);

            ArrayList<Player> players = new ArrayList<>();
            players.add(whitePlayer);
            players.add(blackPlayer);
            return players;

        }

        public HashMap<String,Piece> createPieces(){
        King whiteKing=new King(new Spot("h",7),"White King",true);
        King blackKing=new King(new Spot("D",8),"Black King",false);
            Rook whiteRook1=new Rook(new Spot("A",7),"White Rook1",true);
            Rook whiteRook2=new Rook(new Spot("G",7),"White Rook",true);
            Knight blackKnight1= new Knight(new Spot("D",6),"Black Knight1", false);


HashMap<String, Piece> pieceHashMap=new HashMap<>();
pieceHashMap.put(whiteKing.getId(),whiteKing);
pieceHashMap.put(blackKing.getId(),blackKing);
pieceHashMap.put(whiteRook1.getId(),whiteRook1);
pieceHashMap.put(whiteRook2.getId(),whiteRook2);
pieceHashMap.put(blackKnight1.getId(),blackKnight1);
return pieceHashMap;



        }
        public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap){
        // move 1
            players.get(0).movePiece(hashMap.get("White Rook1"),new Spot("A",8));
            players.get(1).movePiece(hashMap.get("Black Knight1"), new Spot ("c",8));
        }

    }

