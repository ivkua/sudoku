package org.kryvenko.sudoku;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CellSelect extends JPanel {

    private List<Consumer<Integer>> selectListeners = new ArrayList<>();

    public CellSelect() {
        setLayout(new GridLayout(3, 3));
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                int number = rowIndex * 3 + columnIndex + 1;
                JButton button = new JButton(Integer.toString(number));
                button.addActionListener(event ->
                        selectListeners.forEach(listener ->
                                listener.accept(number)
                        )
                );
                add(button);
            }
        }
    }

    public void addSelectListener(Consumer<Integer> consumer) {
        selectListeners.add(consumer);
    }
}
