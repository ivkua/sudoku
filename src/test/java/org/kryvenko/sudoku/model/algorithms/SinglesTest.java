package org.kryvenko.sudoku.model.algorithms;

import org.junit.Test;
import org.kryvenko.sudoku.model.Sudoku;

import static org.junit.Assert.*;

public class SinglesTest {

    @Test
    public void solve() {
        Sudoku sudoku = Sudoku.rowBuilder()
                .row(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .row(0, 0, 0, 0, 0, 0, 0, 0, 0)
                .build();

        
    }
}