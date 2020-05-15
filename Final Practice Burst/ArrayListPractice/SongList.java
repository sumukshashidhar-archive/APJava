public class DownloadInfo
{
	public DownloadInfo(String title) 
	{

	}

	public String getTitle()
	{

	}

	public void incrementTimesDownloaded()
	{

	}
}


public class MusicDownloads
{

	private List<DownloadInfo> downloadList;

	public MusicDownloads()
	{
		downloadList = new ArrayList<DownloadInfo>();

	}

	public DownloadInfo getDownloadInfo(String title)
	{
		for(DownloadInfo di: downloadList)
		{
			if(di.getTitle() == title)
			{
				
			}
		}
	}

	public void updateDownloads(List<String> titles) {

	}
}