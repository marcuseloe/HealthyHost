package healthyhostapp.healthyhost;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 2/14/2017.
 */

public class rsv extends AppCompatActivity {

    static private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsv);
        AudioPlayer.CreateAudioPlayer(this, R.raw.english_rsv);

    }
}

