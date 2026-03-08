#include <jni.h>
#include <string>
#include <android/log.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_launcher_core_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "SUSCRAFT Native Engine Initialized";
    return env->NewStringUTF(hello.c_str());
}
