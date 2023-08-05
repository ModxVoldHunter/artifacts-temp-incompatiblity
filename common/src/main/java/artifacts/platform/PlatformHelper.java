package artifacts.platform;

import artifacts.client.item.renderer.ArtifactRenderer;
import artifacts.item.wearable.WearableArtifactItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;
import java.util.stream.Stream;

public interface PlatformHelper {

    boolean isEquippedBy(@Nullable LivingEntity entity, Item item);

    Stream<ItemStack> findAllEquippedBy(LivingEntity entity, Item item);

    Attribute getStepHeightAttribute();

    Attribute getSwimSpeedAttribute();

    Attribute getEntityGravityAttribute();

    ResourceLocation getQueriedLootTableId(LootContext lootContext);

    void registerArtifactRenderer(WearableArtifactItem item, Supplier<ArtifactRenderer> rendererSupplier);

    ArtifactRenderer getArtifactRenderer(Item item);
}
