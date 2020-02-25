package com.putrasamawa.dicodingmade1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.putrasamawa.dicodingmade1.Item.Item;

//* Satria Junanda *//

public class DetailActivity extends AppCompatActivity {
    private ImageView baner,img;
    private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();
        Intent intent = getIntent();
        Item exampleItem = intent.getParcelableExtra("Example Item");

        int imageRes = exampleItem.getImageResource();
        String line1 = exampleItem.getText1();
        String line2 = exampleItem.getText2();

        img = findViewById(R.id.image_activity2);
//        baner = findViewById(R.id.baner);
        textView1 = findViewById(R.id.text1_activity2);
        textView2 = findViewById(R.id.text2_activity2);

        img.setImageResource(imageRes);
//        baner.setImageResource(imageRes);
        textView1.setText(line1);
        textView2.setText(line2);
    }

    public void exit(View view) {
        finish();
    }

    public void fav(View view) {
        Toast.makeText(DetailActivity.this,"Berhasil ditambahkan ke favorit!",Toast.LENGTH_SHORT).show();
    }
}

//* Satria Junanda *//