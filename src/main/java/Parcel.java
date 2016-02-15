public class Parcel {
  private Integer mHeight;
  private Integer mWidth;
  private Integer mLength;
  private Integer mWeight;

  public Parcel(int height, int width, int length, int weight) {
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getLength() {
    return mLength;
  }

  public int getWeight() {
    return mWeight;
  }

  public int getVolume() {
    return (mHeight * mWidth * mLength);
  }

  public int getShippingSize() {
    return ((getWeight() / 2) * getVolume());
  }

  public int getShippingCost(int distance,int priority) {
    return getShippingSize() * (distance + priority);
  }
}
