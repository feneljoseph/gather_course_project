package cop_4331c.gather;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;
import android.content.Intent;

public class DispatchActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "r0AWTV2rHQu1LKLuvghS5dxgw32hKeBWDnVmyxNQ", "THis9813mCk50ooetnDlY9wIkAcYDkBn10IE5u2a");

        //Check if application is signed in
        if (ParseUser.getCurrentUser() != null) {
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, WelcomeActivity.class));
        }
    }
}
