/*import org.craftercms.engine.model.SiteItem

SiteItem item = siteItemService.getSiteItem("/site/components/contents${params.site}");
if(item!=null)
    return item.getDom();
return ["err_code":"404","err_message":"Mentioned page not found"];*/

return ${params.site};