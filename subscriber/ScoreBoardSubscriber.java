package subscriber;

import model.innings;
import model.match;
import producer.producer;

public class ScoreBoardSubscriber implements Subscriber {
  private match match;

  public ScoreBoardSubscriber(match match) {
    this.match = match;
  }

  public void update(producer producer) {
    boolean isFirstInnings= producer.getMatchData().isFirstInnings();

    innings inningsProducer= isFirstInnings ? producer.getMatchData().getInning1() : producer.getMatchData().getInning2();

    innings inningsSubscriber= isFirstInnings ? match.getInning1() : match.getInning2();

    inningsSubscriber.setCurr_over(inningsProducer.getCurr_over());
    inningsSubscriber.setCurr_ball(inningsProducer.getCurr_ball());
    inningsSubscriber.setWickets(inningsProducer.getWickets());
    inningsSubscriber.setRuns(inningsProducer.getRuns());

  }
}
