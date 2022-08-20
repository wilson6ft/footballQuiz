package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Iterator;

public class canyounameActivity extends AppCompatActivity {
    private TextView mainQuestion;
    private TextView answers;
    private canyouQuestions currentques;
    private Button done;
    private TextInputEditText userAnswer;

    int totalques;
    int qCounter;

    private static ArrayList<canyouQuestions> cyq= new ArrayList<>();
    static canyouQuestions cyg1 = new canyouQuestions(" All the premier league clubs in the 2022/23 season", new String[]{"Arsenal","Bournemouth","aston villa","Manchester city","manchester united","liverpool","chelsea","fulham","leicester","wolves","nottingham forrest","crystal palace","brighton","tottenham hotspur","leeds","everton","west ham","southampton","newcastle","brentford"});
    static canyouQuestions cyg2 = new canyouQuestions("All the balon d'or winners", new String[]{"Lionel Messi","cristiano ronaldo","luka modric","kaka","fabio cannavaro","Ronaldinho","Andriy shevchenko","pavel nedved","Ronaldo","rivaldo","zinedine zidane","matthias zimmer","george weah","Stanley matthews","alfredo di stefano","raymond kopa","luis suarez","omar sivori","josef masopust","marco van basten", "lothar matthaus","Ruud gullit","igor belanov","michel platini","paolo rossi","karl-heinz rummenigge","gerd muller","george best","florian albert","oleg blokhin","Eusebio","lev yashin","bobby charlton","gianna rivera","franz beckenbauer","kevin keegan"});
    static canyouQuestions cyg3 = new canyouQuestions("All the clubs that have won the premier league",new String[]{"Manchester United", "manchester city", "Liverpool", "chelsea", "Leeds", "Blackburn rovers", "Newcastle", "arsenal"});
    //static canyouQuestions cyg4 = new canyouQuestions("The starting lineup from Sergio Aguero's last match for Manchester City",new String[]{});
    static canyouQuestions cyg5 = new canyouQuestions("The top 20 most expensive transfers of all time",new String[]{"Neymar","Kylian mbappe","Joao felix","phillipe coutinho","antoine griezmann","jack grealish","romelu lukaku","ousmane dembele","paul pogba","gareth bale","cristiano ronaldo","eden hazard","gonzalo higuain","harry maguire","jadon sancho","virgil van dijk","luis suarez","Aurelien tchouameni","james rodriguez","kepa arrizabalaga"});
    static canyouQuestions cyg6 = new canyouQuestions("All the golden boy winners",new String[]{"Renato Sanches","Paul pogba","Anthony martial","matthijs de ligt", "rafael van der vaart", "Anderson","sergio aguero","Isco","wayne rooney","mario gotze","raheem sterling","mario balotelli","cesc fabregas","Joao felix", "Lionel messi","alexandre pato","kylian mbappe","erling halaand","pedri"});
    static canyouQuestions cyg7 = new canyouQuestions("The top 20 highest goalscorers in champions league history",new String[]{"cristiano ronaldo","lionel messi","Robert lewandowski","karim benzema","Raul","Ruud van nistelrooy","thomas muller","thierry henry","zlatan ibrahimovic","andriy shevchenko","filippo inzaghi","alfredo di stefano","Eusebio","didier drogba","alessandro del piero","neymar","sergio aguero","ferenc puskas","mohammed salah","edinson cavani"});
    //static canyouQuestions cyg8 = new canyouQuestions("Clubs to have won the champions league",new String[]{});
    static canyouQuestions cyg9 = new canyouQuestions("All the clubs that Jose Mourinho has managed",new String[]{"Tottenham hotspur", "Manchester United", "Inter milan", "Roma", "Porto", "Real madrid", "Chelsea", "Uniao de leiria"});
    //static canyouQuestions cyg10 = new canyouQuestions("All the countries to win a world cup",new String[]{});
   /* static canyouQuestions cyg11 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg12 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg13 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg14 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg15 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg16 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg17 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg18 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg19 = new canyouQuestions("",new String[]{});
    static canyouQuestions cyg20 = new canyouQuestions("",new String[]{});*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canyouname);

        mainQuestion = findViewById(R.id.canQuestion);
        done = findViewById(R.id.button9);
        userAnswer = findViewById(R.id.canAnswer);

        setQuestionsArrayList(cyq);
        totalques = cyq.size();
        showQuestion();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(userAnswer.toString().isEmpty())){
                    nextquestion();
                    checkAnswer(cyq);
                    userAnswer.getText().clear();
                }else
                    Toast.makeText(canyounameActivity.this, "Cutorrect" , Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void showQuestion(){
        if (qCounter<totalques){
            currentques = cyq.get(qCounter);
            mainQuestion.setText(currentques.getQuestion());
        }
    }
    private void nextquestion(){
        if (qCounter<totalques){
            currentques = cyq.get(qCounter);
            mainQuestion.setText(currentques.getQuestion());

            qCounter++;
        }else{
            finish();
        }
    }

    private void checkAnswer(ArrayList r){
        Iterator itr= cyq.iterator();

        for (int i=0; i<r.size(); i++) {
            canyouQuestions element = (canyouQuestions) itr.next();
            if (userAnswer.getText().toString().equalsIgnoreCase(element.getAnswer(i))) {
                Toast.makeText(canyounameActivity.this, "Correct" , Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(canyounameActivity.this, "noto" , Toast.LENGTH_SHORT).show();
        }
    }

    public static void setQuestionsArrayList(ArrayList t) {
        t.add(cyg1);
        t.add(cyg2);
        t.add(cyg3);
        t.add(cyg5);
        t.add(cyg6);
        t.add(cyg7);
        t.add(cyg9);
    }

}