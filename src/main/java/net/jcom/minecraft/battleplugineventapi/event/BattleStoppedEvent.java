package net.jcom.minecraft.battleplugineventapi.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BattleStoppedEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final String winner;
    private final boolean battleCancelled;

    public BattleStoppedEvent() {
        winner = null;
        battleCancelled = false;
    }

    public BattleStoppedEvent(String winner, boolean battleCancelled) {
        this.winner = winner;
        this.battleCancelled = battleCancelled;
    }

    /**
     * @return true if battle had a winner
     */
    public boolean hasWinner() {
        return winner != null;
    }

    /**
     * Returns the TeamName of the winners or the playerName if the winner was not part of a team.
     *
     * @return TeamName that won the battle
     */
    public String getWinnerTeam() {
        return winner;
    }

    /**
     * If this battle is cancelled, all data gathered should be removed
     *
     * @return battleCancelled
     */
    public boolean isBattleCancelled() {
        return battleCancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
