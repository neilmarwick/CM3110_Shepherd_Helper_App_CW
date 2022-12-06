package rgu.ac.uk.cm3110app20047522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class RecyclerViewActivity extends AppCompatActivity {
    //This video helped me write the code for the RecyclerView https://youtu.be/Mc0XT58A1Z4


    //ArrayList which will hold all the models (the thing that you see when you click on each item in the RecyclerView)
    // and be sent to the RecyclerView Adaptor
    ArrayList<SheepModel> sheepModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Objects.requireNonNull(getSupportActionBar()).setTitle("My Sheep"); //setting title of the app
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //back button for going back to previous activity

        RecyclerView recyclerView = findViewById(R.id.sheepRecyclerView);
        setUpSheepModels();
        Sheep_RecyclerViewAdapter adapter = new Sheep_RecyclerViewAdapter(this, sheepModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpSheepModels(){
        //creating all the model classes for each of the items in the RecyclerView
        //acquiring all the string arrays in the strings.xml file
        String[] sheepTagNumbers = getResources().getStringArray(R.array.sheep_tag_number_txt);
        String[] sheepBreeds = getResources().getStringArray(R.array.sheep_breed_txt);
        String[] sheepGenders = getResources().getStringArray(R.array.sheep_gender_txt);

        for(int i = 0; i < 9; i++){
            sheepModels.add(new SheepModel(sheepTagNumbers[i], sheepBreeds[i], sheepGenders[i]));
        }

    }
}