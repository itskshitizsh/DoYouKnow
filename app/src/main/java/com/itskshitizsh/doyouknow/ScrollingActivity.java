package com.itskshitizsh.doyouknow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    int score;                                   // To keep track of Score of User.
    RadioGroup rg_1, rg_2, rg_3, rg_4, rg_5;        // As we have 5 Questions and each as one Correct answer.
    RadioButton rb_1, rb_2, rb_3, rb_4, rb_5;       // Selected Radiobutton corresopnding to each radioGroup.
    RadioButton rb_1C,rb_2A,rb_3B,rb_4B, rb_5C;     // Answers for current Questions.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rg_1 = (RadioGroup) findViewById(R.id.rg_1);
        rg_2 = (RadioGroup) findViewById(R.id.rg_2);
        rg_3 = (RadioGroup) findViewById(R.id.rg_3);
        rg_4 = (RadioGroup) findViewById(R.id.rg_4);
        rg_5 = (RadioGroup) findViewById(R.id.rg_5);
        rb_1C = (RadioButton) findViewById(R.id.radioButton1c);
        rb_2A = (RadioButton) findViewById(R.id.radioButton2a);
        rb_3B = (RadioButton) findViewById(R.id.radioButton3b);
        rb_4B = (RadioButton) findViewById(R.id.radioButton4b);
        rb_5C = (RadioButton) findViewById(R.id.radioButton5c);

    }

    /**
     * selectedRGi Corresponding to user selection for answer.
     * i = 1,2,3,4,5;
     *
     * @param view
     */
    public void selectedRG1(View view){
        int rbid = rg_1.getCheckedRadioButtonId();
        rb_1 = (RadioButton) findViewById(rbid);
        Toast.makeText(getBaseContext(),"You Selected : "+rb_1.getText(),Toast.LENGTH_SHORT).show();
    }

    public void selectedRG2(View view){
        int rbid = rg_2.getCheckedRadioButtonId();
        rb_2 = (RadioButton) findViewById(rbid);
        Toast.makeText(getBaseContext(),"You Selected : "+rb_2.getText(),Toast.LENGTH_SHORT).show();
    }

    public void selectedRG3(View view){
        int rbid = rg_3.getCheckedRadioButtonId();
        rb_3 = (RadioButton) findViewById(rbid);
        Toast.makeText(getBaseContext(),"You Selected : "+rb_3.getText(),Toast.LENGTH_SHORT).show();
    }

    public void selectedRG4(View view){
        int rbid = rg_4.getCheckedRadioButtonId();
        rb_4 = (RadioButton) findViewById(rbid);
        Toast.makeText(getBaseContext(),"You Selected : "+rb_4.getText(),Toast.LENGTH_SHORT).show();
    }

    public void selectedRG5(View view){
        int rbid = rg_5.getCheckedRadioButtonId();
        rb_5 = (RadioButton) findViewById(rbid);
        Toast.makeText(getBaseContext(),"You Selected : "+rb_5.getText(),Toast.LENGTH_SHORT).show();
    }

    /**
     * Checking submission and increasing score accordingly in Submit method.
     * This method calls when we click on Lock The Answers Button after attempting solutions.
     *
     * @param view
     */
    public void Submit(View view) {
        score = 0;
        if (rb_1C.isChecked()) {
            score++;
        }
        if (rb_2A.isChecked()) {
            score++;
        }
        if (rb_3B.isChecked()) {
            score++;
        }
        if (rb_4B.isChecked()) {
            score++;
        }
        if (rb_5C.isChecked()) {
            score++;
        }
        Intent result = new Intent(ScrollingActivity.this,ResultActivity.class);
        result.putExtra("User_Score",Integer.toString(score));
        startActivity(result);
    }



}

/*
    Answers
    1. c | 2. a | 3. b | 4. b | 5. c | 6. c | 7. c | 8. c | 9. a | 10. a
    | 11. c | 12. a | 13. b | 14. c | 15. c | 16. b | 17. b | 18. c |
    19. c | 20. a
*/
