package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        RatingBar RateBarFeedbackQ1 = findViewById(R.id.RBFeedbackQ1);
        RatingBar RateBarFeedbackQ2 = findViewById(R.id.RBFeedbackQ2);
        RatingBar RateBarFeedbackQ3 = findViewById(R.id.RBFeedbackQ3);
        Button BtnFeedback = findViewById(R.id.BtnSubmit);
        EditText ETFeedback = findViewById(R.id.ETFeedback);

        RateBarFeedbackQ1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String message = "You have rated" + rating;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        RateBarFeedbackQ2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String message = "You have rated" + rating;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        RateBarFeedbackQ3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String message = "You have rated" + rating;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        BtnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Thank you for your feedback!";
                if(!ETFeedback.getText().toString().isEmpty())
                    message = message + "\nPlease enjoy your 50 PandaPoints!";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
