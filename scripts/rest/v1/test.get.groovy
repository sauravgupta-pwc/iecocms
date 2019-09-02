import java.net.URL

URL get = new URL("http://iecocms.eastus.cloudapp.azure.com:8080/studio/api/2/audit");
def getConnection = get.openConnection();
def getRC = getResponseCode();
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}
