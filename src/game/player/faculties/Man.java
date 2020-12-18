package game.player.faculties;

import game.GameEngine;
import game.state.ArmyPlacementState;
import game.state.FortifyingState;
import game.state.InitialArmyPlacementState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Man implements Faculty{

    final public Color color = Color.DARKSLATEGRAY;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Man(){
        abilityUsed = false;
        ca.setHue(-0.7095);
        ca.setSaturation(-76);
        ca.setBrightness(-0.63);
    }

    @Override
    public boolean canUseAbility() {
        if (GameEngine.getInstance().getCurrentState() instanceof ArmyPlacementState && !abilityUsed) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void useAbility() {
        abilityUsed = true;
        ArmyPlacementState.getInstance().setBusinessAbilityUsedTrue();
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
