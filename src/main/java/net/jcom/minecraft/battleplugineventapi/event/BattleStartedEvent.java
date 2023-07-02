package net.jcom.minecraft.battleplugineventapi.event;

import net.jcom.minecraft.battleplugineventapi.data.TeamConfig;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BattleStartedEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final TeamConfig teamConfig;

    public BattleStartedEvent(TeamConfig teamConfig) {
        this.teamConfig = teamConfig;
    }

    public TeamConfig getTeamConfig() {
        return teamConfig;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
