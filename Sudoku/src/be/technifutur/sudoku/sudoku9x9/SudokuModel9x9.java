package be.technifutur.sudoku.sudoku9x9;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModel9x9 implements SudokuModel {
    private char value;
    private char[][] tab = new char[getMaxLine()][getMaxCol()];
    static final char[] valOk = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};


    @Override
    public int cellCount() {
        return 81;
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
        return 9;
    }

    @Override
    public int getMaxCol() {
        return 9;
    }

    @Override
    public boolean isPosValid() {

        return false;
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
