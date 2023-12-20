import states.*;

public class Main {
    public static void main(String[] args) {
        
        Machine turing = new Machine();

        //setting turing machine states
        State q0 = turing.addState("q0", true, false);
        State q1 = turing.addState("q1", false, false);
        State q2 = turing.addState("q2", false, true);

        
        turing.addNode(q0, q0, '1', '1', 2);
        turing.addNode(q0, q0, '0', '0', 2);
        turing.addNode(q0, q1, '_', '_', 1);
        turing.addNode(q1, q1, '1', '0', 1);
        turing.addNode(q1, q2, '0', '1', 1);
        turing.addNode(q1, q2, '_', '1', 1);



        turing.setTape("__1111__", 2);
        turing.runTuring();
        turing.showTape();
    }
}
