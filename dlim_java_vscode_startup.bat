@echo off

echo Starting VSCode and installing extensions...

cmd /c code --install-extension redhat.java --install-extension visualstudioexptteam.vscodeintellicode --install-extension vscjava.vscode-java-debug --install-extension vscjava.vscode-java-dependency --install-extension vscjava.vscode-java-test

echo Extensions installed sucessfully!

echo "Configuring Java path..."
(echo {
echo    "redhat.telemetry.enabled": false,
echo    "java.configuration.runtimes": [
echo        {
echo            "name": "JavaSE-17",
echo            "path": "S:\\EEE-Software\\Eclipse\\eclipse-java-2024-09-R-win32-x86_64\\plugins\\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.4.v20240802-1551\\jre",
echo            "default": true
echo        },
echo    ]
echo }
) > "%appdata%\Code\User\settings.json"

echo "Java path correctly defined!"

echo "Complete!"

pause
exit 1
