package earth.defense.corps.edc.domain.item.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Setter
@Getter
@DiscriminatorValue("Helmet")
@Entity
public class Helmet extends BaseItem{
    @ColumnDefault("'0'")
    private int defenseStrength;
    @ColumnDefault("'0'")
    private int strength;
}
