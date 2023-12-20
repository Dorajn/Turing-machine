package states;
import java.util.ArrayList;


public class State {

     String name;
    private ArrayList<Connection> neighbours;
    public boolean acceptingState;
    public boolean startingState;

    State(String name, boolean startingState, boolean acceptingState){
        this.acceptingState = acceptingState;
        this.startingState = startingState;
        this.name = name;

        neighbours = new ArrayList<>();
    }

    public void addNode(State state, char when, int move, char write){
        Connection newNode = new Connection(state, when, move, write);
        neighbours.add(newNode);
    }

    public State findWay(char redCharacter, Machine machine){

        for(Connection node : neighbours){

            if(node.when == redCharacter){

                StringBuilder sb = new StringBuilder(machine.tape);
                sb.setCharAt(machine.pointer, node.write);
                machine.tape = sb.toString();

                if(node.move == 1)
                    machine.pointer--;
                if(node.move == 2)
                    machine.pointer++;

                return node.connectedState;
            }

        }

        return null;
    }

}
