import java.util.ArrayList;

public class Bins {

    private Integer minRoll;
    private Integer maxRoll;
    int [] binArray; //set to primitive for array to initialize to 0 values instead of null

    public Bins(int minRoll, int maxRoll){
        this.minRoll = minRoll;
        this.maxRoll = maxRoll;
        binArray = new int [maxRoll];
    }

    public void incrementBin(int result){
        binArray[result-2]++;
    }

    public Integer getBin(int binId) {
        return binArray[binId];
    }

    public Integer getBinMin(){
        return minRoll;
    }

    public Integer getBinMax(){
        return maxRoll;
    }
}
