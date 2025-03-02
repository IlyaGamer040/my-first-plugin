package ru.ilya.pl.mfp.commands;

import dev.rollczi.litecommands.annotations.argument.Arg;
import dev.rollczi.litecommands.annotations.command.Command;
import dev.rollczi.litecommands.annotations.context.Context;
import dev.rollczi.litecommands.annotations.execute.Execute;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

@Command(name = "tpw")
public class TeleportWorld {
    @Execute
    public void execute(@Context Player player, @Arg World world) {
        double x = player.getX();
        double z = player.getZ();
        int y = world.getHighestBlockYAt((int) x, (int) z);

        player.teleport(new Location(world, x, y + 1, z));

        // player.teleport(new Location(world, 0, 70, 0));
    }
}
