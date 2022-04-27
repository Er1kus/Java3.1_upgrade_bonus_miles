public class BonusMilesService {

    public int calculate(int ticketCost) {
        int mileCost = 20;
        int bonus = ticketCost / mileCost;

        return bonus;
    }
}