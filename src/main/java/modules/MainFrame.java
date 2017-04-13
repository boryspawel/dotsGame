package modules;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame implements ActionListener {

    protected boolean initialState = true;
    private List<JButton> buttons;
    private Container container;
    Workspace workspace = new Workspace();
    Graph graph = new Graph();
    //private Integer[][] wrokspaceArray;


    public MainFrame(int workspaceDimension) {
        workspace.fill();
        buttons = new ArrayList<JButton>();

        container = getContentPane();
        for (int i = 1; i < (workspaceDimension - 1); i++) {

            for (int j = 1; j < (workspaceDimension - 1); j++) {

                JButton button = new JButton();
                button.addActionListener(this);
                buttons.add(button);
                container.add(button);
                button.setBackground(Color.black);
                button.setForeground(Color.black);
                workspace.fill();
            }
        }

        setLayout(new GridLayout(workspaceDimension, workspaceDimension));
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Integer[][] workspaceArray = new Integer[51][51];
        int color;
        if (initialState == true) {
            button.setBackground(Color.WHITE);
            color = 0;
            workspaceArray = workspace.addPos((button.getX() / button.getWidth()) + 1, (button.getY() / button.getHeight()) + 1, color);
            initialState = false;
            if (graph.checkWiner(workspaceArray, (button.getX() / button.getWidth()) + 1, (button.getY() / button.getHeight()) + 1, color)) {
                JOptionPane.showMessageDialog(this, "White dots won");
                System.exit(0);
            }

        } else {
            button.setBackground(Color.RED);
            color = 1;
            workspaceArray = workspace.addPos((button.getX() / button.getWidth()) + 1, (button.getY() / button.getHeight()) + 1, color);
            initialState = true;
            if (graph.checkWiner(workspaceArray, (button.getX() / button.getWidth()) + 1, (button.getY() / button.getHeight()) + 1, color)) {
                JOptionPane.showMessageDialog(this, "Red dots won");
                System.exit(0);
            }
        }
    }
}










