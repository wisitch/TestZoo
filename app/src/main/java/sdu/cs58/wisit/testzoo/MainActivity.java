package sdu.cs58.wisit.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }






    public void clickMap(View view) {
        String lat = "13.216298";
        String lng = "101.056642";
        String label = "สวนสัตว์เปิดเขาเขียว";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.apps.maps"); //ใช้รันจริงบนเเอนดรอย
        startActivity(mapIntent);




    }



    public void clickMobile(View view) {
        Intent MoblieIntent = new Intent(Intent.ACTION_DIAL);
        MoblieIntent.setData(Uri.parse("tel:0993482613"));
        startActivity(MoblieIntent);
    }


    public void Playsound1(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();

        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.horse);
        mediaPlayer.start();
    }

    public void Playsound2(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();

        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.elephant);
        mediaPlayer.start();
    }

    public void Playsound3(View view) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();

        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lion);
        mediaPlayer.start();

    }
}
