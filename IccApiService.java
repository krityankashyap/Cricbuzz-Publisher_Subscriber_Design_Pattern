public class IccApiService {

  private int runs;
  private int overs;
  private int wickets;

  public IccApiService(int runs, int overs, int wickets) {
    this.runs = runs;
    this.overs = overs;
    this.wickets = wickets;
  }

  public int getRuns(){
    return this.runs;
  }

  public int getOvers(){
    return this.overs;
  }

  public int getWickets(){
    return this.wickets;
  }

  public void update(int runs, int overs, int wickets) {
    this.runs = runs;
    this.overs = overs;
    this.wickets = wickets;
  }
  
}
