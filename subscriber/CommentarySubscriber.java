package subscriber;

import java.util.ArrayList;
import java.util.List;

import producer.producer;

public class CommentarySubscriber implements Subscriber{

  private List<String> commentary;

  public CommentarySubscriber() {
    this.commentary = new ArrayList<>();
  }

  @Override
  public void update(producer producer) {
    this.commentary.add(producer.getMatchData().getCommentery().get(producer.getMatchData().getCommentery().size() - 1));
    
  }
  
}
