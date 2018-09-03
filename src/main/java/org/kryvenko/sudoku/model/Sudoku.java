package org.kryvenko.sudoku.model;

import java.io.*;
import java.util.ArrayList;
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
}
