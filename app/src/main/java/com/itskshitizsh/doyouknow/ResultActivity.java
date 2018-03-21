package com.itskshitizsh.doyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    int received_score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView score_text_view = (TextView) findViewById(R.id.score_text_view);
        received_score = Integer.parseInt(getIntent().getExtras().getString("User_Score"));
        score_text_view.setText("\""+received_score+" out of 5\"");
    }

    public void exit(View view)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
    public void back(View view)
    {
        Intent goBack = new Intent(ResultActivity.this,ScrollingActivity.class);
        startActivity(goBack);
    }
}
