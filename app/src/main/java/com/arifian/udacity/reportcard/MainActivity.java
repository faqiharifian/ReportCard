package com.arifian.udacity.reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.arifian.udacity.reportcard.entities.ReportCard;
import com.arifian.udacity.reportcard.entities.Student;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] scores = getResources().getStringArray(R.array.scores);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, scores);
        MaterialBetterSpinner scoreSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_score);
        scoreSpinner.setAdapter(adapter);
    }

    public void submit(View view){
        TextView studentNimTextView = (TextView) findViewById(R.id.text_student_nim);
        TextView studentNameTextView = (TextView) findViewById(R.id.text_student_name);
        Student student = new Student(studentNimTextView.getText().toString(), studentNameTextView.getText().toString());

        TextView courseCodeTextView = (TextView) findViewById(R.id.text_course_code);
        TextView courseNameTextView = (TextView) findViewById(R.id.text_course_name);
        TextView courseSksTextView = (TextView) findViewById(R.id.text_course_sks);
        ReportCard reportCard = new ReportCard(courseCodeTextView.getText().toString(), courseNameTextView.getText().toString(), Integer.valueOf(courseSksTextView.getText().toString()));

        MaterialBetterSpinner scoreSpinner = (MaterialBetterSpinner) findViewById(R.id.spinner_score);
        reportCard.setScore(scoreSpinner.getText().toString());

        Intent intent = new Intent(this, ReportActivity.class);
        intent.putExtra(ReportActivity.KEY_STUDENT, student);
        intent.putExtra(ReportActivity.KEY_REPORT, reportCard);
        startActivity(intent);
    }
}
