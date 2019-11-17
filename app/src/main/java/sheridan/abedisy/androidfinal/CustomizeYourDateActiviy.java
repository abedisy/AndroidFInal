package sheridan.abedisy.androidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CustomizeYourDateActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_your_date_activiy);

        setTitle("Customize Date");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}

