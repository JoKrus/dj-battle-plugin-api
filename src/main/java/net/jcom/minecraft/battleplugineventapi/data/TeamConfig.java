package net.jcom.minecraft.battleplugineventapi.data;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;

public class TeamConfig {
    public final HashMap<String, List<Player>> teamToPlayers = new HashMap<>();
    public static final TeamConfig EMPTY = new TeamConfig();

    public TeamConfig() {
    }
}
