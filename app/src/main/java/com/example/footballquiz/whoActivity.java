package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Iterator;


public class whoActivity extends AppCompatActivity {
    private TextView hint1;
    private TextView hint2;
    private TextView hint3;
    private WhoQuestions currentQ;
    private ImageView firststar;
    private ImageView secondstar;
    private ImageView thirdstar;
    private TextInputEditText userAnswer;
    private Button done;


    int totalques;
    int qCounter = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);

        hint1 = findViewById(R.id.hint1);
        hint2 = findViewById(R.id.hint2);
        hint3 = findViewById(R.id.hint3);

        firststar = findViewById(R.id.star1);
        secondstar = findViewById(R.id.star2);
        thirdstar = findViewById(R.id.star3);

        userAnswer = findViewById(R.id.whoAnswer);

        done= findViewById(R.id.button10);

        setQuestionsArrayList(WhoListQuestions);
        totalques = WhoListQuestions.size();

        if (qCounter < totalques) {
            currentQ = WhoListQuestions.get(qCounter);
            hint1.setText(currentQ.getFirstHint());
            hint2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hint2.setText(currentQ.getSecondHint());
                    // secondstar.setImageResource(R.drawable.);
                }
            });
            hint3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hint3.setText(currentQ.getThirdHint());
                    //thirdstar.setImageResource();
                }
            });

            qCounter++;
        } else {
            finish();
        }
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(WhoListQuestions);
                nextquestion();
                /*if(!(userAnswer.findViewById(R.id.textInputEditText).toString().isEmpty())){
                    checkAnswer(WhoListQuestions);
                    nextquestion();
                }else
                    Toast.makeText(whoActivity.this, "Cutorrect" , Toast.LENGTH_SHORT).show();*/

            }
        });

    }


    private static ArrayList<WhoQuestions> WhoListQuestions = new ArrayList<>();
    static WhoQuestions wq1 = new WhoQuestions("I have played with Cristiano Ronaldo, Raheem sterling and Jason Puncheon", "I was once the most expensive teenager in world football when I joined Manchester United", "I scored the opening goal for England in the final of Euro 2020", "Luke Shaw");
    static WhoQuestions wq2 = new WhoQuestions("I have managed players like Robert Lewandowski, Angel Di Maria and Calvert Lewin", "I am the only manager to win league titles in the top 5 Leagues", "I recently left Everton for Real madrid", "Carlo Ancelotti");
    static WhoQuestions wq3 = new WhoQuestions("All the european clubs I have played for have won the champions league but I never have", "My national team famously qualified for the world cup without me", "I commonly refer to my self in the third persom", "Zlatan Ibrahimovic");
    static WhoQuestions wq4 = new WhoQuestions("I have played with greats like Paolo Maldini, Totti and Nedved", "I have lost every champions league final that I have played in", "I rejoined my old club at the age of 43", "Gianluigi Buffon");
    static WhoQuestions wq5 = new WhoQuestions("I have played for Manchester City, Chelsea and Liverpool", "I was banned from football for betting", "I won the champions league with chelsea in 2012", "Daniel Strurridge");
    static WhoQuestions wq6 = new WhoQuestions("I had an argument with Neymar over a penalty kick", "I have played with Cristiano Ronaldo and Draxler", "My nickname is El Matador", "Edinson Cavani");
    static WhoQuestions wq7 = new WhoQuestions("I am Mancunian through and through", "I actively helped fight child hunger in the UK", "I missed a spot kick at the euro 2020 final", "Marcus Rashford");
    static WhoQuestions wq8 = new WhoQuestions("I have played with Stefan Kiesling, Harry Kane and Mladen Petric ", "I have never won a trophy in my club career", "I am the top asian goalscorer in the premier league and champions league", "Heung-min Son");
    static WhoQuestions wq9 = new WhoQuestions("I have played with Ibrahimovic, Cristiano and Cavani", "I was purchased by Jose mourinho in 2016", "I represent the Cote D'Ivoire", "Eric Bailly");
    static WhoQuestions wq10 = new WhoQuestions("I have been managed by Maurizio Sarri, Arsene Wenger and Lucien Favre ", "I am only the third welsh player to make up to 50 appearances in the champions league", "My contract was terminated by Juventus in 2022", "Aaron Ramsey");
    static WhoQuestions wq11 = new WhoQuestions("I am nicknamed the spider", "I joined Manchester united from crystal palace in 2019", "I am known for my exceptional tackling skills", "Aaron Wan Bissaka");
    static WhoQuestions wq12 = new WhoQuestions("I am the youngest player to score at the CONCACAF Gold cup", "I have played with Kei Kamara and Robert Lewandowski", "I won the treble with bayern in 2020", "Alphonso Davies");
    static WhoQuestions wq13 = new WhoQuestions("I am popular for what I did to Maicon when i played for spurs", "I am also famous for my bicycle kick in a champions league final", "I was once the most expensive transfer when I joined Real Madrid", "Gareth Bale");
    static WhoQuestions wq14 = new WhoQuestions("I have managed players like Aubameyang, Leandro Parades and Malang Sarr", "I won the champions league in my first try with my new latest team", "I spent a record 100 million for Romelu Lukaku", "Thomas Tuchel");
    static WhoQuestions wq15 = new WhoQuestions("I have played with Cole palmer, Jordon Ibe and now Conor Gallagher", "I currently have 77 caps for the England national team*", "I can also represent the Jamaican national team", "Raheem Sterling");
    static WhoQuestions wq16 = new WhoQuestions("I scored Arsenal's last champions league goal*", "Benzema called me a Go-kart", "I scored a famous scorpion kick for Arsenal", "Olivier Giroud");
    static WhoQuestions wq17 = new WhoQuestions("I have played with Gabriel Jesus, Dani alves and Raphael Varane", "I scored a long range goal against Juventus in the UCL final", "I am a defensive midfielder", "Casemiro");
    static WhoQuestions wq18 = new WhoQuestions("I am the only belgian player to win the Bundesliga player of the year", "I hold the joint record for the most number of assists in the premier league", "I won the DFB-Pokal with Wolfsburg in 2015", "Kevin De Bruyne");
    static WhoQuestions wq19 = new WhoQuestions("I have won a league title in every season since my debut*", "I scored the only goal in the 2020 UCL final", "I have won the bundesliga 7 times in a row*", "Kingsley Coman");
    static WhoQuestions wq20 = new WhoQuestions("I hold the record for the most amount of goals scored in a 38 game premier league season", "I have shared the premier league golden boot on two (2) occasions", "I am the highest scoring African in premier league history", "Mohammed Salah");


    private void nextquestion() {
        if (qCounter < totalques) {
            currentQ = WhoListQuestions.get(qCounter);
            hint1.setText(currentQ.getFirstHint());
            hint2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hint2.setText(currentQ.getSecondHint());
                    // secondstar.setImageResource(R.drawable.);
                }
            });
            hint3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hint3.setText(currentQ.getThirdHint());
                    //thirdstar.setImageResource();
                }
            });

            qCounter++;
        } else {
            finish();
        }
    }

    private void checkAnswer(ArrayList r) {
        Iterator itr = WhoListQuestions.iterator();

        for (int i = 0; i < r.size(); i++) {
            WhoQuestions element = (WhoQuestions) itr.next();

            if (userAnswer.getText().toString().equalsIgnoreCase(element.getAnswer())) {
                Toast.makeText(whoActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                score = +5;
                nextquestion();

            } else System.out.println("n");
        }
    }

    public static void setQuestionsArrayList (ArrayList q){
        WhoListQuestions.add(wq1);
        WhoListQuestions.add(wq2);
        WhoListQuestions.add(wq3);
        WhoListQuestions.add(wq4);
        WhoListQuestions.add(wq5);
        WhoListQuestions.add(wq6);
        WhoListQuestions.add(wq7);
        WhoListQuestions.add(wq8);
        WhoListQuestions.add(wq9);
        WhoListQuestions.add(wq10);
        WhoListQuestions.add(wq12);
        WhoListQuestions.add(wq13);
        WhoListQuestions.add(wq14);
        WhoListQuestions.add(wq15);
        WhoListQuestions.add(wq16);
        WhoListQuestions.add(wq17);
        WhoListQuestions.add(wq18);
        WhoListQuestions.add(wq19);
        WhoListQuestions.add(wq20);
    }
}