package sg.edu.rp.webservices.p12_mydatabook;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutUs extends AppCompatActivity {

    ActionBar ab;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);


        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        iv = (ImageView)findViewById(R.id.aboutUSIV);

        Picasso.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg")
                .placeholder(R.drawable.ajax_loader)
                .error(R.drawable.error)
                .into(iv);


//        Picasso.with(this)
//                .load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg")
//                .placeholder(R.drawable.ajax_loader)
//                .into(iv, new com.squareup.picasso.Callback() {
//                    @Override
//                    public void onSuccess() {
//
//                    }
//
//                    @Override
//                    public void onError() {
//                        iv.setImageResource(R.drawable.error);
//                    }
//
//                });

    }
}
