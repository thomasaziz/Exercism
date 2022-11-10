import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshakeActions = new ArrayList<Signal>();

        if (((number >> 0)&1) == 1){
            handshakeActions.add(Signal.WINK);
        }

        if (((number >> 1)&1) == 1){
            handshakeActions.add(Signal.DOUBLE_BLINK);
        }

        if (((number >> 2)&1) == 1){
            handshakeActions.add(Signal.CLOSE_YOUR_EYES);
        }

        if (((number >> 3)&1) == 1){
            handshakeActions.add(Signal.JUMP);
        }

        if (((number >> 4)&1) == 1){
            Collections.reverse(handshakeActions);
        }

        return handshakeActions;
    }

}
