package chrisAndcompanies.reimburseme25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrationAct extends AppCompatActivity {
 private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        button2 =(Button) findViewById(R.id.submitclam);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPending();
            }
        });
    }
    public void openPending(){
        Intent intent = new Intent(this, pendingAct.class);
        startActivity(intent);
    }
}