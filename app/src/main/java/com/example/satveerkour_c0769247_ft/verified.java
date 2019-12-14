package com.example.satveerkour_c0769247_ft;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class verified extends AppCompatActivity {
    CheckBox checkBox;
    Button button;
    TextView textView;
    ImageView refresh;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ArrayList<Integer> verified = new ArrayList<Integer>();
    ArrayList<Integer> notverified = new ArrayList<Integer>();
    ArrayList<String>Storedetail = new ArrayList<String>();

    int verifiedbox;
    int notverifiedbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verified);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.verifyButton);
        textView = findViewById(R.id.text_view);
        refresh = findViewById(R.id.refreshImage);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);

        verifiedbox = verified.size();
        notverifiedbox = notverified.size();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!checkBox.isChecked()){
                    Toast.makeText(verified.this,"check the checkbox",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(verified.this,"unchecked the checkbox",Toast.LENGTH_LONG).show();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (verified.size() < 4  || !checkBox.isChecked() || !notverified.isEmpty()){
                    new AlertDialog.Builder(verified.this).setTitle("Not verify").setPositiveButton("ok",new DialogInterface.OnClickListener(){
                        public void  onClick(DialogInterface dialog, int which){

                        }
                    }).show();
                    Toast.makeText(verified.this,"not verified" + verifiedbox + "and" + notverifiedbox,Toast.LENGTH_LONG).show();
                } else if (verified.size() == 4 && notverified.isEmpty() && checkBox.isChecked()){
                    new AlertDialog.Builder(verified.this).setTitle("verified").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = getIntent();
                            String nametext = intent.getExtras().getString("name");
                            String emailtext = intent.getExtras().getString("email");
                            String phonetext = intent.getExtras().getString("phone");
                            Storedetail.add(nametext);
                            Storedetail.add(emailtext);
                            Storedetail.add(phonetext);
                            Intent i = new Intent(verified.this,MainActivity.class);
                            startActivity(i);
                        }
                    }).show();
                    Toast.makeText(verified.this,"verified",Toast.LENGTH_LONG).show();
                }
                // openDialog();
                Intent intent = new Intent(verified.this,MainActivity.class);
                startActivity(intent);
            }



        });
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.img1);
                imageView2.setImageResource(R.drawable.img2);
                imageView3.setImageResource(R.drawable.img3);
                imageView4.setImageResource(R.drawable.img4);
                imageView5.setImageResource(R.drawable.img5);
                imageView6.setImageResource(R.drawable.img6);
                imageView7.setImageResource(R.drawable.img7);
                imageView8.setImageResource(R.drawable.img8);
                imageView9.setImageResource(R.drawable.img9);
            }
        });
    }

    public void imageViewSource(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img1);
        imageView.animate().alpha(0.5f);
        verified.add(1);

    }

    public void imageViewSource1(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img2);
        imageView.animate().alpha(0.5f);
        verified.add(2);
    }

    public void imageViewSource2(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img3);
        imageView.animate().alpha(0.5f);
        verified.add(3);
    }

    public void imageViewSource3(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img4);
        imageView.animate().alpha(0.5f);
        verified.add(4);
    }

    public void imageViewSource4(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img5);
        imageView.animate().alpha(0.5f);
        notverified.add(1);
    }

    public void imageViewSource5(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img6);
        imageView.animate().alpha(0.5f);
        notverified.add(2);
    }

    public void imageViewSource6(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img7);
        imageView.animate().alpha(0.5f);
        notverified.add(3);
    }

    public void imageViewSource7(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img8);
        imageView.animate().alpha(0.5f);
        notverified.add(4);
    }

    public void imageViewSource8(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img9);
        imageView.animate().alpha(0.5f);
        notverified.add(5);
    }
}
