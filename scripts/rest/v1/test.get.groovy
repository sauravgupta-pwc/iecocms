import java.net.URL

def get = new URL("https://docs.oracle.com/javase/8/docs/api/overview-summary.html").openConnection();
def getRC = get.getResponseCode();
logger.info('flag 1')
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
    return get.getInputStream().getText()
}

logger.info('flag 2')