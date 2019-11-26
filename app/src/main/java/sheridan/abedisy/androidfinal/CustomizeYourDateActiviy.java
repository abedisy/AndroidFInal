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




       if(RelationshipResult.equals("Beginner")&&ResturantResult.equals("Medetaranian")&&check1 && radioResult.equals("No")) {
//           Toast.makeText(CustomizeYourDateActiviy.this, "shawerma-x", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message1",1);
           startActivity(intent);

       }

       else if(RelationshipResult.equals("Beginner")&&ResturantResult.equals("Medetaranian")&&check3 && radioResult.equals("No")){
//           Toast.makeText(CustomizeYourDateActiviy.this, "Shawema Royal", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(CustomizeYourDateActiviy.this, ResultResturantActivity.class);
           intent.putExtra("message2",2);
           startActivity(intent);

       }

       else if (RelationshipResult.equals("Advanced")&&ResturantResult.equals("italian")){
           Toast.makeText(CustomizeYourDateActiviy.this, "east side marios", Toast.LENGTH_SHORT).show();

       }


       else{
           Toast.makeText(CustomizeYourDateActiviy.this, "no no no", Toast.LENGTH_SHORT).show();


       }








    }



}

