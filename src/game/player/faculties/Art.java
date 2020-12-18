package game.player.faculties;

import game.GameEngine;
import game.state.ArmyPlacementState;
import game.state.WarState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Art implements Faculty{

    final public Color color = Color.DARKORANGE;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Art(){
        abilityUsed = false;
        ca.setHue(0.44);
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
        WarState.getInstance().setArtAbilityUsedTrue();
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
