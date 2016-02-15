import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(true, testParcel instanceof Parcel);
  }

  // @Test
  // public void newParcel_setsHeight() {
  //   Parcel testParcel = new Parcel(1, 1, 1, 4);
  //   assertEquals(1, testParcel.getHeight());
  // }
}
