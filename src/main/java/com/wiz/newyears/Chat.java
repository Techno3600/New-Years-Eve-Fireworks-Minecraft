package com.wiz.newyears;

import org.bukkit.ChatColor;

public class Chat {
    private static ChatColor prefixColorCode = ChatColor.BLUE;
    private static String prefix = "New Years";
    private static char divider = '>';

    private static ChatColor bodyColor = ChatColor.WHITE;

    public static String getPrefixColorCode()
    {
        //Make it a string because Bukkit is weird
        return "" + prefixColorCode + "";
    }

    public static String getPrefix(String prefix)
    {
        return getPrefixColorCode() + (prefix == null ? Chat.prefix : prefix) + divider + " ";
    }

    public static String message(String prefix, String body)
    {
        return getPrefix(prefix) + getBody(body);
    }

    //Get the body color
    public static String getBodyColor()
    {
        return "" + bodyColor + "";
    }

    //Get the body color + body
    public static String getBody(String body)
    {
        return getBodyColor() + body;
    }

    public static String error(String prefix, String error)
    {
        return message(prefix, ChatColor.RED + error);
    }

}
