package com.emguidance.biodigital;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.biodigital.humansdk.HKAnnotation;
import com.biodigital.humansdk.HKCamera;
import com.biodigital.humansdk.HKColor;
import com.biodigital.humansdk.HKHuman;
import com.biodigital.humansdk.HKHumanInterface;
import com.biodigital.humansdk.HKServices;
import com.biodigital.humansdk.HKServicesInterface;
import com.biodigital.humansdk.HKTimeline;
import com.biodigital.humansdk.HumanUIOptions;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements HKServicesInterface, HKHumanInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HKServices.getInstance().setup(getApplicationContext(), this);
    }

    public void onValidSDK() {
        runOnUiThread(() -> {
            RelativeLayout rl = findViewById(R.id.humanBody);
            HashMap<HumanUIOptions, Boolean> map = new HashMap<>();
            map.put(HumanUIOptions.all, true);
            HKHuman human = new HKHuman(rl, map);

            String modelId = getIntent().getExtras().getString("modelId");
            human.load(modelId);
        });
    }

    @Override
    public void onModelsLoaded() {

    }

    @Override
    public void onInvalidSDK() {

    }

    @Override
    public void onModelDownloaded(String modelId) {

    }

    @Override
    public void onModelLoaded(String modelId) {

    }

    @Override
    public void onModelLoadError(String modelId) {

    }

    @Override
    public void onObjectSelected(String objectId) {

    }

    @Override
    public void onObjectDeselected(String objectId) {

    }

    @Override
    public void onObjectsShown(Map<String, Object> objects) {

    }

    @Override
    public void onChapterTransition(String chapterId) {

    }

    @Override
    public void onAnimationComplete() {

    }

    @Override
    public void onScreenshot(Bitmap image) {

    }

    @Override
    public void onSceneInit(String title) {

    }

    @Override
    public void onXrayEnabled(Boolean isEnabled) {

    }

    @Override
    public void onSceneRestore() {

    }

    @Override
    public void onTimelineUpdated(HKTimeline timeline) {

    }

    @Override
    public void onAnnotationCreated(String annotationId) {

    }

    @Override
    public void onAnnotationDestroyed(String annotationId) {

    }

    @Override
    public void onCameraUpdated(HKCamera camera) {

    }

    @Override
    public void onObjectPicked(String objectId, double[] position) {

    }

    @Override
    public void onAnnotationsShown(Boolean isShown) {

    }

    @Override
    public void onAnnotationUpdated(HKAnnotation annotation) {

    }

    @Override
    public void onObjectColor(String objectId, HKColor color) {

    }

    @Override
    public void onSceneCapture(String captureString) {

    }
}