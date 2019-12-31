package co.origamigames.quazimodded.mixins;

import org.spongepowered.asm.mixin.Mixin;
// import org.spongepowered.asm.mixin.injection.At;
// import org.spongepowered.asm.mixin.injection.Inject;
// import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// import co.origamigames.quazimodded.init.QMEntities;

// import net.minecraft.entity.EntityCategory;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.PlainsBiome;

@Mixin(PlainsBiome.class)
public class PlainsBiomeMixin extends Biome {
	
	protected PlainsBiomeMixin(Settings settings) {
		super(settings);
	}
	
	// @Inject(at = @At("RETURN"), method = "<init>()V")
	// private void init(CallbackInfo info) {
	// 	this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(QMEntities.OWL, 80, 2, 4));
	// }
}
