package neko.bluearchive.client.renderer;

import neko.bluearchive.item.MomoiHaloItem;
import neko.bluearchive.client.model.MomoiHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MomoiHaloRenderer extends GeoArmorRenderer<MomoiHaloItem> {
    public MomoiHaloRenderer() {
        super(new MomoiHaloModel());
    }
}
