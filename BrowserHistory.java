import java.util.ArrayList;

public class BrowserHistory{

	private ArrayList<VisitedUrl> nextUrl 	= new ArrayList<VisitedUrl>();
	private ArrayList<VisitedUrl> lastUrl 	= new ArrayList<VisitedUrl>();
	private VisitedUrl presentUrl;


	BrowserHistory(){
		this.presentUrl = new VisitedUrl();
	}

	BrowserHistory(String url){
		this.presentUrl = new VisitedUrl(url);
	}

	void visit(String url){
		this.nextUrl.clear();
		this.lastUrl.add(this.presentUrl);
		this.presentUrl = new VisitedUrl(url);
	}

	void goToNext(){
		if(this.nextUrl.size() != 0){
			this.lastUrl.add(this.presentUrl);
			this.presentUrl = this.nextUrl.get(this.nextUrl.size() - 1);
			this.nextUrl.remove(this.nextUrl.size() - 1);
		}
		return ; 
	}

	void goToLast(){
		if(this.lastUrl.size() != 0){
			this.nextUrl.add(this.presentUrl);
			this.presentUrl = this.lastUrl.get(this.lastUrl.size() - 1);
			this.lastUrl.remove(this.nextUrl.size() - 1);
		}
		return ;
	}

	String getPresentUrl(){
		return this.presentUrl.getUrl();
	}
}
