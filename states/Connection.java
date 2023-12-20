package states;

public class Connection {
    
    public State connectedState;
    public char when;
    public char write;
    public int move;

    public Connection(State state, char when, int move, char write){
        this.connectedState = state;
        this.when = when;
        this.move = move;
        this.write = write;
    }
}
