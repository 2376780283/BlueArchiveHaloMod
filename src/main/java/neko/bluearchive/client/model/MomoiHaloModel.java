package neko.bluearchive.client.model;

import neko.bluearchive.item.MomoiHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MomoiHaloModel extends GeoModel<MomoiHaloItem> {
    @Override
    public Identifier getModelResource(MomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/momoi.geo.json");
    }

    @Override
    public Identifier getTextureResource(MomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/momoi.texture.png");
    }

    @Override
    public Identifier getAnimationResource(MomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/momoi.animation.json");
    }
}
