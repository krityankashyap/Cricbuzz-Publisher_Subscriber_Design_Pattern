package subscriber;

import producer.producer;

public interface Subscriber {
  void update(producer producer);
}
