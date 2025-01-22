package belajar.java.dasar;

public enum Level {
  STANDARD("ALUCARD", "Standard LVL"),
  PREMIUM("NANA", "Premium LVL"),
  VIP("MIYA"),;

  private String Description;
  private String Hero;

  Level(String description) {
    this.Description = description;
  }

  Level(String Hero, String description) {
    this.Description = description;
    this.Hero = Hero;
  }

  public String getDescription() {
    return Description;
  }

  public String getHero() {
    return Hero;
  }
}
