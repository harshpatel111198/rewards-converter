public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    // constructor for cash
   public RewardValue(double cash){
    this.cashValue = cash;
    }

    // constructor to convert miles into cash
    public RewardValue(int miles){
       this.cashValue = miles*CONVERSION_RATE;
    }

    //get the cash value
    public double getCashValue(){
        return cashValue;
    }

    //get the miles
    public int getMilesValue(){
       return (int)(this.cashValue / CONVERSION_RATE);
    }
}
