public class MainApp{

    public static void main(String[] args){
        int numDice = 2;
        int numRuns = 1000000;
        Simulation sim = new Simulation(numDice,numRuns);
        sim.runSimulation();
        sim.printResults();
    }
}
