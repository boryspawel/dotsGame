package modulew;

/**
 * Created by Abcd on 2017-04-03.
 */
public class Workspace {


    Integer[][] workspace = new Integer[51][51];

    public Workspace() {
    }

    public void addPosWhite(int positionX, int positionY) {
        workspace[positionX][positionY] = 0;
    }

    public void addPosRed(int positionX, int positionY) {
        workspace[positionX][positionY] = 1;
    }

    public void checkWinner(int color, int positionX, int positionY) {


        for (int k = -1; k <= 1; k++) {
            for (int z = -1; z <= 1; z++) {

                if (workspace[positionX + k][positionY + z] == color) {
                    System.out.println(positionX + k + " " + positionY + z);

                }

            }
        }

    }
}

