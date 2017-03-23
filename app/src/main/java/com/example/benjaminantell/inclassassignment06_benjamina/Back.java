package com.example.benjaminantell.inclassassignment06_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Back extends AppCompatActivity {
    TextView cityName;
    EditText nickName;
    EditText titles;
    CheckBox completedBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        cityName = (EditText) findViewById(R.id.cityName);
        nickName = (EditText) findViewById(R.id.nickname);
        titles = (EditText) findViewById(R.id.titles);
        completedBox = (CheckBox) findViewById(R.id.exist);
    }

    public void addTeam(View view) {
        String name = cityName.getText().toString();
        String champs = titles.getText().toString();
        int champions = Integer.parseInt(champs);
        String nickname = nickName.getText().toString();
        boolean complete = completedBox.isChecked();
        Team team = new Team(name, nickname, champions, complete);
        Intent i = new Intent(this, Front.class);
        i.putExtra(Keys.TEAM, team);
        setResult(RESULT_OK, i);
        finish();
    }
}