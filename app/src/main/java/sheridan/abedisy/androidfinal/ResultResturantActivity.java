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



//Meditranian
        if(getIntent().hasExtra("message1")){
            resturantName.setText("Shawarma X");
            resturantAddress.setText("483 Dundas St W Unit no 2, Oakville, ON L6M 4M2");
            resturantNumber.setText("(905) 257-7222");

        }else if(getIntent().hasExtra("message2")){
            resturantName.setText("Shawerma Royale");
            resturantAddress.setText("6039 Erin Mills Pkwy, Mississauga, ON L5N 0G5");
            resturantNumber.setText("(905) 826-4949");

        }else if(getIntent().hasExtra("message3")){
            resturantName.setText("Shawarma Box");
            resturantAddress.setText("251 Queen St S, Mississauga, ON L5M 1L7");
            resturantNumber.setText("(905) 826-6021");

        }
        //Asian
        else if(getIntent().hasExtra("message4")){
            resturantName.setText("Wok of Fame");
            resturantAddress.setText("7700 Hurontario St #602, Brampton, ON L6Y 4M3");
            resturantNumber.setText("(905) 230-1318");
        }
        else if(getIntent().hasExtra("message5")){
        resturantName.setText("Thai House Cuisine 2");
        resturantAddress.setText("261 Lakeshore Rd E, Mississauga, ON L5G 1G8");
        resturantNumber.setText("(905) 502-8000");
        }
        else if(getIntent().hasExtra("message6")){
            resturantName.setText("King Asian");
            resturantAddress.setText(" 2500 Hurontario St, Mississauga, ON L5B 1N4");
            resturantNumber.setText("(905) 542-9888");
        }

        //Italian
        else if(getIntent().hasExtra("message7")){
            resturantName.setText("Ritorno");
            resturantAddress.setText("261 Oak Walk Dr Unit #8, Oakville, ON L6H 6M3");
            resturantNumber.setText("(905) 257-5881");
        }
        else if(getIntent().hasExtra("message8")){
            resturantName.setText("Trattoria Timone");
            resturantAddress.setText("2091 Winston Park Dr, Oakville, ON L6H 6P5");
            resturantNumber.setText("(905) 842-2906");
        }
        else if(getIntent().hasExtra("message9")){
            resturantName.setText("Thyme Ristorante");
            resturantAddress.setText("347 Lakeshore Rd E, Mississauga, ON L5G 1H6");
            resturantNumber.setText("(905) 338-5233");
        }
//Indian
        else if(getIntent().hasExtra("message10")){
            resturantName.setText("Coriander Green");
            resturantAddress.setText("342 Church St, Oakville, ON L6J 1P1");
            resturantNumber.setText("(905) 338-2540");
        }
        else if(getIntent().hasExtra("message11")){
            resturantName.setText("Hyderabad House Biryani Place");
            resturantAddress.setText("8015 Financial Dr b8, Brampton, ON L6Y 6A1");
            resturantNumber.setText("(905) 457-9999");
        }
        else if(getIntent().hasExtra("message12")){
            resturantName.setText("TYC by Sanjeev Kapoor");
            resturantAddress.setText("111 Trafalgar Rd, Oakville, ON L6J 3G3");
            resturantNumber.setText("(905) 842-8926");
        }
 //Mexican
        else if(getIntent().hasExtra("message13")){
            resturantName.setText("The Habanero Taqueria");
            resturantAddress.setText("1289 Marlborough Ct, Oakville, ON L6H 2S2");
            resturantNumber.setText("(289) 837-0111");
        }
        else if(getIntent().hasExtra("message14")){
            resturantName.setText("El Jefe");
            resturantAddress.setText("66 Lakeshore Rd E, Mississauga, ON L5G 1E1");
            resturantNumber.setText("(905) 815-8444");
        }
        else if(getIntent().hasExtra("message15")){
            resturantName.setText("Mad Mexican");
            resturantAddress.setText("405 Jane St, Toronto, ON M6S 3Z6");
            resturantNumber.setText("(905) 916-2712");
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
        Toast.makeText(ResultResturantActivity.this, "Trouble searching? Just delete one letter from the restaurant name and type it again. Redirecting ..",
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
