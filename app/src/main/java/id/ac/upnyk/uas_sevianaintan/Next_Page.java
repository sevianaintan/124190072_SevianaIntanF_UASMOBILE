package id.ac.upnyk.uas_sevianaintan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Next_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next__page);

        Intent data = getIntent();

        String nama = getIntent().getStringExtra("Nama");
        String nim = getIntent().getStringExtra("NIM");
        String tempat = getIntent().getStringExtra("Tempat");
        String tanggal = getIntent().getStringExtra("Tanggal");
        String alamat = getIntent().getStringExtra("Alamat");

        TextView mTVdata = findViewById(R.id.TVdata);

        String texthasil = "Nama saya "+nama+ "\ndengan nim " +nim+ "\nsaya lahir di "+tempat+" pada tanggal "+tanggal+"\n saat ini saya tinggal di "+alamat;

        mTVdata.setText(texthasil);
    }
}