package edu.cnm.deepdive.geoquiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

  private Button TrueButton;
  private Button FalseButton;
  private Button NextButton;
  private TextView QuestionTextView;

  private Question[] QuestionBank = new Question[] {
      new Question(R.string.question_australia, true),
      new Question(R.string.question_oceans, true),
      new Question(R.string.question_mideast, false),
      new Question(R.string.question_africa, false),
      new Question(R.string.question_asia, true),
      new Question(R.string.question_americas, true),
  }
;
  private int CurrentIndex = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    QuestionTextView = (TextView) findViewById(R.id.true_button);

    TrueButton = (Button) findViewById(R.id.false_button);
    TrueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        checkAnswer(true);
      }

    });

    FalseButton = (Button) findViewById(R.id.false_button);
    FalseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
       checkAnswer(false);
      }

    });
    NextButton = (Button) findViewById(R.id.next_button);
    NextButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        CurrentIndex = (CurrentIndex + 1) % QuestionBank.length;

      }
    });
    private void updateQuestion () {
      int question = QuestionBank[CurrentIndex].getTextResId();
      QuestionTextView.setText();
    }
  }
  private void checkAnswer(boolean userPressTrue) {
    boolean answerIsTrue = QuestionBank[CurrentIndex].isAnswerTrue();

    int messageResId = 0

        if (userPressTrue == answerIsTrue) {
          messageResId = R.string.correct_toast;

        } else {
          messageResId = R.string.incorrect_toast;

        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
            .show();
  }

}
