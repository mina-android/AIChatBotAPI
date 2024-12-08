package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new xyz.canardoux.fluttersound.FlutterSound());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_sound, xyz.canardoux.fluttersound.FlutterSound", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tundralabs.fluttertts.FlutterTtsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_tts, com.tundralabs.fluttertts.FlutterTtsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_barcode_scanning.GoogleMlKitBarcodeScanningPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_barcode_scanning, com.google_mlkit_barcode_scanning.GoogleMlKitBarcodeScanningPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_commons.GoogleMlKitCommonsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_commons, com.google_mlkit_commons.GoogleMlKitCommonsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_digital_ink_recognition.GoogleMlKitDigitalInkRecognitionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_digital_ink_recognition, com.google_mlkit_digital_ink_recognition.GoogleMlKitDigitalInkRecognitionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_entity_extraction.GoogleMlKitEntityExtractionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_entity_extraction, com.google_mlkit_entity_extraction.GoogleMlKitEntityExtractionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_face_detection.GoogleMlKitFaceDetectionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_face_detection, com.google_mlkit_face_detection.GoogleMlKitFaceDetectionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_face_mesh_detection.GoogleMlKitFaceMeshDetectionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_face_mesh_detection, com.google_mlkit_face_mesh_detection.GoogleMlKitFaceMeshDetectionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_image_labeling.GoogleMlKitImageLabelingPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_image_labeling, com.google_mlkit_image_labeling.GoogleMlKitImageLabelingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_language_id.GoogleMlKitLanguageIdPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_language_id, com.google_mlkit_language_id.GoogleMlKitLanguageIdPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_object_detection.GoogleMlKitObjectDetectionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_object_detection, com.google_mlkit_object_detection.GoogleMlKitObjectDetectionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_pose_detection.GoogleMlKitPoseDetectionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_pose_detection, com.google_mlkit_pose_detection.GoogleMlKitPoseDetectionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_selfie_segmentation.GoogleMlKitSelfieSegmentationPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_selfie_segmentation, com.google_mlkit_selfie_segmentation.GoogleMlKitSelfieSegmentationPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_smart_reply.GoogleMlKitSmartReplyPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_smart_reply, com.google_mlkit_smart_reply.GoogleMlKitSmartReplyPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_text_recognition, com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_translation.GoogleMlKitTranslationPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_translation, com.google_mlkit_translation.GoogleMlKitTranslationPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.imagepicker.ImagePickerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.csdcorp.speech_to_text.SpeechToTextPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.videoplayer.VideoPlayerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e);
    }
  }
}
