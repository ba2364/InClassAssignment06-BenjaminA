package com.example.benjaminantell.inclassassignment06_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Front extends AppCompatActivity {

    Button toEdit;
    TextView display;
    String teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        toEdit = (Button) findViewById(R.id.newteam);
        display = (TextView) findViewById(R.id.display);
        teams = display.getText().toString();
    }

    @Override
    protected void onResume() {
        super.onResume();
        teams = display.getText().toString();
    }

    public void newTeam(View view) {
        Intent intent = new Intent(this, Back.class);
        startActivityForResult(intent, RequestCodes.ADD_TEAM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_TEAM && resultCode == RESULT_OK) {
            Team team = (Team) data.getSerializableExtra(Keys.TEAM);
            teams = teams + (team.toString());
            display.setText(teams);
        }
    }
}