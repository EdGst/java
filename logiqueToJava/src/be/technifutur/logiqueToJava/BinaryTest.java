package be.technifutur.logiqueToJava;

public class BinaryTest implements Runnable {
    @Override
    public void run(){
        int ensembleDesPossibilites  = init();

        System.out.println(Integer.toBinaryString(ensembleDesPossibilites)); // retranscris int data en byte

        boolean present = estPossible(ensembleDesPossibilites, 5);

        System.out.println(present);

        ensembleDesPossibilites = deletePossibility(ensembleDesPossibilites, 5);

        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

        present = estPossible(ensembleDesPossibilites,5);

        System.out.println(present);

        System.out.println("\n\n");

    }

    private int deletePossibility(int data, int val){

        int mask = ~(1 << (val-1));

        int result = data & mask;

        return result;
    }
    private boolean estPossible(int data, int i) {

        int mask = (1 << i-1);
        int result = data & mask;

        return result != 0;
    }

    private int init(){

        return (1<<9)-1;
    }

    private int addPossibility(int data, int val){
        int result = 0;
        int mask = 1 <<(val-1);
        result = data | mask;
        return data;
    }
    private int combine(int data1, int data2){
        return data1 & data2;
    }
}
