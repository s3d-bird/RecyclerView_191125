package com.arsec.recyclerview_191125;

public class Game {
    String gameTitle;
    int releaseYear;

    public Game(String gameTitle, int releaseYear) {
        this.gameTitle = gameTitle;
        this.releaseYear = releaseYear;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
