public class Simulation {

    private Integer numDice;
    private Integer numRuns;
    private Dice dice;
    private Bins bin;

    public Simulation(int numDice, int numRuns){
        this.numDice = numDice;
        this.numRuns = numRuns;
        dice = new Dice(numDice);
        bin = new Bins(numDice,numDice*6);
    }

    public void runSimulation(){

        Integer throwResult;
        for(int i=1; i<=numRuns; i++){
            throwResult = dice.tossAndSum();
            bin.incrementBin(throwResult);
        }
    }

    public void printResults(){
        System.out.printf("***\n"+"Simulation of '%d' dice tossed for '%d' times\n"+"***\n\n", numDice, numRuns);
        String stars = "";
        Integer binNum;
        Float percentage;
        for(int i=numDice; i<=numDice*6;i++){
            stars = genStars(i);
            binNum = bin.getBin(i-2);
            percentage = getPercentage(i);
            System.out.printf("%2d :% 9d: % 4.2f %s\n",i,binNum,percentage,stars);
        }
    }

    public float getPercentage(int index){
        float valueRolled = bin.getBin(index-2); //convert to flow, integer divided by integer will not get you a float...-_-
        float x = valueRolled/numRuns;
        return x;
    }

    public String genStars(int index){
        String stars = "";
        float fPercentage = (getPercentage(index))*100;
        Integer percentage = (int)fPercentage;
        for(int i=1; i<=percentage; i++){
            stars+="*";
        }
        return stars;
    }


}
