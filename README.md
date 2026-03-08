# Custom Minecraft Java Launcher for Android

A high-performance, modular Minecraft: Java Edition launcher built natively for Android. This project implements a custom JVM bridge, Microsoft OAuth authentication, and a virtual input overlay.

## 🚀 Features
* **Version Support:** Vanilla (1.7.10 - 1.20.1+), Fabric, and Forge.
* **Auth:** Full Microsoft/Xbox Live OAuth 2.0 integration.
* **Rendering:** Native EGL bridge for OpenGL SurfaceView.
* **Performance:** Multi-threaded asset downloader and G1GC optimizations for ARM.
* **Controls:** Customizable virtual joystick and key-mapping.

## 🏗️ Architecture

The launcher is divided into several core modules:
1.  **Core Engine:** Handles process orchestration and JVM arguments.
2.  **Auth Module:** Manages Microsoft login tokens.
3.  **Download Manager:** Concurrency-driven asset and library acquisition.
4.  **Native Shim:** C++ bridge for windowing and input.

## 🛠️ Building
1. Clone the repository.
2. Ensure you have Android Studio Jellyfish or later.
3. Run the build script:
   ```bash
   ./build_apk.sh
Or Use The Provided Gradle Wrapper
./gradlew assembleDebug
📜 License
​MIT License - See LICENSE for details.
