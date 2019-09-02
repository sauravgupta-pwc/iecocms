import java.net.URL

def post = new URL("http://iecocms.eastus.cloudapp.azure.com:8080/studio/api/1/services/api/1/security/login.json").openConnection();
def message = '{ "username" : "admin", "password" : "Q!w2e3r4t5y6" }'
post.setRequestMethod("POST")
post.setDoOutput(true)
post.setRequestProperty("Content-Type", "application/json")
post.setRequestProperty("Cookie", "XSRF-TOKEN=1234567890")
post.setRequestProperty("X-XSRF-TOKEN", "1234567890")

post.getOutputStream().write(message.getBytes("UTF-8"));
def postRC = post.getResponseCode();
println(postRC);
if(postRC.equals(200)) {
    println(post.getInputStream().getText());
    return post.cookies;
}


return "Failed";