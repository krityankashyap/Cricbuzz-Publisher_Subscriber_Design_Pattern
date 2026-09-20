package model;

import java.util.List;

public class team {
  private String name;
  private int teamId;
  private List<String> players;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTeamId() {
    return teamId;
  }

  public void setTeamId(int teamId) {
    this.teamId = teamId;
  }

  public List<String> getPlayers() {
    return players;
  }

  public void setPlayers(List<String> players) {
    this.players = players;
  }
}
