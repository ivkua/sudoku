package org.kryvenko.sudoku;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SudokuFieldInput extends JFrame {

    private final List<List<Cell>> buttonMatrix;

    public SudokuFieldInput() {
        super("SUDOKU");
        this.setBounds(1000, 1000, 1500, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        List<List<Cell>> buttonMatrix = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            List<Cell> buttonRow = new ArrayList<>();

            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                buttonRow.add(new Cell());
            }

            buttonMatrix.add(buttonRow);
        }

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 3, 10, 10));

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                JPanel panel = new JPanel(new GridLayout(3, 3));

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Cell button = buttonMatrix
                                .get(3 * rowIndex + i)
                                .get(3 * columnIndex + j);

                        panel.add(button);
                    }
                }

                container.add(panel);
            }
        }
        this.buttonMatrix = buttonMatrix;
    }

}
