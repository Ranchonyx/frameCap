import com.onyxlib.ImageProcessing.OpenCV_Modules.VideoWorker.VideoWorker;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if(args[0].equals("-?") || args[0].equals("-help") || args[0].equals("/?")) {


            System.out.println("Dependencies: OpenCV Windows native Library installed at version 3410.");
            System.out.println("Dependencies 2: Installing OpenCV_java3410.dll to your Windows Operating System");
            System.out.println("Dependencies 2.1: Run opencv_install.bat in the install directory");
            System.out.println("Description: frameCap is an application for dumping all frames of a video as lossless PNG files.");
            System.out.println("Usage: java -jar frameCap<version>.jar input.mkv descriptor outputDirectory");
            System.out.println("Example: java -jar frameCap-all-1.0-SNAPSHOT.jar D:\\directory\\video.mkv singleFrame D:\\directory");
            System.exit(0);

        } else {

            String inFile = args[0];
            String descriptor = args[1];
            String outDir = args[2];

            VideoWorker vw = new VideoWorker();
            vw.extractFrames(new File(inFile));
            vw.writeFrames(outDir, descriptor);
            System.exit(0);
        }
    }
}
