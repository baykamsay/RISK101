package game.player.faculties;

import game.GameEngine;
import game.state.WarState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Feass implements Faculty{

    final public Color color = Color.YELLOW;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Feass(){
        abilityUsed = false;
        ca.setHue(0.6165);
    }

    @Override
    public boolean canUseAbility() {
        if (GameEngine.getInstance().getCurrentState() instanceof WarState && !abilityUsed) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void useAbility() {
        abilityUsed = true;
        WarState.getInstance().setEconAbilityUsedTrue();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public ColorAdjust getCa() {
        return ca;
    }

    @Override
    public void setAbilityUsed(boolean b){
        abilityUsed = b;
    }
}
