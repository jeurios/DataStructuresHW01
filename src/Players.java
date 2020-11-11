public class Players {


    static int playerCount = 0;
    //Oyuncuları yarat
    public static void playerInit(double playerNumber){
        while(playerCount != playerNumber){

        for (int j = 1; j < Tiles.tilesRef.length; j++){

            if (playerCount == playerNumber){
                break;
            }
            for (int k = 0; k < Tiles.tilesRef[j].length; k++){

                double rand =
                    (int)(Math.random() * (Tiles.tilesRef.length *
                            Tiles.tilesRef[0].length) / playerNumber);

                if (rand == 0){
                    Tiles.tilesRef[j][k] = 1;
                    playerCount++;
                    if (playerCount == playerNumber){
                        break;
                    }
                }
            }
        }
        }
    }

    public static void move(){
    byte temp = 0;

        for (int i = 0; i < Tiles.tilesRef.length; i++){
            for (int j = 0; j < Tiles.tilesRef[i].length; j++){
                if (Tiles.tilesRef[i][j] == 1){
                    int rand = (int)(Math.random() * 4);

                    if (rand == 0 && Tiles.tilesRef[i-1][j] != 2 &&
                            Tiles.tilesRef[i-1][j] != 3){

                        if (Tiles.tilesRef[i-1][j] == 4){
                            Starter.gameHasWon = true;
                        }
                        temp = Tiles.tilesRef[i-1][j];
                        Tiles.tilesRef[i-1][j] = Tiles.tilesRef[i][j];
                        Tiles.tilesRef[i][j] = temp;
                    }
                    else if (rand == 1 &&
                            Tiles.tilesRef[i][j] !=
                            Tiles.tilesRef[i][Tiles.tilesRef[i].length - 1] &&
                            (Tiles.tilesRef[i][j+1] == 0 ||
                            Tiles.tilesRef[i][j+1] == 1)){

                        temp = Tiles.tilesRef[i][j+1];
                        Tiles.tilesRef[i][j+1] = Tiles.tilesRef[i][j];
                        Tiles.tilesRef[i][j] = temp;
                    }
                    else if (rand == 2 &&
                            Tiles.tilesRef[i][j] !=
                            Tiles.tilesRef[Tiles.tilesRef.length - 1][j] &&
                            (Tiles.tilesRef[i+1][j] == 0 ||
                            Tiles.tilesRef[i+1][j] == 1)){

                        temp = Tiles.tilesRef[i+1][j];
                        Tiles.tilesRef[i+1][j] = Tiles.tilesRef[i][j];
                        Tiles.tilesRef[i][j] = temp;
                    }
                    else if (rand == 3 &&
                            Tiles.tilesRef[i][j] !=
                            Tiles.tilesRef[i][0] &&
                            (Tiles.tilesRef[i][j-1] == 0 ||
                            Tiles.tilesRef[i][j-1] == 1)){

                        temp = Tiles.tilesRef[i][j-1];
                        Tiles.tilesRef[i][j-1] = Tiles.tilesRef[i][j];
                        Tiles.tilesRef[i][j] = temp;
                    }
                }
            }
        }

    }
}
