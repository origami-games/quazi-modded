package co.origamigames.quazimodded.entity;

// import co.origamigames.quazimodded.QuaziModded;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.util.Identifier;

public class OwlEntityRenderer extends MobEntityRenderer<OwlEntity, CreeperEntityModel<OwlEntity>> {

    public OwlEntityRenderer(EntityRenderDispatcher renderManager, CreeperEntityModel<OwlEntity> model,
            float f) {
        super(renderManager, model, f);
    }

    // @Override
    // public Identifier getTexture(OwlEntity magmator) {
    //     return new Identifier(QuaziModded.MOD_ID, "textures/entity/" + OwlEntity.id + ".png");
    // }

    @Override
    public Identifier getTexture(OwlEntity magmator) {
        return new Identifier("minecraft", "textures/entity/creeper/creeper.png");
    }
}
