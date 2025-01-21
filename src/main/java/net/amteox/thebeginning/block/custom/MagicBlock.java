package net.amteox.thebeginning.block.custom;

import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagicBlock extends Block {
    public MagicBlock(Settings settings) {
        super(settings);
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if (entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getStack().getItem() == ModBlocks.BEGINNIUM_ORE.asItem()) {
                itemEntity.setStack(new ItemStack(ModItems.BEGINNING_SHARD, itemEntity.getStack().getCount()));
                spawnParticlesAndSound(world, pos, entity);
            }

            if (itemEntity.getStack().getItem() == Items.ENDER_PEARL) {
                itemEntity.setStack(new ItemStack(ModItems.BEGINNING_DUST, itemEntity.getStack().getCount()));
                spawnParticlesAndSound(world, pos, entity);
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    private void spawnParticlesAndSound(World world, BlockPos pos, Entity entity) {
        int particleCount = 20;
        double spread = 0.5;

        for (int i = 0; i < particleCount; i++) {
            world.playSound(entity, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_STEP, SoundCategory.BLOCKS, 1f, 1f);
            world.addParticle(ParticleTypes.ENCHANT,
                    pos.getX() + 0.5,
                    pos.getY() + 1.5,
                    pos.getZ() + 0.5,
                    (world.random.nextDouble() - 0.5) * spread * 2,
                    (world.random.nextDouble()) * 2,
                    (world.random.nextDouble() - 0.5) * spread * 2);
        }
    }
}
