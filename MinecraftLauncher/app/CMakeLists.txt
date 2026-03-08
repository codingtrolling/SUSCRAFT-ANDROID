cmake_minimum_required(VERSION 3.22.1)
project("launcher_natives")

add_library(launcher_natives SHARED 
    src/main/cpp/native-lib.cpp 
    src/main/cpp/egl_bridge.cpp)

find_library(log-lib log)
find_library(android-lib android)
find_library(egl-lib EGL)
find_library(gles-lib GLESv2)

target_link_libraries(launcher_natives 
    ${log-lib} 
    ${android-lib} 
    ${egl-lib} 
    ${gles-lib})
