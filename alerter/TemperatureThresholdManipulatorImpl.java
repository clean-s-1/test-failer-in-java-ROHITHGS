public class TemperatureThresholdManipulatorImpl implements TemperatureThresholdManipulator{
    @Override
    public Integer networkAlertStub(float celsius) {
        if(Float.compare(celsius,200f)<=0) {
            return 200;
        }  else {
            return 500;
        }
    }
}
