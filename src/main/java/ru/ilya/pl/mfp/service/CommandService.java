package ru.ilya.pl.mfp.service;


import dev.rollczi.litecommands.bukkit.LiteBukkitFactory;
import ru.ilya.pl.mfp.commands.TeleportWorld;
import ru.ilya.pl.mfp.commands.Top;

public class CommandService {
    public CommandService() {
        LiteBukkitFactory.builder()
                .commands(new TeleportWorld())
                .commands(new Top())
                .build();
    }
}
