package org.kryvenko.sudoku.model.algorithms;

import org.kryvenko.sudoku.model.Sudoku;

public interface Algorithm {

    Sudoku solve(Sudoku sudoku);
}
