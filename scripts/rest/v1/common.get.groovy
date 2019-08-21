import org.craftercms.engine.model.SiteItem;
import org.dom4j.Document;

SiteItem item = siteItemService.getSiteItem("/site/components/contents${params.site}");
if(item==null)
    return ["err_code":"404","err_message":"Mentioned page not found"];
Document document = item.getDom();
document.selectSingleNode("component/content-type").detach();
document.selectSingleNode("component/display-template").detach();
document.selectSingleNode("component/merge-strategy").detach();
document.selectSingleNode("component/objectGroupId").detach();
document.selectSingleNode("component/objectId").detach();
document.selectSingleNode("component/createdDate").detach();
document.selectSingleNode("component/createdDate_dt").detach();
document.selectSingleNode("component/lastModifiedDate").detach();
document.selectSingleNode("component/folder-name").detach();
document.selectSingleNode("component/file-name").detach();
document.selectSingleNode("component/internal-name").detach();

return document;