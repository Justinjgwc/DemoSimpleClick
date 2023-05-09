package sg.edu.rp.c346.id22012433.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //step 2 create an object of UI element
    TextView disText;
    Button button;
    EditText intText;
    ToggleButton toggleButtonEnabled;
    RadioGroup rgGender;
    RadioButton rbgMale;
    RadioButton rbgFemale;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        disText = findViewById(R.id.disText);
        intText = findViewById(R.id.inText);
        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);
        rbgMale = findViewById(R.id.radioButtonGenderMale);
        rbgFemale = findViewById(R.id.radioButtonGenderFemale);//step 3 linking object with UI elements by ID

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResource = intText.getText().toString();
                int checkedRadioId =
                        rgGender.getCheckedRadioButtonId();
                if(checkedRadioId ==R.id.radioButtonGenderMale) {
                    String genM="He says ";
                    stringResource=genM+stringResource;
                }
                else{  String genF="She says ";
                    stringResource=genF+stringResource;

                }
                disText.setText(stringResource);
            }

        });

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButtonEnabled.isChecked()) {
                    intText.setEnabled(true);
                } else {
                    intText.setEnabled(false);
                }
            }
        });
    }
}