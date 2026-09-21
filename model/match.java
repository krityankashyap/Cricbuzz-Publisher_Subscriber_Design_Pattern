package model;

import java.util.ArrayList;
import java.util.List;

public class match {

  private int matchId;
  private List<String> commentery;
  private boolean isFirstInnings;

  private team team1;
  private team team2;

  private String venue;
  private String time;
  private String status;

  private innings inning1;
  private innings inning2;

  public match(int matchId, team team1, team team2, String venue, String time, String status, innings inning1,
      innings inning2) {
    this.matchId = matchId;
    this.team1 = team1;
    this.team2 = team2;
    this.venue = venue;
    this.time = time;
    this.status = status;
    this.inning1 = inning1;
    this.inning2 = inning2;
    this.commentery= new ArrayList<>();
    this.isFirstInnings = true;
  }

  public boolean isFirstInnings() {
    return isFirstInnings;
  }

  public void setFirstInnings(boolean isFirstInnings) {
    this.isFirstInnings = isFirstInnings;
  }

  public List<String> getCommentery() {
    return commentery;
  }

  public void setCommentery(List<String> commentery) {
    this.commentery = commentery;
  }

 public int getMatchId() {
    return matchId;
  }

  public void setMatchId(int matchId) {
    this.matchId = matchId;
  }

  public team getTeam1() {
    return team1;
  }

  public void setTeam1(team team1) {
    this.team1 = team1;
  }

  public team getTeam2() {
    return team2;
  }

  public void setTeam2(team team2) {
    this.team2 = team2;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public innings getInning1() {
    return this.inning1;
  }

  public void setInning1(innings inning1) {
    this.inning1 = inning1;
  }

  public innings getInning2() {
    return this.inning2;
  }

  public void setInning2(innings inning2) {
    this.inning2 = inning2;
  }
  
}
