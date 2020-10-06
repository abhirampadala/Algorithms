


import java.net.URI;
import java.util.Iterator;


import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.BasePropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.search.FolderTraversal;
import microsoft.exchange.webservices.data.core.enumeration.search.LogicalOperator;
import microsoft.exchange.webservices.data.core.enumeration.search.SortDirection;
import microsoft.exchange.webservices.data.core.exception.service.local.ServiceLocalException;
import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.schema.FolderSchema;
import microsoft.exchange.webservices.data.core.service.schema.ItemSchema;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.ItemId;
import microsoft.exchange.webservices.data.search.FindFoldersResults;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.FolderView;
import microsoft.exchange.webservices.data.search.ItemView;
import microsoft.exchange.webservices.data.search.filter.SearchFilter;

public class FetchEmail {
	
	
	public static void  main(String[] args) {
//		 SleepUtils.sleep(TimeSlab.HIGH);
//		 SleepUtils.sleep(TimeSlab.HIGH);
//		 SleepUtils.sleep(TimeSlab.HIGH);
//		 SleepUtils.sleep(TimeSlab.HIGH);
		  
		  String S = "Reset Your Password";
		 
		   System.out.println(S);
		  
	      //String bodya = input.get("SearchText");
	      String subject = S;
		  
//		   LogUtils logger = new LogUtils();
		   EmailMessage email = null;
		   Folder my_Folder = null;
		   try{
		   ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
		   service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);

		   
		   service.setCredentials(new WebCredentials("abhiram2324@gmail.com","Abhi@2324" ));
		   service.setUrl(new URI(("https://gmail.com/ews/exchange.asmx")));
		   
		   Folder inbox = Folder.bind(service, WellKnownFolderName.Root);
		   
		   FolderView fview = new FolderView(100);

		   fview.setPropertySet(new PropertySet(BasePropertySet.IdOnly));
		   fview.getPropertySet().add(FolderSchema.DisplayName);

		   SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0);

		   fview.setTraversal(FolderTraversal.Deep);

		   FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, fview);

		   for(Folder myFolder:findFolderResults.getFolders())
		   {
			   System.out.println(myFolder.getDisplayName());
		  if(myFolder.getDisplayName().equals("AllItems"))
//			   if(true)
		  {
		   myFolder.load();
		   
		   my_Folder = myFolder;
//		   break;
		   
		   if (findFolderResults.isMoreAvailable())
		   {
		   ;
		   }

		   ItemView view = new ItemView(100);
		   view.getOrderBy().add(ItemSchema.DateTimeReceived, SortDirection.Descending);
		   view.setPropertySet(new PropertySet(BasePropertySet.IdOnly, ItemSchema.Subject, ItemSchema.DateTimeReceived));
		   FindItemsResults<Item> findResults = service
		   .findItems(my_Folder.getId(),
		   new SearchFilter.SearchFilterCollection(LogicalOperator.And,
		   new SearchFilter.ContainsSubstring(ItemSchema.Subject,
		   subject)),view);
		   System.out.print(findResults.getTotalCount());
		   if(findResults.getTotalCount()>0) {
			   System.out.println("Total count:"+findResults.getTotalCount());
		   service.loadPropertiesForItems(findResults, PropertySet.FirstClassProperties);
		   Iterator<Item> itr = findResults.iterator();
		   
		   while (itr.hasNext()) {
		   Item item = itr.next();
		   item.load();
		   ItemId itemId = item.getId();
		   email = EmailMessage.bind(service, itemId,
		   new PropertySet(BasePropertySet.FirstClassProperties, ItemSchema.Attachments));
		   String Subject = email.getSubject();
		   String body = email.getBody().toString();
		   System.out.println("Subject:"+email.getSubject());
		   System.out.println("Body:"+email.getBody().toString());
		  
//		   passedwithoutScreenshot("Vmware Provisioning Notification with SID displayed successfully in Qatester Email Box", "Vmware Provisioning Notification with SID "+S+"displayed successfully in Qatester Email Box",
//					"Successfully displayed Vmware Provisioning Notification with SID "+S+" in Qatester Email Box");
//		   }
		   if (email.getBody().toString().contains("Copyright")){
//			   passedwithoutScreenshot("CopyRights displayed successfully in Qatester Email Box", "CopyRights displayed successfully in Qatester Email Box",
//						"Successfully displayed CopyRights in Qatester Email Box"); 
			   System.out.println("Copyright displayed");
		   }
		   else
		   {
//			   failedwithoutScreenshot("CopyRights displayed successfully in Qatester Email Box", "CopyRights Not displayed successfully in Qatester Email Box",
//						"Failed to display CopyRights in Qatester Email Box");
			   
			   System.out.println("Copyright not displayed");
		   }
		   
		   }
		   }
		   
		   
		   else {
		   System.out.println("Subject not found!!!");
//		   failedwithoutScreenshot("Vmware Provisioning Notification with SID displayed successfully in Qatester Email Box", "Vmware Provisioning Notification with SID "+S+"Not displayed successfully in Qatester Email Box",
//					"Failed to display Vmware Provisioning Notification with SID "+null+"in Qatester Email Box");
		   
		   }
		  	
		   }
		   }
		   }catch (IllegalArgumentException iae) {
//		   logger.handleError("Error in downloading the file: " + iae);
		   } catch (ServiceLocalException sle) {
//		   logger.handleError("Error in downloading the file: " + sle);
		   } catch (Exception e) {
//		   logger.handleError("Error in downloading the file: " + e);
		   e.printStackTrace();
		   }
		   }

 }

