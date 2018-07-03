package info.rxandroid.base;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    protected static final String TAG = "JKS";
    protected BaseActivity activity = BaseActivity.this;

    protected void launchIntent(Class<? extends Activity> cls) {
        Intent intent = new Intent(activity, cls);
        startActivity(intent);
    }

}
