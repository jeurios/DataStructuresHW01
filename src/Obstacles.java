public class Obstacles {
    static int obstacleCount = 0;

    public static void createObstacles(double obstacleNumber){

        while(obstacleCount != obstacleNumber) {
            for (int j = 1; j < Tiles.tilesRef.length; j++) {

                if (obstacleCount == obstacleNumber) {
                    break;
                }
                for (int k = 0; k < Tiles.tilesRef[j].length; k++) {

                    double rand =
                            (int) (Math.random() * (Tiles.tilesRef.length *
                                    Tiles.tilesRef[0].length) / obstacleNumber);

                    if (rand == 0 && Tiles.tilesRef[j-1][k] != 4) {
                        Tiles.tilesRef[j][k] = 2;
                        obstacleCount++;
                        if (obstacleCount == obstacleNumber) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
