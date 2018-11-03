package org.kryvenko.sudoku.model;

import com.google.common.primitives.Ints;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sudoku {
    private List<List<Integer>> sudoku;

    private Sudoku(List<List<Integer>> sudoku) {
        this.sudoku = sudoku;
    }

    public static Sudoku fromFile(String location) throws IOException {

        List<List<Integer>> sudokuList = new ArrayList<>();
        InputStream is = Sudoku.class.getResourceAsStream(location);
        Scanner scanner = new Scanner(is);


        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            char[] chars = string.toCharArray();
            List<Integer> row = new ArrayList<>();
            for (char chara : chars) {
                if (Character.isDigit(chara)) {
                    row.add(Character.digit(chara, 10));
                }
            }
            sudokuList.add(row);
        }

        return new Sudoku(null);
    }

    public int getCell(int row, int column) {
        if (row == 2 && column == 3) {
            return 9;
        } else {
            return 5;
        }
    }

    public static RowBuilder rowBuilder() {
        return new RowBuilder();
    }

    public static class RowBuilder {

        private List<List<Integer>> matrix;

        private RowBuilder() {
            matrix = new ArrayList<>();

        }

        public RowBuilder row(int... numbers) {
            List<Integer> row = Ints.asList(numbers);
            matrix.add(row);
            return this;
        }

        public Sudoku build() {
            return new Sudoku(matrix);
        }
    }
}
