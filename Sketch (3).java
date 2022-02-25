import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(200, 200);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(32, 131, 266);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  //Ground
    fill(0, 100, 0);
    rect(width / 400, (float) (height / 1.333333), (float)      (width / 0.898876404494), (float) (height / 1.538461));

  //Sun
    fill(255, 255, 0);
    ellipse(width / 400, height / 400, (float)(width /     
    2.22222222), (float)(height / 2.22222222));

  //Chimney
    fill(128, 128, 128);
    rect(width / 2, height / 10, width / 8, (float)(height /    5.714285));
  //Building #1
    fill(255, 0, 0);
    ellipse((float)(width / 1.428571), (float)(height / 
    2.6666666), width / 2, (float)(height / 2.10526315789));
  
    fill(255, 0, 0);
    rect((float)(width / 2.22222222),(float)(height / 
    2.66666666),width / 2, (float)(height / 2.10526315789));

  //Door
    fill (128, 64, 0);
    rect((float)(width / 1.6), (float)(height / 1.6), 
    (float)(width / 6.6666666), (float)(height / 4.4444444));
  //Doorknob
    fill (128, 128, 128);
    ellipse((float)(width / 1.3793103448275), (float)(height / 1.333333333), width / 40, height / 40);
  //Windows
    fill(255,255,255);
    rect((float)(width / 1.25), (float)(height / 2.5), width / 8, height / 8);
    rect(width / 2, (float)(height / 2.5), width / 8, height / 8);
    line(width / 2, (float)(height / 2.162162162), (float)(width / 1.6), (float)(height / 2.162162162));
    line((float)(width / 1.7777777), (float)(height / 2.5), (float) (width / 1.7777777), (float)(height / 1.904761));
    line((float)(width / 1.25), (float)(height / 2.162162162162), (float)(width / 1.081081081), (float)(height / 2.162162162162));
    line((float)(width / 1.159420289855), (float)(height / 2.5), (float)(width / 1.159420289855), (float)(height / 1.904761));
  //Garage
    fill(255, 0, 0);
    rect((float)(width / 13.3333333), (float)(height / 1.904761904761), (float)(width / 2.666666666), (float)(height / 3.076923076923));
    fill (128, 128, 128);
    rect((float)(width / 6.666666), (float)(height / 1.7391304347826), width / 4, (float)(height / 3.63636363));
    stroke(0, 0, 0);
    line((float)(width / 6.666666), (float)(height / 1.666666), (float)(width / 2.5), (float)(height / 1.666666));
    line((float)(width / 6.666666), (float)(height / 1.538461538461), (float)(width / 2.5), (float)(height / 1.538461538461));
    line((float)(width / 6.666666), (float)(height / 1.428571428571), (float)(width / 2.5),(float)(height / 1.428571428571));
    line((float)(width / 6.666666), (float)(height / 1.333333), (float)(width / 2.5), (float)(height / 1.333333));
    line((float)(width / 6.666666), (float)(height / 1.25), (float)(width / 2.5), (float)(height / 1.25));
  
  }
  
  // define other methods down here.
}