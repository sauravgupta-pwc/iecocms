import java.net.URL

def get = new URL("https://httpbin.org/get").openConnection();
def getRC = get.getResponseCode();
logger.info('flag 1')
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}

logger.info('flag 2')