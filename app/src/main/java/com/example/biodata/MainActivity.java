package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntelp,btnemail,btnalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntelp = findViewById(R.id.telepon);
        btnemail = findViewById(R.id.email);
        btnalamat = findViewById(R.id.alamat);

        btntelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "081239928308";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel",nomor,null));
                startActivity(memanggil);
            }
        });

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:"
                        + "vedo.priyantoro@gmail.com"
                        + "?subject=" + "Feedback" + "&body=" + "");
                intent.setData(data);
                startActivity(intent);
            }
        });

        btnalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=kumudasmoro tengah no 7");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}

