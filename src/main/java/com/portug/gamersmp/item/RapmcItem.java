
package com.portug.gamersmp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import com.portug.gamersmp.itemgroup.ModItemGroup;
import com.portug.gamersmp.GamersmpModElements;

@GamersmpModElements.ModElement.Tag
public class RapmcItem extends GamersmpModElements.ModElement {
	@ObjectHolder("gamersmp:rapmc")
	public static final Item block = null;

	public RapmcItem(GamersmpModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, GamersmpModElements.sounds.get(new ResourceLocation("gamersmp:rap_do_minecraft")),
					new Item.Properties().group(ModItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("rapmc");
		}
	}
}
