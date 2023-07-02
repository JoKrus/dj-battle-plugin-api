package net.jcom.minecraft.battleplugineventapi.data;

import org.bukkit.OfflinePlayer;

import java.util.HashMap;
import java.util.List;

public class TeamConfig {
    public final HashMap<String, List<OfflinePlayer>> teamToPlayers = new HashMap<>();
    public static final TeamConfig EMPTY = new TeamConfig();

    public TeamConfig() {
    }
}
