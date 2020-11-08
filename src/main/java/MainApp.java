public class MainApp{

    public static void main(String[] args){
        int numDice = 5;
        int numRuns = 10000;
        Simulation sim = new Simulation(numDice,numRuns);
        sim.runSimulation();
        sim.printResults();
    }
}
