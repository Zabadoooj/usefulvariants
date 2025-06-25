package net.zabadooj.Init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.zabadooj.UsefulVariants;

import java.util.function.Function;

public class ItemsInit {

    public static final Item COLD_FEATHER = register(
            "cold_feather",
            Item::new,
            new Item.Settings()
    );
    public static final Item WARM_FEATHER = register(
            "warm_feather",
            Item::new,
            new Item.Settings()
    );
    public static final Item PORK_FAT = register(
            "pork_fat",
            Item::new,
            new Item.Settings()
    );
    public static final Item COW_WOOL = register(
            "cow_wool",
            Item::new,
            new Item.Settings()
    );

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UsefulVariants.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }


    public static void initialize() {

        // Добавление во вкладки
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemgroup) -> itemgroup.add(ItemsInit.COLD_FEATHER));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemgroup) -> itemgroup.add(ItemsInit.WARM_FEATHER));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemgroup) -> itemgroup.add(ItemsInit.PORK_FAT));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemgroup) -> itemgroup.add(ItemsInit.COW_WOOL));

        // Завершение инициализации
        UsefulVariants.LOGGER.info("Предмеды загружены");
    }
}
