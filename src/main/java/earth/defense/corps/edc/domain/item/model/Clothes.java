package earth.defense.corps.edc.domain.item.model;

import org.hibernate.annotations.ColumnDefault;

public class Clothes extends BaseItem{
    @ColumnDefault("'0")
    private int strength;
    @ColumnDefault("'0")
    private int defenseStrength;
}
