

interface ThirdPartyYoubeLid{
    void ListVideos();
//    void getVideoInfo( int id);
//    void downloadVideo(int id);

}

class ThirdPartyYoutubeClass implements ThirdPartyYoubeLid{
    public void ListVideos(){

        System.out.println("Videos listed");

    }

//    @Override
//    public void getVideoInfo(int id) {
//        System.out.println("Video Info Provided");
//    }
//
//    @Override
//    public void downloadVideo(int id) {
//        System.out.println("The video is downloaded");
//    }
//}

static class cacheYoutueClass implements ThirdPartyYoubeLid{
    private String service;
    private int videocache;

    cacheYoutueClass(String service, int videocache){
      this.service = service;
      this.videocache=videocache;
      ServiceProvider(service+videocache);

    }

    private void ServiceProvider(String service) {

        System.out.println("Service is provided " + service);

    }

    @Override
    public void ListVideos() {
        System.out.println("Displaying The videos " + service);
    }
}
}
// Proxy class
class Proxy implements ThirdPartyYoubeLid {
      private ThirdPartyYoutubeClass.cacheYoutueClass CacheYoutubeClass;
      private String service;
    private int videocache;


      Proxy(String service, int videocache){
          this.service=service;
          this.videocache=videocache;
      }

    @Override
    public void ListVideos() {
        CacheYoutubeClass = new ThirdPartyYoutubeClass.cacheYoutueClass(service,videocache);
        CacheYoutubeClass.ListVideos();
    }
}






public class Proxy_Dp {
    public static void main(String[] args) {
        ThirdPartyYoubeLid third = new Proxy(" Video displayed ", 1);
        ThirdPartyYoubeLid third1 = new Proxy(" Video Downloded ", 2);
        third.ListVideos();
        third1.ListVideos();

    }
}
