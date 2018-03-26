package e.vcu.quizly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Max Vandenesse on 3/26/2018.
 */

public class TeacherManageLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_manage_layout);
    }

    //Back To homepage
    public void clickBackToHomepage(View v) {
        if (v.getId() == R.id.teacherLogout) {
            Intent i = new Intent(TeacherManageLayout.this, TeacherHomepage.class);
            startActivity(i);
        }
    }
}