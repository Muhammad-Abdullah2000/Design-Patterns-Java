interface video{
    void videoFile();
}
class VideoFile implements video{
    @Override
    public void videoFile() {
        System.out.println("The Video File is created");
    }
}
class OggCompressionCodec implements video{
    @Override
    public void videoFile() {
        System.out.println("The OggCompressionCodec is created");
    }
}
class MPEG4CompressionCodec implements video{
    @Override
    public void videoFile() {
        System.out.println("The MPE4CompressionCodec is created");
    }
}
class CodecFactory implements video{
    @Override
    public void videoFile() {
        System.out.println("The CodecFactory is created");
    }
}
class BitrateReader implements video{
    @Override
    public void videoFile() {
        System.out.println("The BitrateReader is created");
    }
}
class AudioMixer implements video{
    @Override
    public void videoFile() {
        System.out.println("The AudioMaker is created");
    }
}
class VideoConverter{
    private video videofile;
    private video oggcompressioncodec;
    private video mpeg4compressioncodec;
    private video codecfactory;
    private video bitratreader;

        VideoConverter(){
        videofile = new VideoFile();
        oggcompressioncodec = new OggCompressionCodec();
        mpeg4compressioncodec = new MPEG4CompressionCodec();
        codecfactory = new CodecFactory();
        bitratreader = new BitrateReader();
    }
    public void makeVideo(){
        videofile.videoFile();
    }
    public void makeoggcompressioncodec(){
        oggcompressioncodec.videoFile();
    }
    public void mpeg4compressioncodec(){
        mpeg4compressioncodec.videoFile();
    }
    public void codecfactory(){
        codecfactory.videoFile();
    }
    public void bitratreader(){
        bitratreader.videoFile();
    }

}

public class Facade_Dp {
    public static void main(String[] args) {
            VideoConverter vc = new VideoConverter();

            vc.makeVideo();
            vc.makeoggcompressioncodec();
            vc.mpeg4compressioncodec();
            vc.codecfactory();
            vc.bitratreader();
    }
}
