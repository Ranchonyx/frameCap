@echo off
@title OpenCV installer script running in %~dp0
if exist C:\Windows\System32\opencv_java3410.dll goto 1
echo Installing OpenCV_java3410.dll into C:\Windows\System32
echo Running Install...
pushd %~dp0\libs
title %~dp0
if exist opencv_java3410.dll echo DLL Found
copy opencv_java3410.dll C:\Windows\System32\
if exist C:\Windows\System32\opencv_java3410.dll echo Installed successfully
if not exist C:\Windows\System32\opencv_java3410.dll echo Could not install openCV on your System. Have you run as Administrator?
pause > NUL

:1
title Already installed
echo OpenCV_java3410.dll already installed :D !
pause > NUL