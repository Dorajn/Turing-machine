import states.*;

public class Main {
    public static void main(String[] args) {
        
        Machine turing = new Machine();

        //setting turing machine states
        State q0 = turing.addState("q0", true, false);
        State q1 = turing.addState("q1", false, false);
        State q2 = turing.addState("q2", false, false);
        State q3 = turing.addState("q3", false, false);
        State q4 = turing.addState("q4", false, false);
        State q5 = turing.addState("q5", false, false);
        State q6 = turing.addState("q6", false, false);
        State q7 = turing.addState("q7", false, true);

        
        turing.addNode(q0, q0, '1', '1', 2);
        turing.addNode(q0, q0, '0', '0', 2);
        turing.addNode(q0, q1, '_', '_', 2);
        turing.addNode(q1, q1, '0', '0', 2);
        turing.addNode(q1, q2, '1', '1', 2);
        turing.addNode(q1, q6, '_', '_', 1);
        turing.addNode(q2, q2, '1', '1', 2);
        turing.addNode(q2, q2, '0', '0', 2);
        turing.addNode(q2, q3, '_', '_', 1);
        turing.addNode(q3, q3, '0', '1', 1);
        turing.addNode(q3, q4, '1', '0', 1);
        turing.addNode(q4, q4, '1', '1', 1);
        turing.addNode(q4, q4, '0', '0', 1);
        turing.addNode(q4, q5, '_', '_', 1);
        turing.addNode(q5, q5, '1', '0', 1);
        turing.addNode(q5, q0, '0', '1', 1);
        turing.addNode(q5, q0, '_', '1', 2);
        turing.addNode(q6, q6, '0', '_', 1);
        turing.addNode(q6, q7, '_', '_', 0);
        

        

        turing.setTape("___10110111_1010011101___", 3);
    
        if(turing.runTuring())
            turing.showTape();
    }
}
