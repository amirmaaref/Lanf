package com.amirmaaref313.lanf_e.PatientActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amirmaaref313.lanf_e.Exersices.ExersicesListActivity;
import com.amirmaaref313.lanf_e.PatientCondotion.PatientConditionActivity;
import com.amirmaaref313.lanf_e.R;

public class PatientActivity extends AppCompatActivity implements PatientActivityMethods{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
    }

    @Override
    public void PatientCondition(View view) {
        startActivity(new Intent(this , PatientConditionActivity.class));
    }

    @Override
    public void Exersices(View view) {
        startActivity(new Intent(this , ExersicesListActivity.class));
    }

    @Override
    public void Messeging(View view) {

    }

    @Override
    public void InSpringStories(View view) {

    }
}
