package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cb_agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        cb_agree = (CheckBox) findViewById(R.id.checkbox_request);
    }

    public void btn_Next_ClickEvent(View view) {
        int layout_id = view.getId();
        switch (layout_id) {
            case R.id.btn_accept:
                if (cb_agree.isChecked()) {
                    setContentView(R.layout.question_one);
                } else {
                    Toast.makeText(this, "Please accept the aggreements to continue!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_Next_1:
                setContentView(R.layout.question_two);
                break;
            case R.id.btn_Next_2:
                setContentView(R.layout.question_three);
                break;
            case R.id.btn_Next_3:
                setContentView(R.layout.question_four);
                break;
            case R.id.btn_Next_4:
                setContentView(R.layout.question_five);
                break;
            case R.id.btn_Next_5:
                setContentView(R.layout.question_six);
                break;
            case R.id.btn_Next_6:
                setContentView(R.layout.question_seven);
                break;
            case R.id.btn_Next_7:
                setContentView(R.layout.question_eight);
                break;
            case R.id.btn_Next_8:
                setContentView(R.layout.question_nine);
                break;
            case R.id.btn_Next_9:
                setContentView(R.layout.question_ten);
                break;
            case R.id.btn_Next_10:
                setContentView(R.layout.question_eleven);
                break;
            case R.id.btn_Next_11:
                setContentView(R.layout.question_twelve);
                break;
            case R.id.btn_Next_12:
                setContentView(R.layout.finish_survey);
                break;
            case R.id.btn_finish:
                finish();
                break;
            default:
                break;
        }
    }
}
