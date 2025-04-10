@echo off
echo Compilando APK do projeto mafiamiojo...
gradlew.bat assembleDebug
echo.
echo Se tudo deu certo, o APK estará em:
echo app\build\outputs\apk\debug\app-debug.apk
pause
