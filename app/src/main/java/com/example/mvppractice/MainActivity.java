package com.example.mvppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MVPMain.view{
        Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Presenter presenter = new Presenter(this);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clicked();
            }
        });
    }

    @Override
    public void show() {
        Toast.makeText(this, "Presenter가 데이터 가져와서 뿌려주라고 했어!", Toast.LENGTH_SHORT).show();
    }
}
