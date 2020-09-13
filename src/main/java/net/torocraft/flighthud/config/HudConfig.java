package net.torocraft.flighthud.config;

import java.awt.Color;

public class HudConfig implements IConfig {
  public transient int color = Color.GREEN.getRGB();
  public transient float halfThickness = 0.5f;

  public boolean watchForConfigChanges = false;

  public float width = 0.6f;
  public float height = 0.6f;
  public float scale = 1;
  public float xOffset = 0;
  public float yOffset = 0;
  public float thickness = 1;

  public int color_red = 0;
  public int color_green = 255;
  public int color_blue = 0;

  public boolean elytra_showHealth = true;
  public float elytra_x = 0.5f;
  public float elytra_y = 0.8f;

  public boolean location_showReadout = true;
  public float location_x = 0.2f;
  public float location_y = 0.8f;

  public boolean flightPath_show = true;

  public int pitchLadder_degreesPerBar = 20;
  public boolean pitchLadder_showLadder = true;
  public float pitchLadder_optimumGlideAngle = -2;
  public float pitchLadder_optimumClimbAngle = 55;

  public boolean speed_showScale = true;
  public boolean speed_showReadout = true;

  public boolean altitude_showScale = true;
  public boolean altitude_showReadout = true;
  public boolean altitude_showHeight = true;
  public boolean altitude_showGroundInfo = true;

  public boolean heading_showScale = true;
  public boolean heading_showReadout = true;
  public boolean heading_showOrdinals = true;

  @Override
  public void update() {
    updateThickness();
    updateColor();
  }

  private void updateThickness() {
    try {
      halfThickness = thickness / 2;
    } catch (Exception e) {
      halfThickness = 0.5f;
    }
  }

  private void updateColor() {
    try {
      color = new Color(color_red, color_green, color_blue).getRGB();
    } catch (Exception e) {
      color = Color.GREEN.getRGB();
    }
  }

  public void setDefaultMinSettings() {
    this.altitude_showScale = false;
    this.speed_showScale = false;
    this.heading_showScale = false;
    this.altitude_showGroundInfo = false;
    this.pitchLadder_showLadder = false;
    this.pitchLadder_optimumClimbAngle = 0;
    this.pitchLadder_optimumGlideAngle = 0;
    this.elytra_showHealth = false;
    this.flightPath_show = false;
    this.altitude_showHeight = false;
  }
}
