package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;



public class playermatchActivity extends AppCompatActivity {
    private static ArrayList<Questions> questionsArrayList= new ArrayList<>();
    static Questions q1 = new Questions("I hold the record for the most Balon D'ors by a single player","Alan Shearer");
    static Questions q2 = new Questions("I am a former barcelona player, and I am the player with the highest ever transfer fee ", "Lionel Messi");
    static Questions q3 = new Questions("I scored 5 goals in 9 minutes against Wolfsburg", "Cristiano Ronaldo");
    static Questions q4 = new Questions("I am popularly known around the world as CR7", "Sergio Aguero");
    static Questions q5 = new Questions("I am only the second teenager to score a goal in the world cup final", "Neymar JR");
    static Questions q6 = new Questions("I famously won the premier league for Manchester City with the last kick of the game","Real Madrid");

    private TextView tvQuestion;
    private ImageView ipicture;
    private TextInputEditText userInput;
    private Questions currentques;
    private TextView questionNo;
    private TextView tvScore;

    private ImageButton messi;
    private ImageButton neymar;
    private ImageButton lewy;
    private ImageButton ronaldo;
    private ImageButton mbappe;
    private ImageButton aguero;
    private ImageButton choice;


    int totalques;
    int qCounter=0;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playermatch);

         tvQuestion = findViewById(R.id.guessQuestion);

        setQuestionsArrayList(questionsArrayList);
        totalques = questionsArrayList.size();
        nextquestion();

        messi = findViewById(R.id.imageButton);
        neymar = findViewById(R.id.imageButton3);
        ronaldo = findViewById(R.id.imageButton2);
        aguero = findViewById(R.id.imageButton5);
        mbappe = findViewById(R.id.imageButton4);
        lewy = findViewById(R.id.imageButton6);

        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q1){
                    Toast.makeText(playermatchActivity.this, "messi" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "notmessi" , Toast.LENGTH_SHORT).show();

            }
        });

        neymar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q2){
                    Toast.makeText(playermatchActivity.this, "neymar" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "not neymar" , Toast.LENGTH_SHORT).show();

            }
        });

        ronaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q4){
                    Toast.makeText(playermatchActivity.this, "ronaldo" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "not ronaldo" , Toast.LENGTH_SHORT).show();

            }
        });

        aguero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q6){
                    Toast.makeText(playermatchActivity.this, "ageuro" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "not aguero" , Toast.LENGTH_SHORT).show();

            }
        });

        mbappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q5){
                    Toast.makeText(playermatchActivity.this, "mbappe" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "not mbappe" , Toast.LENGTH_SHORT).show();

            }
        });

        lewy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentques==q3){
                    Toast.makeText(playermatchActivity.this, "lewy" , Toast.LENGTH_SHORT).show();
                    nextquestion();
                }else
                    Toast.makeText(playermatchActivity.this, "not lewy" , Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void nextquestion(){
        if (qCounter<totalques){
            currentques = questionsArrayList.get(qCounter);
            tvQuestion.setText(currentques.getQuestions());

            qCounter++;
        }else{
            finish();
        }
    }

    public static void setQuestionsArrayList(ArrayList questionsArrayList) {
        questionsArrayList.add(q1);
        questionsArrayList.add(q2);
        questionsArrayList.add(q3);
        questionsArrayList.add(q4);
        questionsArrayList.add(q5);
        questionsArrayList.add(q6);

    }
}