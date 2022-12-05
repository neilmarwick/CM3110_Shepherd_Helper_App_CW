package rgu.ac.uk.cm3110app20047522;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class CalculatorActivity extends AppCompatActivity {

    int numberSheep; //the user's answer to the first question

    EditText numSheepInput; //the user input field for the first question

    Button question1Btn; //the submit button for the first question

    TextView question1Answer; //the TextView of the answer for the first question

    double acreAmount = 0; //the return value from the first question



    int heptavacDose; //the user's answer to the second question

    EditText sheepWeightInput; //the user input field for the second question

    Button question2Btn; //the submit button for the second question

    TextView question2Answer; //the TextView of the answer for the second question

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getSupportActionBar().setTitle("Calculator"); //setting title of the app
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //back button for going back to previous activity

        //initializing the textView field that shows the calculated response to the first question
        question1Answer = (TextView) findViewById(R.id.question1AnswerTxt);

        //initializing the first editText fields (the user's input)
        numSheepInput = (EditText) findViewById(R.id.numSheepInput);

        //initializing the question1Btn (the first submit button)
        question1Btn = (Button) findViewById(R.id.question1Btn);





        //initializing the textView field that shows the calculated response to the second question
        question2Answer = (TextView) findViewById(R.id.question2AnswerTxt);

        //initializing the second editText fields (the user's input)
        sheepWeightInput = (EditText) findViewById(R.id.sheepWeightInput);

        //initializing the question2Btn (the second submit button)
        question2Btn = (Button) findViewById(R.id.question2Btn);



        //When the first submit button is clicked this method will run
        question1Btn.setOnClickListener(view -> {

            //Stores the user input from the first EditText into a variable
            numberSheep = Integer.parseInt(numSheepInput.getText().toString());
            acreAmount =  Math.round(numberSheep * 1.15);
           // acreAmount = (acreAmount + 500) / 1000 * 1000;

            //Sets the text of the TextView
            question1Answer.setText(String.valueOf("For " + numberSheep + " sheep you will need " + acreAmount + " acres of land to have adequate living conditions for them"));

        });
        //When the second submit button is clicked this method will run
        question2Btn.setOnClickListener(view -> {
            //Stores the user input from the second EditText into a variable
            heptavacDose = Integer.parseInt(sheepWeightInput.getText().toString());
            //Setting the TextView question2Answer to certain values depending on the user's entry into sheepWeightInput EditText
            if(heptavacDose >= 0 && heptavacDose <= 9) {
                question2Answer.setText(String.valueOf("A " + sheepWeightInput.getText().toString() + " kg sheep is too light to recieve Heptavac P Plus Vaccine"));
            }
            else if(heptavacDose >= 10 && heptavacDose <= 20){
                question2Answer.setText(String.valueOf("Your sheep requires a 1ml dose of Heptavac"));
            }
            else if(heptavacDose >= 21 && heptavacDose <= 40){
                question2Answer.setText(String.valueOf("Your sheep requires a 2ml dose of Heptavac"));
            }
            else if(heptavacDose >= 41 && heptavacDose <= 60){
                question2Answer.setText(String.valueOf("Your sheep requires a 3ml dose of Heptavac"));
            }
            else if(heptavacDose > 60){
                question2Answer.setText(String.valueOf("Your sheep requires a 4ml dose of Heptavac"));
            }
            /*Trying to stop the app crashing when you don't enter a value into the EditText but it did not work*/
            else if(sheepWeightInput.getText().equals(null) || sheepWeightInput.getText().equals("")) {
                question2Answer.setText(String.valueOf("Enter a valid weight"));
            }
            else{
                question2Answer.setText("Enter a valid weight");
            }


        });


    }

/*
    private void showToast(String text){
        Toast.makeText(CalculatorActivity.this, text, Toast.LENGTH_SHORT).show();
    } */
}