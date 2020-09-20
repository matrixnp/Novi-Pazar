package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kontakt extends Activity {

	Button buttonSend;
	TextView txtTo;
	EditText txtSubject;
	EditText txtMessage;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kontakt);
		buttonSend = (Button) findViewById(R.id.buttonSend);
        txtTo = (TextView) findViewById(R.id.primalac);
        txtSubject = (EditText) findViewById(R.id.editTextSubject);
        txtMessage = (EditText) findViewById(R.id.editTextMessage);
       
        buttonSend.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String to = txtTo.getText().toString();
				String subject = txtSubject.getText().toString();
				String message = txtMessage.getText().toString();
				 if (subject != null && subject.length() == 0) {
					Toast.makeText(getApplicationContext(),
							"Zaboravili ste da unesete predmet poruke",
							Toast.LENGTH_SHORT).show();
				} else if (message != null && message.length() == 0) {
					Toast.makeText(getApplicationContext(),
							"Zaboravili ste da unesete poruku",
							Toast.LENGTH_SHORT).show();
				} else if (to != null && subject != null && message != null) {
					Intent email = new Intent(Intent.ACTION_SEND);
					email.putExtra(Intent.EXTRA_EMAIL, new String[] { "goran.lesevic1@gmail.com" });				
					email.putExtra(Intent.EXTRA_SUBJECT, subject);
					email.putExtra(Intent.EXTRA_TEXT, message);				
					email.setType("message/rfc822");
					startActivity(Intent.createChooser(email,
							"Izaberite email aplikaciju :"));

				}
			}
		});

	}
	boolean isEmailValid(CharSequence email) {
		return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
	}
	 

}

