package neko.bluearchive.client.model;

import neko.bluearchive.item.ShirokoHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ShirokoHaloModel extends GeoModel<ShirokoHaloItem> {
    @Override
    public Identifier getModelResource(ShirokoHaloItem animatable) {
        return new Identifier("bluearchive", "geo/shiroko.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShirokoHaloItem animatable) {
        return new Identifier("bluearchive", "textures/item/shiroko.png");
    }

    @Override
    public Identifier getAnimationResource(ShirokoHaloItem animatable) {
        return new Identifier("bluearchive", "animations/shiroko.animation.json");
    }
}
