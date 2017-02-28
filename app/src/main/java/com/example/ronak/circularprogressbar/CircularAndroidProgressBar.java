

// Android Circular ProgressBar with Source Code and Screenshot
package com.example.ronak.circularprogressbar;
        import android.animation.ObjectAnimator;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.animation.DecelerateInterpolator;
        import android.widget.ProgressBar;

public class CircularAndroidProgressBar extends AppCompatActivity {

    ProgressBar mprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circular_android_progress_bar);

        mprogressBar = (ProgressBar) findViewById(R.id.circular_progress_bar);
        ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
        anim.setDuration(15000);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();
    }
}