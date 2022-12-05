package rgu.ac.uk.cm3110app20047522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartMenuActivity extends AppCompatActivity {
    //This video helped me write the code for the notifications https://www.youtube.com/watch?v=4BuRMScaaI4

    //declaring buttons which open other activities
    Button openCalculatorBtn;
    Button openSheepRecyclerViewBtn;

    //reference to button you click to receive notifications
    Button notificationBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        getSupportActionBar().setTitle("Start screen"); //setting title of the app

        //reference to buttons which will open other activities
        openCalculatorBtn = (Button) findViewById(R.id.openCalculatorBtn);
        openSheepRecyclerViewBtn = (Button) findViewById(R.id.openSheepRecyclerViewBtn);


        //reference to notificationBtn view
        notificationBtn = findViewById(R.id.notificationBtn);

        //method which opens CalculatorActivity when button is pressed using intents
        openCalculatorBtn.setOnClickListener((view) ->{
            startActivity(new Intent(StartMenuActivity.this,CalculatorActivity.class));
        } );

        //method which opens RecyclerViewActivity (list of sheep) when button is pressed using intents
        openSheepRecyclerViewBtn.setOnClickListener((view) ->{
            startActivity(new Intent(StartMenuActivity.this,RecyclerViewActivity.class));
        });




        //code for notification that will run if you are running Android version Oreo or higher
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel("Notification", "Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        //method that runs when you click the receive notifications button
        notificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the code inside this method for creating the notification.
                // builder is a design pattern which allows creation of complex objects step by step

                //the line below is creating a new notification object and specifying the channel the notification will be delivered on
                NotificationCompat.Builder builder = new NotificationCompat.Builder(StartMenuActivity.this, "Notification");
                builder.setContentTitle("Facts about sheep");    //sets title of notification
                builder.setContentText("Sheep have rectangular pupils"); //sets body of the notification message
                builder.setSmallIcon(R.drawable.sheep6); //small image that shows up in notification message, however image doesn't appear, not working
                builder.setAutoCancel(true); //allows us to swipe the notification up to remove it

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(StartMenuActivity.this);
                managerCompat.notify(1,builder.build());
            }
        });
    }
}