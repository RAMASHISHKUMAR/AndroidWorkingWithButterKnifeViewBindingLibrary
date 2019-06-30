package com.example.androidworkingwithbutterknifeviewbindinglibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lbl_title)
    TextView lblTitle;
    @BindView(R.id.input_name)
    EditText inputName;
    @BindView(R.id.btn_enter)
    Button btnEnter;

   /* @BindString(R.string.title_string )
    String title; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // using butterknif
        ButterKnife.bind(this);

       /*lblTitle.setText("title");
        lblTitle.setText(this is the title);
        inputName.setText("this is the subtitle");
        btnEnter.setText("enter String");*/
    }

    @OnClick(R.id.btn_enter)
    public void onViewClicked() {
        Toast.makeText(this, "You have entered"+ inputName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
