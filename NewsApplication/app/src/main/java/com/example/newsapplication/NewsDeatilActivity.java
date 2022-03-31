package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDeatilActivity extends AppCompatActivity {


    String title,desc,content,imageURL,url;
    private TextView titleTV,subDescTV,contentTV;
    private ImageView newsIV;
    private Button readNEwsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_deatil);
        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageURL = getIntent().getStringExtra("imgURL");
        url = getIntent().getStringExtra("url");
        titleTV = findViewByID(R.idTVTitle);
        subDescTV = findViewByID(R.idTVSubDesc);
        contentTV = findViewByID(R.idTVContent);
        newsIV = findViewByID(R.idIVNews);
        readNewsBtn = findViewById(R.id.idBtnReadNews);
        titleTV.setText(title);
        subDescTV.setText(desc);
        contentTV.setText(content);
        Picasso.get().load(imageURL).into(NewsIV);
        readNewsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onclick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        })


    }
}