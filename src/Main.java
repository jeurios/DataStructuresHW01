import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Tile Game!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tile height : ");
        int tileHeight = sc.nextInt();
        System.out.print("Enter tile width : ");
        int tileWidth = sc.nextInt();
        System.out.print("Enter obstacle number : ");
        int obstacleNumber = sc.nextInt();
        System.out.print("Enter player number : ");
        int playerNumber = sc.nextInt();

        Tiles.createTiles(tileHeight,tileWidth);
        Obstacles.createObstacles(obstacleNumber);
        Players.playerInit(playerNumber);

        System.out.println("\nTotal number of players is : " +
                Players.playerCount);
        System.out.println("Total number of obstacles is : " +
                Obstacles.obstacleCount);
        System.out.println("\nTurn : 1");
        Tiles.showTiles();
        System.out.println("");
        Starter.gameStart();


    }


}
