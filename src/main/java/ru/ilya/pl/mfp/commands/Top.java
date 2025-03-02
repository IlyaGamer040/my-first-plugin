package ru.ilya.pl.mfp.commands;

import dev.rollczi.litecommands.annotations.argument.Arg;
import dev.rollczi.litecommands.annotations.command.Command;
import dev.rollczi.litecommands.annotations.context.Context;
import dev.rollczi.litecommands.annotations.execute.Execute;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

@Command(name = "top")
public class Top {
    @Execute
    public void execute(@Context Player player) {
        World world = player.getWorld();
        double x = player.getX();
        double curr_y = player.getY();
        double z = player.getZ();
        int y = world.getHighestBlockYAt((int) x, (int) z);

        if (curr_y < y) {
            player.teleport(new Location(world, x, y + 1, z));
        } else {
            player.sendMessage("Вы уже на самой высокой точке.");
        }
    }
}
