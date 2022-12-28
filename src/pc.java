public class pc extends devices {
    public void batteryAlert(int batPercentage) {
        if (batPercentage < 30)
            System.out.println("Battery low, charge the pc");
    }
}
