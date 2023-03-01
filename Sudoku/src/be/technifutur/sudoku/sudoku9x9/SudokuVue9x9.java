package be.technifutur.sudoku.sudoku9x9;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;
import be.technifutur.sudoku.sudoku4x4.SudokuModel4x4;

public class SudokuVue9x9 implements SudokuVue {
    private static String format = """
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                
                """.replace(".", "%s");

    private SudokuModel9x9 model;

    public SudokuVue9x9(SudokuModel9x9 model) {
        this.model = model;
    }

    @Override
    public String getScreen() {

        Character[] val = new Character[81];
        int pos = 0;
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < getModel().getMaxCol(); j++) {
                if(model.isEmpty(i,j)){
                    val[pos]= '.';
                } else {
                    val[pos]=model.getValue(i,j);
                }
                pos++;
            }

        }
        return String.format(format, val);
    }

    @Override
    public SudokuModel getModel() {
        return this.model;
    }
}
