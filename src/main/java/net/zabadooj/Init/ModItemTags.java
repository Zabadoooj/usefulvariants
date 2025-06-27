package net.zabadooj.Init;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zabadooj.UsefulVariants;

public class ModItemTags {
    public static final TagKey<Item> FEATHERS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "feathers"));

    public static void initilise() {
        UsefulVariants.LOGGER.info("Теги загружены");
    }
}
