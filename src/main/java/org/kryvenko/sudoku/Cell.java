package org.kryvenko.sudoku;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    private CardLayout layout;
    private JButton button;
    private CellSelect cellSelect;
    private Font font = new Font("Arial", Font.BOLD, 52);

    public Cell() {
        button = new JButton();
        cellSelect = new CellSelect();
        button.setFont(font);
        button.setPreferredSize(new Dimension(30, 30));

        layout = new CardLayout();
        setLayout(layout);

        add(button, "button");
        add(cellSelect, "select");

        button.addActionListener(event -> layout.show(this, "select"));
        cellSelect.addSelectListener(number -> {
            button.setText(Integer.toString(number));
            layout.show(this, "button");
        });
    }



}
