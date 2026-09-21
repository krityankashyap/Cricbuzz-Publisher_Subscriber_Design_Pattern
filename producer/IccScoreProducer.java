package producer;

import model.match;
import subscriber.ScoreBoardSubscriber;

public class IccScoreProducer implements producer {
  private match match;
  private ScoreBoardSubscriber scoreBoardSubscriber;

  public IccScoreProducer(match match, ScoreBoardSubscriber scoreBoardSubscriber) {
    this.scoreBoardSubscriber = scoreBoardSubscriber;
  }

  public void updateScore(int curr_over, int curr_ball, int wickets, int runs, boolean isFirstInnings) {
    scoreBoardSubscriber.update(this);
  }

  @Override 
  public match getMatchData(){
    return this.match;
  }

}
