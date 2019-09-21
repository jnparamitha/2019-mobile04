package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            String username = extras.getString(ParcelableActivity.USERNAME_KEY);
            String name = extras.getString(ParcelableActivity.NAME_KEY);
            String age = extras.getString(ParcelableActivity.AGE_KEY);

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(age);
        }
    }
}
