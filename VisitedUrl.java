public class VisitedUrl{

	private String url;

	VisitedUrl(){
		this.url = "https://www.default_url.com";
	}

	VisitedUrl(String url){
		this.url = url;
	}

	String getUrl(){
		return this.url;
	}
}	
