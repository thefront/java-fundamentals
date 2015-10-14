// Name: Richard Tzeng
// Date: 10/13/2015
// HighScore class

public class HighScore {
  private String name;
  private int score;

  public HighScore(String n, int s) {
    name = n;
    score = s;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setScore(int s) {
    score = s;
  }

  public int getScore() {
    return score;
  }
}
