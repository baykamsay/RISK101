package game.player.faculties;

import game.GameEngine;
import game.state.WarState;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Mf implements Faculty{

    final public Color color = Color.DARKRED;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Mf(){
        abilityUsed = false;
        ca.setHue(0.2805);
    }

    @Override
    public boolean canUseAbility() {
        // will not be implemented
        return false;
    }

    @Override
    public void useAbility() {
        //will not be implemented
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
