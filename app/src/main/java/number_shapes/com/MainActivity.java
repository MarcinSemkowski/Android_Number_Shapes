package number_shapes.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void testNumber(View view) {
        EditText userValue = findViewById(R.id.Number);

        Number number = new Number(Integer.parseInt(userValue.getText().toString()));

        String message = "";

        if ((userValue.getText().toString().isEmpty())) {
            message = "please enter a number !";
        } else {


            if (number.isSquare()) {
                if (number.isTriangular()) {
                    message = number.getNumber() + "is both triangular and square !";

                } else {
                    message = number.getNumber() + "is   square but not triangular !";
                }
            } else {
                if (number.isTriangular()) {
                    message = number.getNumber() + "is  triangular but not square !";

                } else {
                    message = number.getNumber() + " is nether square or triangular !";
                }
            }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
