package co.origamigames.quazimodded.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.world.World;

public class OwlEntity extends BatEntity {
    public static final String id = "owl";

    public OwlEntity(EntityType<? extends BatEntity> entityType, World world) {
        super(entityType, world);
    }
}
