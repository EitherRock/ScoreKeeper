package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int oneHealth = 20;
    private int twoHealth = 20;
    private TextView p1Text;
    private TextView p2Text;

    // player one add button variables
    private Button playerOneAdd;
    private Button resetButton;

    private View.OnClickListener resetbutt = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            resetClicked();
        }
    };
    private View.OnClickListener pOneAdd = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            playerOneAddClicked();
        }
    };

    // Player one sub button variables
    private Button playerOneSub;
    private View.OnClickListener pOneSubb = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            playerOneSubClicked();
        }
    };

    // Player two add button variables
    private Button playerTwoAdd;
    private View.OnClickListener pTwoAdd = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            playerTwoAddClicked();
        }
    };

    // Player two Sub button variables
    private Button playerTwoSub;
    private View.OnClickListener pTwoSub = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            playerTwoSubClicked();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneAdd = findViewById(R.id.playerOneAdd);
        playerOneSub = findViewById(R.id.playerOneSub);
        playerTwoAdd = findViewById(R.id.playerTwoAddButt);
        playerTwoSub = findViewById(R.id.playerTwoSubButt);
        resetButton = findViewById(R.id.resetButton);

        p1Text = findViewById(R.id.Player1txt);
        p2Text = findViewById(R.id.player2txt);

        playerOneAdd.setOnClickListener(pOneAdd);
        playerOneSub.setOnClickListener(pOneSubb);
        playerTwoAdd.setOnClickListener(pTwoAdd);
        playerTwoSub.setOnClickListener(pTwoSub);
        resetButton.setOnClickListener(resetbutt);

    }


    private void resetClicked(){
        oneHealth = 20;
        twoHealth = 20;

        p1Text.setText(Integer.toString(oneHealth));
        p2Text.setText(Integer.toString(twoHealth));
    }
    private void playerOneAddClicked(){
        oneHealth = ++oneHealth;
        p1Text.setText(Integer.toString(oneHealth));
    }
    private void playerOneSubClicked(){
        oneHealth = --oneHealth;
        p1Text.setText(Integer.toString(oneHealth));
    }
    private void playerTwoAddClicked(){
        twoHealth = ++twoHealth;
        p2Text.setText(Integer.toString(twoHealth));
    }
    private void playerTwoSubClicked(){
        twoHealth = --twoHealth;
        p2Text.setText(Integer.toString(twoHealth));
    }

}
