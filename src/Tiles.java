public class Tiles {
    //0 for empty
    //1 for occupied by player
    //2 for obstacle
    //3 for closed tile
    //4 for finish point
    //Declare tiles array reference
    public static byte[][] tilesRef;

    //Crate array and get the H and W in parameter
    public static void createTiles(int tileHeight, int tileWidth){
        tilesRef = new byte[tileHeight][tileWidth];
        for(int i = 0; i<tilesRef[0].length; i++){
            tilesRef[0][i] = 3;
        }
        tilesRef[0][(int)(Math.random() * tilesRef[0].length)] = 4;
    }

    public static void showTiles(){
        for (int a = 0; a < tilesRef.length; a++){
            System.out.println();
            for (int b = 0; b < tilesRef[a].length; b++)
                System.out.print(Tiles.tilesRef[a][b]);
        }
    }
}
