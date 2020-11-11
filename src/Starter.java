public class Starter {
    static boolean gameHasWon = false;
    static int turnCount = 2;

    public static void gameStart(){
        while(!gameHasWon){
            System.out.println(" ");
            System.out.println("Turn : " + turnCount);
            Players.move();
            Tiles.showTiles();
            System.out.println(" ");
            if (gameHasWon){
                System.out.println("\nYou have won the game at " + turnCount +
                        ". turn.\nCONGRATULATIONS!");
            }
            turnCount++;
        }
    }
}
