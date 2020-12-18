package game.player.faculties;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Fen implements Faculty{

    final public Color color = Color.LIME;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Fen(){
        abilityUsed = false;
        ca.setHue(-1.0);
    }

    @Override
    public boolean canUseAbility() {
        return false;
    }

    @Override
    public void useAbility() {

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
