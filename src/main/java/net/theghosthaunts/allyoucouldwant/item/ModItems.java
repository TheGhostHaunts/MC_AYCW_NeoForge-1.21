package net.theghosthaunts.allyoucouldwant.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theghosthaunts.allyoucouldwant.AllYouCouldWant;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllYouCouldWant.MODID);

    public static final DeferredItem<Item> ECHOBERRY = ITEMS.register("echoberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ECHOBERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
