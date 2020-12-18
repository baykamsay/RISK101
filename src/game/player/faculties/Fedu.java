package game.player.faculties;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;

public class Fedu implements Faculty{

    final public Color color = Color.OLIVE;
    final public ColorAdjust ca = new ColorAdjust();
    private boolean abilityUsed;

    public Fedu(){
        abilityUsed = false;
        ca.setHue(0.638);
        ca.setSaturation(-0.62);
        ca.setBrightness(-0.45);
    }

    @Override
    public boolean canUseAbility() {
        //will not be implemented
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
