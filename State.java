import java.util.*;
import java.io.*;

public class State implements Comparable<State> {
    
    private int[] board = new int[14];
    private int hValue;

    public State(int[] board){
        // DO SOMETHING???
    }

    @Override
    public int compareTo(State o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public int get_hVlaue(){
        return hValue;
    }

    public void setH(int new_hValue){
        this.hValue = new_hValue;
    }

}