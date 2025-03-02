package ru.ilya.pl.mfp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.ilya.pl.mfp.model.listener.PlayerJoinListener;
import ru.ilya.pl.mfp.service.CommandService;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new CommandService();
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);

    }

    @Override
    public void onDisable() {

    }
}
