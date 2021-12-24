import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MonopolyTest {
    Monopoly player = new Monopoly(0);

    @Test
    public void when_die_rolls_are_1_and_2_current_position_should_advance_to_3(){
        //WRITE CODE HERE
        Monopoly spiedPlayer = Mockito.spy(player);
        when(spiedPlayer.throwDie()).thenReturn(2,1);
        int response = spiedPlayer.advance();
        assertEquals(3,response);
    }
    @Test
    public void when_die_rolls_are_3_and_3_advance_should_be_called_again_and_when_1_and_3_are_rolled_current_position_should_be_updated_to_10(){
        // WRITE CODE HERE
        Monopoly spiledDies = Mockito.spy(player);
        when(spiledDies.throwDie()).thenReturn(3,3, 3, 1);
        int response = spiledDies.advance();
        assertEquals(10,response);
    }
}