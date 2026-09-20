public class CricBuzz {
  private int runs;
  private int overs;
  private int wickets;
  private IccApiService iccApiService;

  public CricBuzz(){
    this.iccApiService= new IccApiService(runs, overs, wickets);
  }
  
  public void update(){
    this.iccApiService.update(runs, overs, wickets);
   

     // we can write logics to check if the runs or wickets, overs are updated, then we can update them also
    if( this.runs!= this.iccApiService.getRuns() ||
        this.overs!= this.iccApiService.getOvers() ||
        this.wickets!= this.iccApiService.getWickets()){

          this.runs= this.iccApiService.getRuns();
          this.overs= this.iccApiService.getOvers();
          this.wickets= this.iccApiService.getWickets();

        }
  }

}
