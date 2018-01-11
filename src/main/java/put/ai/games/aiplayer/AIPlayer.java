package put.ai.games.aiplayer;

import put.ai.games.game.Board;
import put.ai.games.game.Move;
import put.ai.games.game.Player;

import java.util.List;
import java.util.Random;

public class AIPlayer extends Player {

    @Override
    public String getName() {
        return "Player Konrad Kubzdela 127331 Jakub Tomczak 127083";
    }

    @Override
    public Move nextMove(Board b) {
        List<Move> moves = b.getMovesFor(getColor());
        Random random = new Random();
        return moves.get(random.nextInt(moves.size()));
    }

    //private int alphaBeta(state s, int depth, int alpha, int beta)
    private int alphaBeta(int depth, int alpha, int beta)
    {
        /*
        int val;
        if( is_terminal_node(s) || depth==0 ) return(Eval(s,depth));
        for(child=1; child<=NumOfSucc(s); child++) {
            val = -alphaBeta(Succ(s,child),depth-1,-beta,-alpha);
            if( val > alpha ) alpha = val; // alpha=max(val,alpha);
            if( alpha >= beta ) return beta; // cutoff
        } //endfor*/
        return alpha;
    }
}
