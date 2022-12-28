public class devices {
    public void batteryAlert(int batPercentage)
    {
        if (batPercentage < 20)
            System.out.println("Battery low");
    }
}

