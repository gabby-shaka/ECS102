public class frogsimulation
{
/** Distance, in inches, from the starting position to the goal. */
private int goalDistance;
/** Maximum number of hops allowed to reach the goal. */
private int maxHops;

public frogsimulationimulation(int dist, int numHops)
{
goalDistance = dist;
maxHops = numHops;
}

private int hopDistance()
{
    int hop=0;
    hop = (int)(Math.random()*10)+1; 
    if (Math.random()<0.1){
        hop=-hop;
    }
    return hop; 
 }

public boolean simulate()
{ }
public double runSimulations(int num)
{ }