package be.technifutur.sudoku;

public interface SudokuModel {

    char EMPTY = 0;
    /**Retourne le nombre de cellule de sudoku
     *
     * @return nombre de cellule
     */
    int cellCount();


    /** Donne la valeur dans une cellule **/
    char getValue(int line, int column);

    /**
     * Met la valeur dans une cellule
     **/
    void setValue(int line, int column, char value);

    /** Connaître le nombre de ligne max **/
    int getMaxLine();

    /** Connaître le nombre de colonne max **/
    int getMaxCol();

    /** Savoir si la position est valide pour entrer une valeur **/
    boolean isPosValid();

    /** Savoir si la valeur peut être entrée **/
    boolean isValueValid(char value);

    boolean isEmpty(int line, int column);
}
