public class Dice {

    private Integer numberOfDice;
    private Integer tossSum = 0;

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        tossSum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            tossSum += 1+(int)(Math.random()*6);
        }
        return tossSum;
    }

    public Integer getNumberOfDice(){
        return numberOfDice;
    }
}
