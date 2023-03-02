package be.technifutur.sudoku.sudokuSamurai;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ModelFactorySamurai implements ModelFactory {


    @Override
    public SudokuModelSamurai getModel(String filename) {
        int ligne = 0;
        int col = 0;
        SudokuModelSamurai model = new SudokuModelSamurai();
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                while (col < 21) {
                    char value = line.charAt(col);
                    if (value != '.' && value != ' ') {
                        model.setValue(ligne, col, value);
                    } else if (value == ' ') {
                        model.setValue(ligne, col, ' ');
                    }
                    col++;
                }
                col = 0;
                ligne++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("le fichier n'existe pas");
        }

        return model;
    }
}
