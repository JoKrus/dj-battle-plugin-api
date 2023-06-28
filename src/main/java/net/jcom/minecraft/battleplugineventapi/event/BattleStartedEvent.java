package net.jcom.minecraft.battleplugineventapi.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BattleStartedEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public BattleStartedEvent() {
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
