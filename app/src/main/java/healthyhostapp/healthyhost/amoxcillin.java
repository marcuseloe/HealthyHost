package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 2/6/2017.
 */

public class amoxcillin extends AppCompatActivity {
    private int RECORDING = R.raw.moonlight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amoxcillin);

        AudioPlayer.CreateAudioPlayer(this, R.raw.english_antibio2);

    }
}
