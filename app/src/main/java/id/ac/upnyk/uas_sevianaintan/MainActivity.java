package id.ac.upnyk.uas_sevianaintan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button next;
    EditText nama, nim, tempat, tanggal, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        tempat = findViewById(R.id.tempat);
        tanggal = findViewById(R.id.tanggal);
        alamat = findViewById(R.id.alamat);
    }

    public void next(View view) {

        Intent intent = new Intent(MainActivity.this, Next_Page.class);
        intent.putExtra("Nama", nama.getText().toString());
        intent.putExtra("NIM", nim.getText().toString());
        intent.putExtra("Tempat", alamat.getText().toString());
        intent.putExtra("Tanggal", tanggal.getText().toString());
        intent.putExtra("Alamat", alamat.getText().toString());
        startActivity(intent);

    }
}