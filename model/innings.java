package model;

public class innings {
  private int curr_over;
  private int curr_ball;
  private int curr_runs_rate;
  private int wickets;
  private int runs;
  
  public int getRuns() {
    return runs;
  }

  public void setRuns(int runs) {
    this.runs = runs;
  }

  public int getCurr_ball() {
    return curr_ball;
  }

  public void setCurr_ball(int curr_ball) {
    this.curr_ball = curr_ball;
  }
  
  public int getCurr_over() {
    return curr_over;
  }

  public void setCurr_over(int curr_over) {
    this.curr_over = curr_over;
  }

  public int getCurr_runs_rate() {
    return curr_runs_rate;
  }

  public void setCurr_runs_rate(int curr_runs_rate) {
    this.curr_runs_rate = curr_runs_rate;
  }

  public int getWickets() {
    return wickets;
  }

  public void setWickets(int wickets) {
    this.wickets = wickets;
  }
}
