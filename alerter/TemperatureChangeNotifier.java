public class TemperatureChangeNotifier {

    static int alertInCelcius(float fahrenheit) {
        int alertFailureCount = 0;
        float celcius = (fahrenheit - 32) * 5 / 9;
        TemperatureThresholdManipulatorImpl temperatureThresholdManipulatorImpl = new TemperatureThresholdManipulatorImpl();
        int returnCode = temperatureThresholdManipulatorImpl.networkAlertStub(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            ++alertFailureCount;
        }

        return alertFailureCount;
    }
    public static void main(String[] args) {
        //alertInCelcius(400.5f);
       // alertInCelcius(303.6f);
        assert (alertInCelcius(400.5f) != 1):"Temperature threshold(200 celcius) crossed";
        assert (alertInCelcius(303.6f) != 0):"Temperature threshold(200 celcius) crossed";
       // assert (alertInCelcius(303.6f) != 0):"Temperature threshold(200 celcius) crossed";
      //  System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
