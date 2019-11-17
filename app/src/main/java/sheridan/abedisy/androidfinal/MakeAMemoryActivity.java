package sheridan.abedisy.androidfinal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MakeAMemoryActivity extends AppCompatActivity {

    public static final int CAMERA_REQUEST_CODE = 228;
    public static final int CAMERA_PERMISSION_REQUEST_CODE = 4192;
    public static final int IMAGE_GALLARY = 22;
    Uri imageUri;

    Button buttonSavePic;
    Button showGallary;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_amemory);

        setTitle("Snap a Memory");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        OpenDialog();

        imageView = findViewById(R.id.imageView);
        showGallary = findViewById(R.id.button2);

        buttonSavePic = findViewById(R.id.buttonTakePic);
        buttonSavePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captureImage();
            }
        });
    }

    public void captureImage(){
        Toast.makeText(this, "Pictures will be saved in Gallery ", Toast.LENGTH_LONG).show();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if(checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                invokeCamera();
            }else {
                String [] permissionRequest = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permissionRequest, CAMERA_PERMISSION_REQUEST_CODE );
            }
        }
    }

    private void invokeCamera(){
        Uri pictureUri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName()+ ".provider", createImageFile());
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         //tell camera wheere to save
        intent.putExtra(MediaStore.EXTRA_OUTPUT, pictureUri);
        intent.setFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        startActivityForResult(intent, CAMERA_REQUEST_CODE);
    }


    private File createImageFile() {
        File pictureDirectopry = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = sdf.format(new Date());
        File imageFile = new File(pictureDirectopry, "picture"+timestamp+".jpg");
        return imageFile;
    }


    public void showGallaryPics(View v){

      Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    File pictureDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
      String pictureDirectoryPath = pictureDirectory.getPath();
      Uri data = Uri.parse(pictureDirectoryPath);
      intent.setDataAndType(data, "image/*");
      startActivityForResult(intent, IMAGE_GALLARY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == CAMERA_REQUEST_CODE){
                Toast.makeText(this, "Picture successfully saved in Photos  ", Toast.LENGTH_LONG).show();
            }
            imageUri = data.getData();
            imageView.setImageURI(imageUri);
        }

    }


    public void OpenDialog(){
        Dialog exampleDialog = new Dialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }



    /* @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        if(requestCode == CAMERA_PERMISSION_REQUEST_CODE ){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED ){
                invokeCamera();

            }else{
                Toast.makeText(this, "I cant", Toast.LENGTH_LONG).show();
            }

        }
    }*/

}
