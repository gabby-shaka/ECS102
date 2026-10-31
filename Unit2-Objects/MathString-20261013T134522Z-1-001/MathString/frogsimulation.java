import java.util.ArrayList;

public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    private ArrayList<Integer> currentHopData;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
        currentHopData = new ArrayList<Integer>();
    }

    private int hopDistance()
    {
        return (int) (Math.random() * 11) - 2;
    }

    public boolean simulate()
    {
        currentHopData.clear();
        int pos = 0;
        int hops = 0;
        
        while (pos >= 0 && pos < goalDistance && hops < maxHops)
        {
            int hop = hopDistance();
            currentHopData.add(hop);
            pos += hop;
            hops++;
        }
        
        if (pos >= goalDistance)
        {
            return true;
        }
        
        return false;
    }

    public double runSimulations(int num)
    {
        int successCount = 0;
        
        for (int i = 0; i < num; i++)
        {
            if (simulate())
            {
                successCount++;
            }
            printCurrentHopData();
        }
        
        return (double) successCount / num;
    }

    public void printCurrentHopData()
    {
        System.out.println(currentHopData);
    }

    public static void main(String[] args)
    {
        FrogSimulation sim = new FrogSimulation(24, 5);
        double successRate = sim.runSimulations(5);
        System.out.println("Success Rate: " + successRate);
    }
}