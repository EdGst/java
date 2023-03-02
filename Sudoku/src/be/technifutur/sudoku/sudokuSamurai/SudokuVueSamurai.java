package be.technifutur.sudoku.sudokuSamurai;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SudokuVueSamurai implements SudokuVue {
    private static String format = """
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                  . . .   . . . | . . . | . . . | . . . | . . .   . . .  
                  . . .   . . . | . . . | . . . | . . . | . . .   . . .  
                  . . .   . . . | . . . | . . . | . . . | . . .   . . .  
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+""".replace(".", "%s");

    private SudokuModelSamurai model;

    public SudokuVueSamurai(SudokuModelSamurai model) {
        this.model = model;
    }

    @Override
    public String getScreen() {

        Character[] val = new Character[441];
        int pos = 0;
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxCol(); j++) {
                if (model.isPositionValid(i,j)){
                    if (model.isEmpty(i,j)) val[pos] = '.';
                    else val[pos] = model.getValue(i,j);
                    pos ++;
                }
            }
        }
        return String.format(format,val);
    }

    @Override
    public SudokuModel getModel() {
        return this.model;
    }


}
