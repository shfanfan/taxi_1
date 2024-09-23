public class Taxi{
    int taxiId;
    int numPass;
    int currentPass = 0;
  
    public Taxi(int id, int num){
      this.taxiId = id;
      this.numPass = num;
    }
  
    void setCurrentPass(int pass){
      this.currentPass = pass;
    }
    
    void setTaxiId(int id){
      this.taxiId = id;
    }
  
    int getTaxiId(){
      return this.taxiId;
    }
  
    int getNumPass(){
      return this.numPass;
    }
  
    int getCurrentPass(){
      return this.currentPass;
    }
}