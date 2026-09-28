@echo off
chcp 65001 >nul
if "%~1"=="" (
    echo Usage: run.bat "C:\path\to\input.pdf" ["C:\path\to\output.docx"]
    echo The output path is optional. If omitted, the .docx is saved next to the input PDF.
    echo You can also drag-and-drop a PDF file onto this .bat file.
    exit /b 1
)
java -cp "bin;lib\Spire.Doc.jar;lib\Spire.Pdf.jar;lib\jaxb\*" Main %*
