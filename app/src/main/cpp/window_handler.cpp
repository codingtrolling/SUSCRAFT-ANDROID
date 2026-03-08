#include <jni.h>
#include <GLES2/gl2.h>

extern "C" JNIEXPORT void JNICALL
Java_com_launcher_core_GameActivity_nativeResize(JNIEnv* env, jobject obj, jint width, jint height) {
    glViewport(0, 0, width, height);
    // Notify the game engine of the new window size
}
