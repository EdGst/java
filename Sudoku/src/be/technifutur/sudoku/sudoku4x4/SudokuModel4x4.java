package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModel4x4 implements SudokuModel {

    private char value;
    private char[][] tab = new char[getMaxLine()][getMaxCol()];
    static final char[] valOk = {'1', '2', '3', '4'};

    @Override
    public int cellCount() {
        return 16;
    }

    @Override
    public char getValue(int line, int column) {
        return tab[line][column];
    }

    @Override
    public void setValue(int line, int column, char value) {
        tab[line][column] = value;
    }

    @Override
    public int getMaxLine() {
        return 4;
    }

    @Override
    public int getMaxCol() {
        return 4;
    }

    @Override
    public boolean isPosValid() {
        boolean result = false;

        return result;
    }

    @Override
    public boolean isValueValid(char value) {
        boolean result = false;
        for (int i = 0; i < valOk.length; i++) {
            if (valOk[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isEmpty(int line, int column) {
        boolean result = false;

        if (tab[line][column] == EMPTY) {
            result = true;
        }
        return result;
    }
}
