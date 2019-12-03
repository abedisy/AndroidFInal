package sheridan.abedisy.androidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultResturantActivity extends AppCompatActivity {

    TextView resturantName;
    TextView resturantAddress;
    TextView resturantNumber;
    Button btnLocate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_resturant);

        setTitle("Resturant Recommendation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resturantName = findViewById(R.id.resturantName);
        resturantAddress = findViewById(R.id.resturantAddress);
        resturantNumber = findViewById(R.id.resturantNumber);




        if(getIntent().hasExtra("message1")){
            resturantName.setText("Shawerma x");
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



        btnLocate = findViewById(R.id.btnLocate);
        btnLocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLocate();
            }
        });

    }

    public void goToLocate(){
        Toast.makeText(ResultResturantActivity.this, "Trouble seaching? Just delete one letter from resturant name and type it again",
                Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(ResultResturantActivity.this, FindResturantActivity.class);
                String key = resturantName.getText().toString();
                intent.putExtra("key", key);
                startActivity(intent);
            }
        }, 4000);
    }
}
