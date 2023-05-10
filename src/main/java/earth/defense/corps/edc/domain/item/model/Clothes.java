package earth.defense.corps.edc.domain.item.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.hibernate.annotations.ColumnDefault;

@DiscriminatorValue("Clothes")
@Entity
public class Clothes extends BaseItem{
    @ColumnDefault("'0")
    private int strength;
    @ColumnDefault("'0")
    private int defenseStrength;
}
