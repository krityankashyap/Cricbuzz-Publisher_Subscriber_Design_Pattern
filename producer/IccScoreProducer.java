package producer;

import model.match;
import subscriber.ScoreBoardSubscriber;

public class IccScoreProducer {
  private ScoreBoardSubscriber scoreBoardSubscriber;

  public IccScoreProducer(match match, ScoreBoardSubscriber scoreBoardSubscriber) {
    this.scoreBoardSubscriber = scoreBoardSubscriber;
  }

  public void updateScore(int curr_over, int curr_ball, int wickets, int runs, boolean isFirstInnings) {
    scoreBoardSubscriber.update(curr_over, curr_ball, wickets, runs, isFirstInnings);
  }

}
