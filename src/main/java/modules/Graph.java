package modules;

import java.util.HashSet;
import java.util.Stack;


public class Graph {
    private Stack<DotPosition> stack;
    private int posX;
    private int posY;
    private int color;
    private Integer[][] workspace;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setStack(Stack<DotPosition> stack) {
        this.stack = stack;
    }

    public Graph() {
        stack = new Stack<DotPosition>();


    }

    public Boolean checkWiner(Integer[][] workspace, int posX, int posY, int color) {
        this.workspace = workspace;
        stack.clear();
        DotPosition w;
        DotPosition v;
        DotPosition z = null;
        HashSet<DotPosition> path = new HashSet<DotPosition>();

        boolean[][] visited = new boolean[50][50];
        stack.push(new DotPosition(posX, posY));
        stack.push(new DotPosition(posX, posY));

        visited[posX][posY] = true;
        while (!stack.isEmpty()) {

            if (path.contains(z)) {
                return true;

            }

            w = stack.pop();
            v = stack.pop();

            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    z = (new DotPosition(v.getCoordinateX() + i, v.getCoordinateY() + j));
                    if ((workspace[v.getCoordinateX() + i][v.getCoordinateY() + j]) == color && (visited[v.getCoordinateX() + i][v.getCoordinateY() + j]) == false) {
                        stack.push(z);
                        stack.push(v);
                        visited[v.getCoordinateX() + i][v.getCoordinateY() + j] = true;
                        path.add(z);
                    }
                }
            }
        }
        return false;
    }
}




