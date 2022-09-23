package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plusz;
    private TextView szamlalo;
    private Button minusz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(szamlalo.getText().toString()) + 1;
                szamlalo.setText(String.valueOf(szam));
            }
        });

        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam = Integer.parseInt(szamlalo.getText().toString()) - 1;
                szamlalo.setText(String.valueOf(szam));
            }
        });

        szamlalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo.setText("0");
            }
        });
    }


    private void init(){
        plusz = findViewById(R.id.plusz);
        szamlalo = findViewById(R.id.szamlalo);
        minusz = findViewById(R.id.minusz);
    }
}