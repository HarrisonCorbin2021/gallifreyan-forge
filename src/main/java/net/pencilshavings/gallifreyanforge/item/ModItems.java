package net.pencilshavings.gallifreyanforge.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pencilshavings.gallifreyanforge.GallifreyanForge;

public class ModItems
{
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GallifreyanForge.MOD_ID);

    public static final RegistryObject<Item> TARANIUM = ITEMS.register("taranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TARANIUM_INGOT = ITEMS.register("taranium_ingot",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
