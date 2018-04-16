package com.jasonlee.wordsmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseSet extends AppCompatActivity {

    Button cet4Button;
    Button cet6Button;
    Button toeflButton;
    Button greButton;
    Button ieltsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_set);
        cet4Button=(Button) findViewById(R.id.cet4Button);
        cet6Button=(Button) findViewById(R.id.cet6Button);
        toeflButton=(Button) findViewById(R.id.toeflButton);
        greButton=(Button) findViewById(R.id.greButton);
        ieltsButton=(Button) findViewById(R.id.ieltsButton);

        greButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseSet.this,MainWordsActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }
}
