package org.kryvenko.sudoku;

import java.util.function.Consumer;

public class StringPrintConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
