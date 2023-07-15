package net.jcom.minecraft.battleplugineventapi.event;

import net.jcom.minecraft.battleplugineventapi.data.BattleData;
import net.jcom.minecraft.battleplugineventapi.data.TeamConfig;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BattleStartedEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final TeamConfig teamConfig;
    private final BattleData battleData;

    public BattleStartedEvent(TeamConfig teamConfig, BattleData battleData) {
        this.teamConfig = teamConfig;
        this.battleData = battleData;
    }

    public TeamConfig getTeamConfig() {
        return teamConfig;
    }

    public BattleData getBattleData() {
        return battleData;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
