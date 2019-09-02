import java.net.URL

URL get = new URL("http://iecocms.eastus.cloudapp.azure.com:8080/studio/api/2/audit");
get.openConnection();
def getRC = get.getResponseCode();
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}
