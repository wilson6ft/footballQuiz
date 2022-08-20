package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Iterator;

public class guessActivity extends AppCompatActivity {

    private TextView tvQuestion;
    private ImageView ipicture;
    private TextInputEditText userInput;
    private Button done;
    private Questions currentques;
    private TextView questionNo;
    private TextView tvScore;

    int totalques;
    int qCounter;
    int score=0;


    private static ArrayList<Questions> questionsArrayList= new ArrayList<>();
    static Questions q1 = new Questions("Who has scored the most goals in the premier league","Alan Shearer", "I played for newcastle and blackburn rovers", "Alan shearer has scored 260 goals in the premier league");
    static Questions q2 = new Questions("Which player has won the most Ballon d'Or awards", "Lionel Messi", "I am the all time top scorer for Barcelona", "Lionel Messi has won 7 Ballon d'ors quite impressive");
    static Questions q3 = new Questions("Which player has the most goals in Champions league history", "Cristiano Ronaldo", "I am real madrids and portugal's all time leaading goalscorer", "Ronaldo is considered by many to be the greatest footballer of all time");
    static Questions q4 = new Questions("Who famously won the premier league title for Manchester City with the clock on 93:20 ", "Sergio Aguero", "I am manchester city's all time top scorer", "Sergio aguero is good friendcs with Messi, he even joined barcelona to link up with him but due to medical issues he had to retire");
    static Questions q5 = new Questions("Who is the most expensive player in world football", "Neymar JR", "Paris Saint Germain paid 222 million euros for me", "Wow 222 million thats a lot of money");
    static Questions q6 = new Questions("Which club has won the most champions leagues","Real Madrid", "We have won 14 champions league trophies", "Real madrid are the most successful club in the history of the champions league ");
    static Questions q7 = new Questions("Which player holds the record for the longest dropkick", "Ederson Moraes", "I am a brazillian goalkeeper who plays for manchester city", "Ederson is known for his outrageous drop kick distances");
    static Questions q8 = new Questions("Which player has the most goals in the champions league without actually winning it", "Zlatan Ibrahimovic", "I usually speak about my self in third person", "There is only one ZLATAN");
    static Questions q9 = new Questions("Which nation has won the most world cups", "Brazil", "We have famous footballers like Ronaldo, Rivaldo and Pele", "Brazil are the most successful team in the world cup");
    static Questions q10 = new Questions("Robert Lewandowski scored 5 goals in 9 minutes against which club", "VFL Wolfsburg", "We compete in the german bundesliga and we have won it as recently as 2009-10", "VFL wolfsburg were the unlucky victims of Lewandowski's masterclass");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        tvQuestion = findViewById(R.id.textView2);
        ipicture = findViewById(R.id.imageView2);
        userInput = findViewById(R.id.textInputEditText);
        done =findViewById(R.id.button8);
        tvScore = findViewById(R.id.textView3);

        setQuestionsArrayList(questionsArrayList);
        totalques = questionsArrayList.size();

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(userInput.findViewById(R.id.textInputEditText).toString().isEmpty())){
                    nextquestion();
                    checkAnswer(questionsArrayList);
                    userInput.getText().clear();
                }else
                    Toast.makeText(guessActivity.this, "Cutorrect" , Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void checkAnswer(ArrayList r){
        Iterator itr= questionsArrayList.iterator();

        for (int i=0; i<r.size(); i++){
            Questions element = questionsArrayList.get(i);

            if (userInput.getText().toString().equalsIgnoreCase(element.getAnswers())) {
                Toast.makeText(guessActivity.this, "Correct" , Toast.LENGTH_SHORT).show();
                score =+5;
                tvScore.setText("Score: " + score);
            }
        }

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

    public void onClick(View view){
        //launching main menu
        Intent i = new Intent(this, menuActivity.class);
        startActivity(i);
    }

    public static void setQuestionsArrayList(ArrayList questionsArrayList) {
        questionsArrayList.add(q1);
        questionsArrayList.add(q2);
        questionsArrayList.add(q3);
        questionsArrayList.add(q4);
        questionsArrayList.add(q5);
        questionsArrayList.add(q6);
        questionsArrayList.add(q7);
        questionsArrayList.add(q8);
        questionsArrayList.add(q9);
        questionsArrayList.add(q10);
    }
}