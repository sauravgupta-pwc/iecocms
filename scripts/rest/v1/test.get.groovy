import java.net.URL

def get = new URL("http://iecocms.eastus.cloudapp.azure.com:8080/studio/api/2/audit").openConnection();
def getRC = get.getResponseCode();
println(getRC);
return getRC;
if(getRC.equals(200)) {
    //println(get.getInputStream().getText());
    return get.getInputStream().getText();
    //return "Success";
}

//return "Failed";