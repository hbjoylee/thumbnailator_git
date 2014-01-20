package net.coobird.thumbnailator.filters;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;

import net.coobird.thumbnailator.builders.BufferedImageBuilder;
import net.coobird.thumbnailator.geometry.Position;

/**
 * This class applies a watermark to an image.
 * 
 * @author coobird
 * 
 */
public class TextWatermark implements ImageFilter {
  /**
   * The position of the watermark.
   */
  private final Position position;

  /**
   * The watermark image.
   */
  private final WaterText WaterText;

  /**
   * The opacity of the watermark.
   */
  private final float opacity;

  /**
   * Instantiates a filter which applies a watermark to an image.
   * 
   * @param position
   *          The position of the watermark.
   * @param WaterText
   *          The watermark text.
   * @param opacity
   *          The opacity of the watermark.
   *          <p>
   *          The value should be between {@code 0.0f} and {@code 1.0f}, where
   *          {@code 0.0f} is completely transparent, and {@code 1.0f} is
   *          completely opaque.
   */
  public TextWatermark(Position position, WaterText WaterText, float opacity) {
    if (position == null) {
      throw new NullPointerException("Position is null.");
    }
    if (WaterText == null) {
      throw new NullPointerException("Watermark Text is null.");
    }
    if (opacity > 1.0f || opacity < 0.0f) {
      throw new IllegalArgumentException("Opacity is out of range of "
          + "between 0.0f and 1.0f.");
    }

    this.position = position;
    this.WaterText = WaterText;
    this.opacity = opacity;
  }

  public BufferedImage apply(BufferedImage img) {
    int width = img.getWidth();
    int height = img.getHeight();
    int type = img.getType();

    BufferedImage imgWithWatermark = new BufferedImageBuilder(width, height,
        type).build();

    Graphics2D g = imgWithWatermark.createGraphics();
    int watermarkWidth = WaterText.getHeight();
    int watermarkHeight = WaterText.getWidth();

    Point p = position.calculate(width, height, watermarkWidth,
        watermarkHeight, position.getinsetLeft(), position.getinsetRight(),
        position.getinsetTop(), position.getinsetBottom());
    // 设置颜色 Color.red
    g.setColor(WaterText.getColor());

    // 设置 Font new Font("宋体", Font.BOLD, 30)
    g.setFont(WaterText.getFont());

    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, opacity));

    // 第一参数->设置的内容，后面两个参数->文字在图片上的坐标位置(x,y) .
    g.drawString(WaterText.getContent(), p.x, p.y);

    g.dispose();

    return imgWithWatermark;
  }
}
