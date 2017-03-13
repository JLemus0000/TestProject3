package firebasetest.brio.adolfo1295.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;

/**
 * Created by adolfo1295 on 13/03/17.
 */

public class ActivityC extends AppCompatActivity {

    @BindView(R.id.btnMasterC)
    Button btnMasterC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        //Activity created on branch-c
        setActions();

    }

    private void setActions(){
        btnMasterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                methodOnC("Hi C");
            }
        });
    }

    private void methodOnC(String messageC){
        Toast.makeText(getApplicationContext(), messageC, Toast.LENGTH_SHORT).show();
    }
}
