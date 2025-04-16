package neko.bluearchive.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BAMaterials {

    private static RegistryEntry<ArmorMaterial> registerMaterial(
            String id,
            Map<ArmorItem.Type, Integer> defensePoints,
            int enchantability,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairIngredientSupplier,
            float toughness,
            float knockbackResistance,
            boolean dyeable
    ) {
        Identifier idObj = Identifier.of("bluearchive", id);

        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(idObj, "", dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(
                defensePoints,
                enchantability,
                equipSound,
                repairIngredientSupplier,
                layers,
                toughness,
                knockbackResistance
        );

        return Registry.registerReference(Registries.ARMOR_MATERIAL, idObj, material);
    }

    // 白子的光环
    public static final RegistryEntry<ArmorMaterial> SHIROKO_HALO = registerMaterial(
            "shiroko_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 已经是 RegistryEntry<SoundEvent>
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 爱丽丝的光环
    public static final RegistryEntry<ArmorMaterial> ALICE_HALO = registerMaterial(
            "alice_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 同上
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 阳奈的光环
    public static final RegistryEntry<ArmorMaterial> HINA_HALO = registerMaterial(
            "hina_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 同上
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );
}
