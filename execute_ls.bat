@ECHO OFF

REM Clone the repository containing the files to list
git clone https://github.com/Hadeer-Adel729/CmakeList-OpenCV.git files_repo

REM Check if the clone operation was successful
IF ERRORLEVEL 1 (
    ECHO Failed to clone the repository
    PAUSE
    EXIT /B 1
)

REM Navigate to the directory and list the files
CD files_repo
dir
PAUSE
