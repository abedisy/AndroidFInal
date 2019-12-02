package sheridan.abedisy.androidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultResturantActivity extends AppCompatActivity {

    TextView resturantName;
    TextView resturantAddress;
    TextView resturantNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_resturant);

        resturantName = findViewById(R.id.resturantName);
        resturantAddress = findViewById(R.id.resturantAddress);
        resturantNumber = findViewById(R.id.resturantNumber);




        if(getIntent().hasExtra("message1")){
            resturantName.setText("Shawerma -XX");
            resturantAddress.setText("2555 thee st");
            resturantNumber.setText("905  607 9078");

        }else if(getIntent().hasExtra("message2")){
            resturantName.setText("Shawerma Royale");
            resturantAddress.setText("2555 thee st");
            resturantNumber.setText("905  607 9078");

        }else if(getIntent().hasExtra("message3")){
            resturantName.setText("East Side Marios");
            resturantAddress.setText("2555 thee st");
            resturantNumber.setText("905  607 9078");
        }



    }
}
