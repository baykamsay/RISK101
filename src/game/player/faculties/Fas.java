package game.player.faculties;

import game.GameEngine;
import game.state.WarState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Fas implements Faculty{

    final public Color color = Color.HOTPINK;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Fas(){
        abilityUsed = false;
        ca.setHue(0.0935);
    }

    @Override
    public boolean canUseAbility() {
        // will not be implemented
        return false;
    }

    @Override
    public void useAbility() {
        // will not be implemented
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
    } //does not affect anything however it has to exist
}
