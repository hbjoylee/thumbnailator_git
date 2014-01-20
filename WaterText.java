package net.coobird.thumbnailator.filters;

import java.awt.Color;
import java.awt.Font;

public class WaterText {
  static String content;
  static Font font;
  static Color color;

  public WaterText(String content, Font font, Color color) {
    this.content = content;
    this.font = font;
    this.color = color;
  }

  public String getContent() {
    return content;
  }

  public Font getFont() {
    return font;
  }

  public Color getColor() {
    return color;
  }

  public int getHeight() {
    return font.getSize();
  }

  public int getWidth() {
    return font.getSize() * content.length();
  }
}
