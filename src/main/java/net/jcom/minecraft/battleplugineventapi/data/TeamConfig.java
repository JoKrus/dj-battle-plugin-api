package net.jcom.minecraft.battleplugineventapi.data;

import org.bukkit.OfflinePlayer;

import java.util.HashMap;
import java.util.List;

public class TeamConfig {
    /**
     * Map that contains the teamName as key and a list of all members as value
     */
    public final HashMap<String, List<OfflinePlayer>> teamToPlayers = new HashMap<>();
    public static final TeamConfig EMPTY = new TeamConfig();

    public TeamConfig() {
    }
}
