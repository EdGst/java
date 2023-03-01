package be.technifutur.sudoku;

import be.technifutur.sudoku.sudoku4x4.SudokuModel4x4;
import be.technifutur.sudoku.sudoku4x4.SudokuVue4x4;
import be.technifutur.sudoku.sudoku9x9.SudokuModel9x9;
import be.technifutur.sudoku.sudokuSamurai.ModelFactorySamurai;
import be.technifutur.sudoku.sudokuSamurai.SudokuModelSamurai;
import be.technifutur.sudoku.sudokuSamurai.SudokuVueSamurai;

public class Main {
    public static void main(String[] args) {
        ModelFactorySamurai partie = new ModelFactorySamurai();


        SudokuModelSamurai modele = partie.getModel("fichierSudoku\\samurai.txt");

        SudokuVue vue = new SudokuVueSamurai(modele);

        System.out.println(vue.getScreen());

    }
}

