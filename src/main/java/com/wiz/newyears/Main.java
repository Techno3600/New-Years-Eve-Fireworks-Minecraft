package com.wiz.newyears;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable()
    {
        getCommand("fireworks").setExecutor(new Fireworks(this));
        Bukkit.getPluginManager().registerEvents(new Fireworks(this), this);
        System.out.println("New Years Fireworks enabled.");
    }


    @Override
    public void onDisable()
    {
        System.out.println("New Years Fireworks disabling...");
    }


}
