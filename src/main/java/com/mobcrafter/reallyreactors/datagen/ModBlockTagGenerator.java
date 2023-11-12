package com.mobcrafter.reallyreactors.datagen;

import com.mobcrafter.reallyreactors.ReallyReactors;
import com.mobcrafter.reallyreactors.block.ModBlocks;
import com.mobcrafter.reallyreactors.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ReallyReactors.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.REACTOR_BLOCKS)
                .add(ModBlocks.REACTOR_CASING.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.REACTOR_CASING.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.REACTOR_CASING.get());
    }
}
