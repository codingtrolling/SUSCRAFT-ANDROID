cmake_minimum_required(VERSION 3.22.1)
project("suscraft")

# Create a shared library from your C++ source
add_library(suscraft SHARED native-lib.cpp)

# Link necessary Android libraries (Logging, OpenGL, etc.)
find_library(log-lib log)

target_link_libraries(suscraft
    ${log-lib}
    android
    EGL
    GLESv3)
