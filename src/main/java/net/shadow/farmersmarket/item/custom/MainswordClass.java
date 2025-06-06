package net.shadow.farmersmarket.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.shadow.farmersmarket.item.ModItems;

public class MainswordClass  extends GreatswordClass {
    public MainswordClass(Item.Settings settings) {
        super(settings);
    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).setStyle(Style.EMPTY.withColor(0x4169e1));

    }

}
