import org.apache.commons.io.FileUtils;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;

/**
 * Created by Bob on 10/16/2015.
 */
public class MimeTypeDetector {
    public static void main(String[] args) {
        final String dir =  ".\\sampleFiles";

        Collection<File> files = FileUtils.listFiles(new File(dir), null, true);
        for (File aFile : files) {
            try {
                final String theFileName = aFile.getAbsolutePath();
                final InputStream is = new FileInputStream(theFileName);
                final BufferedInputStream bis = new BufferedInputStream(is);
                final AutoDetectParser parser = new AutoDetectParser();
                final Detector detector = parser.getDetector();
                final Metadata md = new Metadata();
                md.add(Metadata.RESOURCE_NAME_KEY, theFileName);
                final MediaType mediaType = detector.detect(bis, md);
                System.out.println(String.format("file=%s, mimeType=%s",aFile.getName(), mediaType));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
