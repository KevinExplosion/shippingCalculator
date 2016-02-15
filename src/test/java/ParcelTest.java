import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void newParcel_setsHeight() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(1, testParcel.getHeight());
  }

  @Test
  public void newParcel_setsWidth() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(1, testParcel.getWidth());
  }

  @Test
  public void newParcel_setsLength() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(1, testParcel.getLength());
  }

  @Test
  public void newParcel_setsWeight() {
    Parcel testParcel = new Parcel(1, 1, 1, 4);
    assertEquals(4, testParcel.getWeight());
  }

  @Test
  public void newParcel_setsVolume() {
    Parcel testParcel = new Parcel(2, 2, 2, 4);
    assertEquals(8, testParcel.getVolume());
  }

  @Test
  public void newParcel_getShippingSize() {
    Parcel testParcel = new Parcel(2, 2, 2, 4);
    assertEquals(16, testParcel.getShippingSize());
  }

  @Test
  public void shippingCost_calculateShippingCost_int() {
    Parcel testParcel = new Parcel(2, 2, 2, 4);
    int international = 2;
    int overnight = 2;
    assertEquals(64, testParcel.getShippingCost(international, overnight));
  }
}
