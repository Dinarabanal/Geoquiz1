package edu.cnm.deepdive.geoquiz1;

public class Question {

  private int TextResId;
  private boolean AnswerTrue;

  public int getTextResId() {
    return TextResId;
  }

  public void setTextResId(int textResId) {
    TextResId = textResId;
  }

  public boolean isAnswerTrue() {
    return AnswerTrue;
  }

  public void setAnswerTrue(boolean answerTrue) {
    AnswerTrue = answerTrue;
  }

  public Question(int textResId, boolean answerTrue) {
    TextResId = textResId;
    AnswerTrue = answerTrue;
  }
}