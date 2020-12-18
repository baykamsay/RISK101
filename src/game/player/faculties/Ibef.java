package game.player.faculties;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Ibef implements Faculty{

    final public Color color = Color.CYAN;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Ibef(){
        abilityUsed = false;
        ca.setHue(-0.792);
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
    }
}
