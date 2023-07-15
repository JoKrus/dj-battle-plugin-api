package net.jcom.minecraft.battleplugineventapi.data;

public record BattleData(String name, String category, int durationSec, int worldSizeStart, int worldSizeEnd,
                         int maxTeamSize) {

}
