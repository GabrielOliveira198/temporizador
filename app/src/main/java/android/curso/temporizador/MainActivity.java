package android.curso.temporizador;

import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean execucao = false;
    private int segundo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.TemporizadorGA);

        final Button btnStart = findViewById(R.id.btnStart);
        Button btnStop = findViewById(R.id.btnStop);
        Button btnRestart = findViewById(R.id.btnRestart);
        final Handler handler = new Handler();
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final EditText ediTempo = (EditText) findViewById(R.id.editTempo);
        ediTempo.getText().toString();
        final int num = Integer.parseInt(String.valueOf(ediTempo));

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hours = segundo / 3600;
                int minutes = (segundo % 3600) / 60;
                int secs = segundo % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);

                timeView.setText(time);
                if (execucao) {
                    segundo--;
                }

            }
        });
    }
}


