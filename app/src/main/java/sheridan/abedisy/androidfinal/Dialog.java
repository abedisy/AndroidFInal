package sheridan.abedisy.androidfinal;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setMessage("This is an Android emulator, sometimes pictures doesnt show in Gallery right away" + "\n \n"+
                        "1. Please Minimize the app" + "\n"+
                        "2. Open Gallery App to refresh it" +"\n"+
                        "3. Go back to app and click 'Open Gallery'" +"\n \n" +
                        "Thank you for your patient, we are currently working to fix this issue."). setPositiveButton("I Understand", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
