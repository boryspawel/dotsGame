package modules;

import java.util.HashSet;

/**
 * Created by Abcd on 2017-04-04.
 */
public class Workspace {
    private Integer[][] dotWorkspace;
    private HashSet<DotPosition> neighbours = new HashSet<DotPosition>();
    private DotPosition dotPosition;

    public Integer[][] getDotWorkspace() {
        return dotWorkspace;

    }

    public void setDotWorkspace(Integer[][] dotWorkspace) {
        this.dotWorkspace = dotWorkspace;
    }

    public Workspace() {
    }
    public void fill() {
        Integer[][] dotWorkspace = new Integer[51][51];
        for (int i = 1; i < 50; i++) {
            for (int j = 1; j < 50; j++) {
                dotWorkspace[i][j] = -1;
            }
        }
        setDotWorkspace(dotWorkspace);
    }

    public Integer[][] addPos(int posX, int posY, int color) {
        if (color == 0) {
            dotWorkspace[posX][posY] = 0;
        } else {
            dotWorkspace[posX][posY] = 1;
        }
        setDotWorkspace(dotWorkspace);
        return dotWorkspace;
    }

}
