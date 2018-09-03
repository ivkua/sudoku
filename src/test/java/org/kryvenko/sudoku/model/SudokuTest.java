package org.kryvenko.sudoku.model;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SudokuTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fromFileShouldBeNotNull() throws Exception {
        Sudoku sudoku = Sudoku.fromFile("sudoku1.txt");
        assertNotNull(sudoku);
    }

    @Test
    public void testSudoku1() throws Exception {
        Sudoku sudoku = Sudoku.fromFile("sudoku1.txt");
        assertEquals(9, sudoku.getCell(2, 3));
        assertEquals(5, sudoku.getCell(4, 2));

    }

    @Test
    public void testSudoku2() throws Exception {
        Sudoku sudoku = Sudoku.fromFile("sudoku2.txt");
        assertEquals(3, sudoku.getCell(2, 3));
        assertEquals(4, sudoku.getCell(4, 2));

    }
}