package game.player.faculties;

import game.GameEngine;
import game.state.FortifyingState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Mssf implements Faculty{

    final public Color color = Color.INDIGO;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Mssf(){
        abilityUsed = false;
        ca.setHue(-0.143);
        abilityUsed = true;
    }

    @Override
    public boolean canUseAbility() {
        if (GameEngine.getInstance().getCurrentState() instanceof FortifyingState && !abilityUsed) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void useAbility() {
        abilityUsed = true;
        FortifyingState.getInstance().setMusicAbilityUsedTrue();
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
        //do not implement this!!
    }
}
