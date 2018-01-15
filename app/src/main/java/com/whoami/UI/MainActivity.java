package com.whoami.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.whoami.R;
import com.whoami.helpers.ImageHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.CameraImageButton)    ImageView cameraButton;
    @BindView(R.id.HowToMain) Button howToTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        new ImageHelper(MainActivity.this);

        cameraButton.setOnClickListener(this);
        howToTextView.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.CameraImageButton:
                startActivity(new Intent(MainActivity.this,IdentifyActivity.class));
                break;
            case R.id.HowToMain:
                // TODO Add HowTo Description
                Toast.makeText(getApplicationContext(),"Added soon",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
