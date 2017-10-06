package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanishCommonAntibiotics extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanishcommonantibiotics);

        Button spanlevaquin = (Button) findViewById(R.id.spanlevaquin);
        spanlevaquin.setOnClickListener(this);

        Button spandoxy = (Button) findViewById(R.id.spandoxy);
        spandoxy.setOnClickListener(this);

        Button spanamoxcillin = (Button) findViewById(R.id.spanamoxcillin);
        spanamoxcillin.setOnClickListener(this);

        Button spanazythromycin = (Button) findViewById(R.id.spanazithromycin);
        spanazythromycin.setOnClickListener(this);

        Button spanmetronidazole = (Button) findViewById(R.id.spanmetronidazole);
        spanmetronidazole.setOnClickListener(this);

        Button spanerythomycin = (Button) findViewById(R.id.spanerythromycin);
        spanerythomycin.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanlevaquin:
                Intent intent = new Intent(spanishCommonAntibiotics.this, spanlevaquin.class);
                startActivity(intent);
                break;

            case R.id.spandoxy:
                Intent intent1 = new Intent(spanishCommonAntibiotics.this, spandoxy.class);
                startActivity(intent1);
                break;

            case R.id.spanamoxcillin:
                Intent intent2 = new Intent(spanishCommonAntibiotics.this, spanamoxcillin.class);
                startActivity(intent2);
                break;

            case R.id.spanazithromycin:
                Intent intent3 = new Intent(spanishCommonAntibiotics.this, spanazythromycin.class);
                startActivity(intent3);
                break;

            case R.id.spanmetronidazole:
                Intent intent4 = new Intent(spanishCommonAntibiotics.this, spanmetronidazole.class);
                startActivity(intent4);
                break;

            case R.id.spanerythromycin:
                Intent intent5 = new Intent(spanishCommonAntibiotics.this, spanerythomycin.class);
                startActivity(intent5);
                break;

        }
    }
}