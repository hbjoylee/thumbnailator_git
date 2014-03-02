package net.coobird.thumbnailator.geometry;

import java.awt.Point;

import net.coobird.thumbnailator.filters.Caption;
import net.coobird.thumbnailator.filters.ImageFilter;
import net.coobird.thumbnailator.filters.Watermark;

/**
 * An enum of predefined {@link Position}s.
 * <p>
 * Primary use of this enum is for selecting a position to place watermarks
 * (using the {@link Watermark} class), captions (using the {@link Caption}
 * class) and other {@link ImageFilter}s.
 * 
 * @author coobird
 * 
 */
public enum Positions implements Position {
  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed at the top left-hand corner of the enclosing image.
   */
  
  TOP_LEFT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = insetLeft;
      int y = insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be horizontally centered at the top of the enclosing image.
   */
  TOP_CENTER() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = (enclosingWidth / 2) - (width / 2) + insetLeft;
      int y = insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed at the top right-hand corner of the enclosing image.
   */
  TOP_RIGHT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = enclosingWidth - width - insetRight;
      int y = insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed vertically centered at the left-hand corner of the
   * enclosing image.
   */
  CENTER_LEFT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = insetLeft;
      int y = (enclosingHeight / 2) - (height / 2) + insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed
   * horizontally and vertically centered in the enclosing image.
   */
  CENTER() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = (enclosingWidth / 2) - (width / 2) + insetLeft;
      int y = (enclosingHeight / 2) - (height / 2) + insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed vertically centered at the right-hand corner of the
   * enclosing image.
   */
  CENTER_RIGHT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = enclosingWidth - width - insetRight;
      int y = (enclosingHeight / 2) - (height / 2) + insetTop;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed at the bottom left-hand corner of the enclosing image.
   */
  BOTTOM_LEFT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = insetLeft;
      int y = enclosingHeight - height - insetBottom;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be horizontally centered at the bottom of the enclosing image.
   */
  BOTTOM_CENTER() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = (enclosingWidth / 2) - (width / 2) + insetLeft;
      int y = enclosingHeight - height - insetBottom;
      return new Point(x, y);
    }
  },

  /**
   * Calculates the {@link Point} at which an enclosed image should be placed if
   * it is to be placed at the bottom right-hand corner of the enclosing image.
   */
  BOTTOM_RIGHT() {
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
    
    public Point calculate(int enclosingWidth, int enclosingHeight, int width,
        int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {
      int x = enclosingWidth - width - insetRight;
      int y = enclosingHeight - height - insetBottom;
      return new Point(x, y);
    }
  },
  ;
}
