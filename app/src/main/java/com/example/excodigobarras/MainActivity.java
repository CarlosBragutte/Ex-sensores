package com.example.excodigobarras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btLer;
TextView txCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lerCodigo();


    }
    private void lerCodigo(){
        btLer=(Button)findViewById(R.id.btnLerCodigo);
        txCodigo=(TextView)findViewById(R.id.txtCodigo);
        btLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action: "com.google.zxing.client.andorid.SCANy");
                startActivityForResult(intent, );
            }
        });

    }
    public void
}
