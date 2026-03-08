#include <jni.h>
#include <android/native_window_jni.h>

extern "C" JNIEXPORT void JNICALL
Java_com_launcher_core_GameActivity_setNativeWindow(JNIEnv* env, jobject obj, jobject surface) {
    ANativeWindow* window = ANativeWindow_fromSurface(env, surface);
    // This window pointer is then passed to the LWJGL implementation
}
