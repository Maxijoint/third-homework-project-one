public class BonusMilesService {

    public int calculate(int price) {
        int calculatedNumberOfMiles = price / 20;
        return calculatedNumberOfMiles;
    }
}
