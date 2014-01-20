package net.coobird.thumbnailator.geometry;

import java.awt.Point;

/**
 * This class calculates the position of an image which is to be enclosed,
 * using an absolute coordinate at which the image should be located.
 * 
 * @author coobird
 *
 */
public final class Coordinate implements Position
{
	/**
	 * The horizontal position of the image to be enclosed.
	 */
	private final int x;
	
	/**
	 * The vertical position of the image to be enclosed.
	 */
	private final int y;
	
	/**
	 * Instantiates an object which calculates the position of an image, using
	 * the given coordinates.
	 * 
	 * @param x			The horizontal component of the top-left corner of the
	 * 					image to be enclosed.
	 * @param y			The vertical component of the top-left corner of the
	 * 					image to be enclosed.
	 */
	public Coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public Point calculate(int enclosingWidth, int enclosingHeight, int width,
			int height, int insetLeft, int insetRight, int insetTop,
			int insetBottom)
	{
		int x = this.x + insetLeft;
		int y = this.y + insetTop;
		
		return new Point(x, y);
	}

  int insetLeft = 0;
  int insetRight = 0;
  int insetTop = 0;
  int insetBottom = 0;
  
  public int getinsetLeft() {
    return this.insetLeft;
  }

  public int getinsetRight() {
    return this.insetRight;
  }

  public int getinsetTop() {
    return this.insetTop;
  }

  public int getinsetBottom() {
    return this.insetBottom;
  }
  
  public void setinsetLeft(int insetLeft) {
    this.insetLeft = insetLeft;
  }

  public void setinsetRight(int insetRight) {
    this.insetRight = insetRight;
  }

  public void setinsetTop(int insetTop) {
    this.insetTop = insetTop;
  }

  public void setinsetBottom(int insetBottom) {
    this.insetBottom = insetBottom;
  }
}
