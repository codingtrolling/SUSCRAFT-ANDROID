#include <EGL/egl.h>
#include <GLES2/gl2.h>
#include <jni.h>

extern "C" JNIEXPORT void JNICALL
Java_com_launcher_core_GameActivity_initEGL(JNIEnv* env, jobject obj, jobject surface) {
    EGLDisplay display = eglGetDisplay(EGL_DEFAULT_DISPLAY);
    eglInitialize(display, nullptr, nullptr);

    EGLConfig config;
    EGLint numConfigs;
    EGLint attribs[] = { EGL_RENDERABLE_TYPE, EGL_OPENGL_ES2_BIT, EGL_NONE };
    eglChooseConfig(display, attribs, &config, 1, &numConfigs);

    EGLContext context = eglCreateContext(display, config, EGL_NO_CONTEXT, nullptr);
    // The surface from Java is hooked here
}
