
import modules.MainFrame;
import modules.Workspace;

/**
 * Created by Abcd on 2017-03-16.
 */
public class run {

    public static int workspaceDimension = 50;

    public static void main(final String[] args) {
        new MainFrame(workspaceDimension);
        Workspace workspace = new Workspace();//create new workspace
        workspace.fill();//fill the workspace by empty spaces represented by(int -1)
//       }
    }

}



