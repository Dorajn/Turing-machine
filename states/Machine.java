package states;

import java.util.ArrayList;


public class Machine {

    public String tape;
    private ArrayList<State> array;
    private State startingState;
    public int pointer;


    public Machine(){
        array = new ArrayList<>();
        tape = "________________________";
        pointer = 0;
    }

    public State addState(String name, boolean startingState, boolean acceptingState){

        State state = new State(name, startingState, acceptingState);

        if(startingState)
            this.startingState = state;

        array.add(state);

        return state;
    }


    /*
     * move
     * 0 stay
     * 1 left
     * 2 right 
     */

    public void addNode(State FromState, State ToState, char when, char write, int move){
        FromState.addNode(ToState, when, move, write);
    }

    public void setTape(String tape, int ptr){ this.tape = tape; pointer = ptr; }

    public void showTape() { System.out.println(tape); }

    public void runTuring(){

        State currentState = startingState;

        while(true){
            char redCharacter = tape.charAt(pointer);
            currentState = currentState.findWay(redCharacter, this);

            if(currentState.acceptingState)
                break;

        }

    }

}
