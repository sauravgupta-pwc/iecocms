import java.net.URL

def get = new URL("http://iecocms.eastus.cloudapp.azure.com:8080/studio/api/1/services/api/1/audit/get.json?site_id=ieco_cms&start=0&number=50&actions=["UPDATED"]").openConnection();
def getRC = get.getResponseCode();
logger.info('flag 1')
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}

logger.info('flag 2')