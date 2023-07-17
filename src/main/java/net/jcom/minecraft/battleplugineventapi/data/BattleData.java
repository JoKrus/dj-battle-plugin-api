package net.jcom.minecraft.battleplugineventapi.data;

import org.bukkit.Location;

public record BattleData(String name, String category, Location battleCenter, int durationSec, int worldSizeStart,
                         int worldSizeEnd,
                         int maxTeamSize) {

}
