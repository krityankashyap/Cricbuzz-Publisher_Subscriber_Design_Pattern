package subscriber;

import model.innings;
import model.match;

public class ScoreBoardSubscriber {
  private match match;

  public ScoreBoardSubscriber(match match) {
    this.match = match;
  }

  public void update(int curr_over, int curr_ball, int wickets, int runs, boolean isFistInnings) {

    innings inning = isFistInnings ? match.getInning1() : match.getInning2();
    inning.setCurr_over(curr_over);
    inning.setCurr_ball(curr_ball);
    inning.setWickets(wickets);
    inning.setRuns(runs);
    
     
  }
}
