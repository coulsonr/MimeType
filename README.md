# MimeType

Simple project that uses Apache Tika to determine the mime type of various files.

Run the main program MimeTypeDetector which will print a file name and it's corresponding mime type. The files to be analyzed are in the sampleFiles directory.

This project is an Intellij IDEA project. You should be able to import it directly into the Intellij IDEA IDE. 

Notes:

Plain text detection is difficult w/out the file extension.

Stack Overflow link to issue with plain text:
http://stackoverflow.com/questions/10505056/how-to-detect-mime-type-of-plain-text-files-css-javascript-ini-sql
http://stackoverflow.com/questions/12990450/tika-mime-type-detection-of-js-css

Custom project to improve on plain text detection. Don't believe this uses Tika.
https://github.com/cweiske/MIME_Type_PlainDetect

