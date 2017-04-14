package com.arifian.udacity.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.arifian.udacity.reportcard.entities.ReportCard;
import com.arifian.udacity.reportcard.entities.Student;

public class ReportActivity extends AppCompatActivity {
    public static final String KEY_STUDENT = "student";
    public static final String KEY_REPORT = "report";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Bundle args = getIntent().getExtras();
        Student student = (Student) args.getSerializable(KEY_STUDENT);
        ReportCard report = (ReportCard) args.getSerializable(KEY_REPORT);

        ((TextView) findViewById(R.id.text_student_nim)).setText(student.getNim());
        ((TextView) findViewById(R.id.text_student_name)).setText(student.getName());

        ((TextView) findViewById(R.id.text_course_code)).setText(report.getCode());
        ((TextView) findViewById(R.id.text_course_name)).setText(report.getCourseName());
        ((TextView) findViewById(R.id.text_course_sks)).setText("("+report.getSks()+" sks)");
        ((TextView) findViewById(R.id.text_score)).setText(report.getScore().toUpperCase());
        ((TextView) findViewById(R.id.text_total_score)).setText(String.valueOf(report.getTotalScore()));
    }
}
