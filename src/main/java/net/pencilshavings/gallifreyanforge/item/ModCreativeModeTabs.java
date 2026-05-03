package net.pencilshavings.gallifreyanforge.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pencilshavings.gallifreyanforge.GallifreyanForge;
import net.pencilshavings.gallifreyanforge.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GallifreyanForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GALLIFREY_ITEMS_TAB = CREATIVE_MODE_TABS.register("gallifrey_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TARANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.gallifreyan_forge.gallifreyan_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TARANIUM_INGOT.get());
                        output.accept(ModItems.TARANIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> GALLIFREY_BLOCKS_TAB = CREATIVE_MODE_TABS.register("gallifrey_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TARANIUM_BLOCK.get()))
                    .withTabsBefore(GALLIFREY_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.gallifreyan_forge.gallifreyan_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TARANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TARANIUM_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
