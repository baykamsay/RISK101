package game.player.faculties;

import game.GameEngine;
import game.state.WarState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Law implements Faculty{

    final public Color color = Color.DARKBLUE;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Law(){
        abilityUsed = false;
        ca.setHue(-0.3135);
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
        WarState.getInstance().setLawAbilityUsedTrue();
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
