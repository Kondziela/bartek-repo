import org.junit.Assert;
import org.junit.Test;
import samochody.control.SamochodControl;
import samochody.data.CarType;

import static org.junit.Assert.assertThat;

public class SmochodControlTest {

    @Test
    public void shouldAddCar() {
        // given
        SamochodControl samochodControl = new SamochodControl();
        String motor = "MOTOR";
        String gearbox = "GEARBOX";
        int seats = 3;
        CarType carType = CarType.SUV;

        // when
        boolean result = samochodControl.addCar(motor, gearbox, seats, carType);

        // then
        Assert.assertTrue(!result);
    }

}
