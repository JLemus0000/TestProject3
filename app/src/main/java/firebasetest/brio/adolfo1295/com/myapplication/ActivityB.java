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

public class ActivityB extends AppCompatActivity {

    @BindView(R.id.btnMasterB)
    Button masterB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

       //Activity created n branch-b
        setActions();
    }

    private void setActions(){
        masterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                methodOnB("Hi B");
            }
        });
    }


    private void methodOnB(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
