package com.project.application.KT.coreJava;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by rajender.koyyeda on 24-03-2022.
 */
public class SimpleSoapClient {
    public static void main(String args[]) throws IOException {

        /* place your xml request from soap ui below with necessary changes in parameters*/

        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <NumberToWords xmlns=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                "      <ubiNum>700</ubiNum>\n" +
                "    </NumberToWords>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        String responseF = callSoapService(xml);
        System.out.println("final response : " + responseF);
    }


    static String callSoapService(String soapRequest) {
        try {
            String url = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso"; // replace your URL here
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            System.out.println("request created");
            // change these values as per soapui request on top left of request, click on RAW, you will find all the headers
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            con.setDoOutput(true);
            System.out.println("request set");
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(soapRequest);
            System.out.println("request done");
            wr.flush();
            wr.close();
            String responseStatus = con.getResponseMessage();
            System.out.println("Res status : " + responseStatus);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // You can play with response which is available as string now:
            String finalvalue = response.toString();
            System.out.println("response in API: " + finalvalue);
            // or you can parse/substring the required tag from response as below based your response code
            finalvalue = finalvalue.substring(finalvalue.indexOf("<response>") + 10, finalvalue.indexOf("</response>"));
            System.out.println("response in API after trim : " + finalvalue);
            return finalvalue;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}