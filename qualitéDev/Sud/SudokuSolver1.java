package qualitéDev.Sud;

/**
 * This program is executed in the following way:
 * java SudokuSolver <input-file>
 * For details of the input-file format,see the Grid.java class.
 *
 * @author Patrick Chan
 * @version 1, 12/31/05
 * @see Grid
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class SudokuSolver1 implements ActionListener {//supression des statics

    JFrame selectFrame = new JFrame();
    JFileChooser selectFile = new JFileChooser();
    JFileChooserDemo view = new JFileChooserDemo();//serre pour le retour de solution des resultat du sudokuSolver

    public static void main(String[] args) {
        new SudokuSolver1();
    }

    public SudokuSolver1() {
        selectFrame.setVisible(true);
        selectFrame.setSize(400, 400);
        selectFrame.add(selectFile);
        selectFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        selectFile.addActionListener(this);
            /* Open the file containing the givens
            File file = new File(args[0]);
            FileReader rd = new FileReader(args[0]);

            // Process each grid in the file
            while (true) {
                Grid grid = Grid.create(rd);
                if (grid == null) {
                    // No more grids
                    break;
                }

                // Find a solution
                List<Grid> solutions = solve(grid);

                printSolutions(grid,solutions);
            }*/
    }

    void update(String path) throws Exception {
        view.clearSudoku();
        // Open the file containing the givens
        File file = new File(path);
        FileReader rd = new FileReader(path);

        // Process each grid in the file
        while (true) {
            Grid grid = Grid.create(rd);
            if (grid == null) {
                // No more grids
                break;
            }

            // Find a solution
            List<Grid> solutions = solve(grid);

            printSolutions(grid, solutions);
        }
    }

    // Recursive routine that
    private List<Grid> solve(Grid grid) {
        List<Grid> solutions = new ArrayList<Grid>();
        solve(grid, solutions);
        return solutions;
    }

    private void solve(Grid grid, List<Grid> solutions) {
        // Return if there is already more than two solution
        if (solutions.size() >= 2) {
            return;
        }

        // Find first empty cell
        int loc = grid.findEmptyCell();

        // If no empty cells are found,a solution is found
        if (loc < 0) {
            solutions.add(grid.clone());
            return;
        }

        // Try each of the 9 digits in this empty cell
        for (int n = 1; n < 10; n++) {
            if (grid.set(loc, n)) {
                // With this cell set,work on the next cell
                solve(grid, solutions);

                // Clear the cell so that it can be filled with another digit
                grid.clear(loc);
            }
        }
    }

    private void printSolutions(Grid grid, List<Grid> solutions) {//modification des println en drawSudokuln

        // Print the grid with the givens
        view.drawSudokuln("Original");
        view.drawSudokuln(grid.toString());

        // Print the solution
        if (solutions.isEmpty()) {
            view.drawSudokuln("Unsolveable");
        } else if (solutions.size() == 1) {
            view.drawSudokuln("Solved");
        } else {
            view.drawSudokuln("At least two solutions");
        }

        // Print the solution(s)
        for (int i = 0; i < solutions.size(); i++) {
            view.drawSudokuln(solutions.get(i).toString());
        }
        view.drawSudokuln("");
        view.drawSudokuln("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {//recupere les action de selectFile
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("ApproveSelection")) {
            System.out.println("start solve");
            System.out.println(selectFile.getSelectedFile().toPath().toString());

            try {
                update(selectFile.getSelectedFile().toPath().toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
