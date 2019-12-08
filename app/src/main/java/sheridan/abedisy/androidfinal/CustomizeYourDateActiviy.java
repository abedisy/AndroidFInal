package sheridan.abedisy.androidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class CustomizeYourDateActiviy extends AppCompatActivity {

    Spinner spinnerRelationshipStage;
    Spinner spinnerResturantPreferance;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    RadioGroup radioGroup;
    RadioButton radioButton;


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_your_date_activiy);

        setTitle("Customize Date");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        spinnerRelationshipStage = findViewById(R.id.spinnerRelationShipStage);
        final ArrayAdapter<CharSequence> adapterRelationshipStage = ArrayAdapter.createFromResource(this, R.array.relationshipStageSpinner, android.R.layout.simple_spinner_item);
        adapterRelationshipStage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRelationshipStage.setAdapter(adapterRelationshipStage);


       spinnerResturantPreferance = findViewById(R.id.spinnerResturantPreferance);
        final ArrayAdapter<CharSequence> adapterResturant = ArrayAdapter.createFromResource(this, R.array.resturantSpinner, android.R.layout.simple_spinner_item);
        adapterResturant.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerResturantPreferance.setAdapter(adapterResturant);

        checkBox1 = findViewById(R.id.checkBoxOne);
        checkBox2 = findViewById(R.id.checkBoxTwo);
        checkBox3 = findViewById(R.id.checkBoxThree);


        radioGroup = findViewById(R.id.radioGroupSpecialOccation);









        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomething();

            }
        });



    }
    public void doSomething(){
       String ResturantResult = spinnerResturantPreferance.getSelectedItem().toString();
       String RelationshipResult = spinnerRelationshipStage.getSelectedItem().toString();
       boolean check1 = checkBox1.isChecked();
       boolean check2 = checkBox2.isChecked();
       boolean check3 = checkBox3.isChecked();

       int id = radioGroup.getCheckedRadioButtonId();
       radioButton = radioGroup.findViewById(id);
       String radioResult = radioButton.getText().toString();



//Meditranian
       if( (RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mediterranean")&&check1 && (radioResult.equals("Yes")||radioResult.equals("No"))) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message1","message1");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mediterranean")&&check3 && (radioResult.equals("Yes")||radioResult.equals("No"))){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shawema Royal", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message2","message2");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mediterranean")&&check2 &&  (radioResult.equals("Yes")||radioResult.equals("No")) ) {
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message3", "message3");
           startActivity(intent);
       }



//Asian
        else if( (RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Asian")&&check1 && (radioResult.equals("Yes")||radioResult.equals("No"))) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
            intent.putExtra("message4","message4");
            startActivity(intent);

        }

        else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Asian")&&check3 && (radioResult.equals("Yes")||radioResult.equals("No"))){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shawema Royal", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
            intent.putExtra("message5","message5");
            startActivity(intent);

        }

        else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Asian")&&check2 &&  (radioResult.equals("Yes")||radioResult.equals("No")) ) {
            Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
            intent.putExtra("message6", "message6");
            startActivity(intent);
        }


        //Italian
       else if( (RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Italian")&&check1 && (radioResult.equals("Yes")||radioResult.equals("No"))) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message7","message7");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Italian")&&check3 && (radioResult.equals("Yes")||radioResult.equals("No"))){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shitalawema Royal", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message8","message8");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Italian")&&check2 &&  (radioResult.equals("Yes")||radioResult.equals("No")) ) {
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message9", "message9");
           startActivity(intent);
       }
//Indian
       else if( (RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Indian")&&check1 && (radioResult.equals("Yes")||radioResult.equals("No"))) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message10","message10");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Indian")&&check3 && (radioResult.equals("Yes")||radioResult.equals("No"))){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shawema Royal", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message11","message11");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Indian")&&check2 &&  (radioResult.equals("Yes")||radioResult.equals("No")) ) {
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message12", "message12");
           startActivity(intent);
       }

 //Mexican
       else if( (RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mexican")&&check1 && (radioResult.equals("Yes")||radioResult.equals("No"))) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message13","message13");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mexican")&&check3 && (radioResult.equals("Yes")||radioResult.equals("No"))){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shawema Royal", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message14","message14");
           startActivity(intent);

       }

       else if((RelationshipResult.equals("Beginner")||RelationshipResult.equals("Intermediate")||RelationshipResult.equals("Advanced")||RelationshipResult.equals("Married"))&&ResturantResult.equals("Mexican")&&check2 &&  (radioResult.equals("Yes")||radioResult.equals("No")) ) {
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message15", "message15");
           startActivity(intent);
       }

       else{
           Toast.makeText(CustomizeYourDateActiviy.this, "Please Select valid fields", Toast.LENGTH_SHORT).show();


       }








    }



}

