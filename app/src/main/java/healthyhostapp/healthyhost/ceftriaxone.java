package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 2/9/2017.
 */

public class ceftriaxone extends AppCompatActivity {
    private int RECORDING = R.raw.winters_cold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ceftriaxone);

        AudioPlayer.CreateAudioPlayer(this, R.raw.english_antibio9);
    }
}
