package neko.bluearchive;

import neko.bluearchive.item.BAMaterials;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import neko.bluearchive.item.ShirokoHaloItem;

public class Bluearchive implements ModInitializer, ClientModInitializer {
    public static final String MOD_ID = "bluearchive";

    // 爱丽丝的身份证
    public static final Item ALS = new GlintItem(new Item.Settings());

    // 白子的光环
    public static final Item SHIROKO_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "shiroko_halo"),
            new ShirokoHaloItem(BAMaterials.SHIROKO_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 创造物品组
    public static final ItemGroup ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "general"),
            net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.bluearchive.general"))
                    .icon(() -> new ItemStack(ALS))
                    .entries((context, entries) -> {
                        entries.add(ALS);             // 爱丽丝的身份证
                        entries.add(SHIROKO_HALO);    // 白子的光环
                    })
                    .build()
    );

    public static final Identifier BOX_SOUND_ID = Identifier.of(MOD_ID, "item.box");
    public static final SoundEvent BOX_SOUND = SoundEvent.of(BOX_SOUND_ID);

    @Override
    public void onInitialize() {
        Registry.register(Registries.SOUND_EVENT, BOX_SOUND_ID, BOX_SOUND);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "als"), ALS);

        System.out.println("[Bluearchive] 模组初始化完成！");

        ServerTickEvents.END_SERVER_TICK.register(server -> {
            GlintItem.tickServer(server);
        });
    }

    @Override
    public void onInitializeClient() {
    }
}


/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:
 *                   写字楼里写字间，写字间里程序员；
 *                   程序人员写程序，又拿程序换酒钱。
 *                   酒醒只在网上坐，酒醉还来网下眠；
 *                   酒醉酒醒日复日，网上网下年复年。
 *                   但愿老死电脑间，不愿鞠躬老板前；
 *                   奔驰宝马贵者趣，公交自行程序员。
 *                   别人笑我忒疯癫，我笑自己命太贱；
 *                   不见满街漂亮妹，哪个归得程序员？
 */
/**
く__,.ヘヽ.        /  ,ー､ 〉
           ＼ ', !-─‐-i  /  /´
           ／｀ｰ'       L/／｀ヽ､
         /   ／,   /|   ,   ,       ',
       ｲ   / /-‐/  ｉ  L_ ﾊ ヽ!   i
        ﾚ ﾍ 7ｲ｀ﾄ   ﾚ'ｧ-ﾄ､!ハ|   |
          !,/7 '0'     ´0iソ|    |
          |.从\"    _     ,,,, / |./    |
          ﾚ'| i＞.､,,__  _,.イ /   .i   |
            ﾚ'| | / k_７_/ﾚ'ヽ,  ﾊ.  |
              | |/i 〈|/   i  ,.ﾍ |  i  |
             .|/ /  ｉ：    ﾍ!    ＼  |
              kヽ>､ﾊ    _,.ﾍ､    /､!
              !'〈//｀Ｔ´', ＼ ｀'7'ｰr'
              ﾚ'ヽL__|___i,___,ンﾚ|ノ
                  ﾄ-,/  |___./
                  'ｰ'    !_,.:
 */