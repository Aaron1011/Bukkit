package org.bukkit.scoreboard;

/**
 * Nametag visiblity for {@link Team}s
 */
public enum NametagVisibility {

    /**
     * All nametags are displayed for players on the team
     */
    ALWAYS("always"),
    /**
     * No nametags are displayed for players on the team
     */
    NEVER("never"),
    /**
     * Only nametags for players on the same team are displayed
     */
    HIDE_FOR_OTHER_TEAMS("hideForOtherTeams"),

    /**
     * Only nametags for players on other teams are displayed
     */
    HIDE_FOR_OWN_TEAM("hideForOwnTeam");


    private final String value;

    private NametagVisibility(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static NametagVisibility get(String value) {
        for (NametagVisibility n: values()) {
            if (n.value.equalsIgnoreCase(value)) {
                return n;
            }
        }
        return null;
    }
}
