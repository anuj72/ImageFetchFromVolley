package com.example.anuj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUrl;
    private Button buttonLoad;
    private NetworkImageView imageView;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUrl = (EditText) findViewById(R.id.editTextUrl);
        buttonLoad = (Button) findViewById(R.id.buttonLoad);
        imageView = (NetworkImageView) findViewById(R.id.imageView);

       loadImage();
    }

    private void loadImage(){
        String url = "https://nepal.qualitykg.com/edup/ev-assets/uploads/activityImages/1534794686_1534794683791.jpg";


        imageLoader = CustomVolleyRequest.getInstance(this.getApplicationContext())
                .getImageLoader();
        imageLoader.get(url, ImageLoader.getImageListener(imageView,
                R.drawable.ic_launcher_background, android.R.drawable
                        .ic_dialog_alert));
        imageView.setImageUrl(url, imageLoader);
    }


}
