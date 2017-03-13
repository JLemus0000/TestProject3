package firebasetest.brio.adolfo1295.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    Button btnPause;
    Button btnBranchC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.btnStart);
        btnPause = (Button)findViewById(R.id.btnNew);
        btnBranchC = (Button)findViewById(R.id.btnBranchC);
        setActions();

    }

    private void setActions(){
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSomething("Message");
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSomething("New Message");
                newMethod();
            }
        });

        btnBranchC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newMethod();
            }
        });
    }


    private void sendSomething (String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void newMethod(){
        Toast.makeText(getApplicationContext(), "New Method", Toast.LENGTH_SHORT).show();
    }

    private void methodB(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
