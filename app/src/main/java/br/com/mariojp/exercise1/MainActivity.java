package br.com.mariojp.exercise1;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText editNome_main_activity;
    private TextView labelMensagem_main_activity;
    private Button btnCumprimentar_main_activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome_main_activity = findViewById(R.id.editNome);
        btnCumprimentar_main_activity = findViewById(R.id.btnCumprimentar);
        labelMensagem_main_activity = findViewById(R.id.labelMensagem);

        btnCumprimentar_main_activity.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String editNome = editNome_main_activity.getText().toString();
                if(!editNome.isEmpty()){
                    editNome = editNome.substring(0,1).toUpperCase().concat(editNome.substring(1));
                    labelMensagem_main_activity.setText("Alô, "+editNome+"!");
                }
                else{
                    Toast.makeText(MainActivity.this, "O Texto está vazio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}
