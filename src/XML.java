
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.json.XML;
public class XML {
	
	 public static void main(String[] args) {
		 try {
		 String url = "http://odm-uat-app-a1.vmware.com:8021/DecisionService/ws/RevUpVersionInvoker/RevUpScoringRuleset?WSDL";
		 URL obj = new URL(url);
		 HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		 con.setRequestMethod("POST");
		 con.setRequestProperty("Content-Type","application/soap+xml; charset=utf-8");
//		 String countryCode="Canada";
		 String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><messages>\r\n" + 
		 		"<GetDealScoreODMReqVar>\r\n" + 
		 		"      <part xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" name=\"RevUpScoringRulesetRequest\">\r\n" + 
		 		"         <RevUpScoringRulesetRequest xmlns=\"http://www.ibm.com/rules/decisionservice/RevUpVersionInvoker/RevUpScoringRuleset\" xmlns:client=\"http://www.vmware.com/it/mw/revup/GetDealScoreProcess/GetDealScore\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" xmlns:ns5=\"http://xmlns.vmware.com/Canonicals/Common/FO/Schema/V1\" xmlns:ns6=\"http://xmlns.vmware.com/Canonicals/Common/FO/Schema/V2\" xmlns:ns2=\"http://xmlns.vmware.com/Canonicals/Common/Base/Custom/V1\" xmlns:ns1=\"http://xmlns.vmware.com/Canonicals/Common/Base/Common/V1\" xmlns:ns4=\"http://www.ibm.com/rules/decisionservice/RevUpVersionInvoker/RevUpScoringRuleset/param\" xmlns:plnk=\"http://docs.oasis-open.org/wsbpel/2.0/plnktype\" xmlns:ns3=\"http://www.vmware.com/error/v1\" xmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" xmlns:tns=\"http://www.ibm.com/rules/decisionservice/RevUpVersionInvoker/RevUpScoringRuleset\">\r\n" + 
		 		"            <tns:DecisionID>390043_1528374806122</tns:DecisionID>\r\n" + 
		 		"            <ns4:Request>\r\n" + 
		 		"               <Request xmlns=\"\">\r\n" + 
		 		"                  <requestType>MODELN</requestType>\r\n" + 
		 		"                  <geo>AMER</geo>\r\n" + 
		 		"                  <transaction>\r\n" + 
		 		"                     <txID>390043_1528374806122</txID>\r\n" + 
		 		"                     <dealScoreReqAttrItem>\r\n" + 
		 		"                        <OID>Q-04173</OID>\r\n" + 
		 		"                        <subtype>ELA</subtype>\r\n" + 
		 		"                        <spfSubtype>CAPPED</spfSubtype>\r\n" + 
		 		"                        <subRegion>Mexico</subRegion>\r\n" + 
		 		"                        <accounttype>COMMERCIAL</accounttype>\r\n" + 
		 		"                        <elaSubtype/>\r\n" + 
		 		"                        <addOnOrExtension/>\r\n" + 
		 		"                        <BCS>0.0</BCS>\r\n" + 
		 		"                        <MCS>0.0</MCS>\r\n" + 
		 		"                        <NLR>20000000.00</NLR>\r\n" + 
		 		"                        <newSns>0.0</newSns>\r\n" + 
		 		"                        <initialSns>0.0</initialSns>\r\n" + 
		 		"                        <PSO>0.0</PSO>\r\n" + 
		 		"                        <TAM>0.0</TAM>\r\n" + 
		 		"                        <totalPrice>2394000.70</totalPrice>\r\n" + 
		 		"                        <aggregatedIBSns>0.0</aggregatedIBSns>\r\n" + 
		 		"                        <coreTotalSum>0.0</coreTotalSum>\r\n" + 
		 		"                        <noncoreTotalSum>0.0</noncoreTotalSum>\r\n" + 
		 		"                        <eppLicenseSum>0.0</eppLicenseSum>\r\n" + 
		 		"                        <perpetualBlendedDisc>0.00</perpetualBlendedDisc>\r\n" + 
		 		"                        <subsTermBlendedDisc>60.00</subsTermBlendedDisc>\r\n" + 
		 		"                        <saasBlendedDisc>0.0</saasBlendedDisc>\r\n" + 
		 		"                        <totalBlendedDisc>50.8</totalBlendedDisc>\r\n" + 
		 		"                        <snsRate>25.00</snsRate>\r\n" + 
		 		"                        <snsType>NET</snsType>\r\n" + 
		 		"                        <snsLevel>PRODUCTION/PREMIUM</snsLevel>\r\n" + 
		 		"                        <HCPPLicenseSum>0.0</HCPPLicenseSum>\r\n" + 
		 		"                        <attr1>0.0</attr1>\r\n" + 
		 		"                        <attr2>0.0</attr2>\r\n" + 
		 		"                        <attr3>3</attr3>\r\n" + 
		 		"                        <attr4>0.0</attr4>\r\n" + 
		 		"                        <attr5>0.0</attr5>\r\n" + 
		 		"                        <attr6>0.0</attr6>\r\n" + 
		 		"                        <attr7>FALSE</attr7>\r\n" + 
		 		"                        <attr8>FALSE</attr8>\r\n" + 
		 		"                        <attr9/>\r\n" + 
		 		"                        <attr10>SMB</attr10>\r\n" + 
		 		"                        <attr11>880.00</attr11>\r\n" + 
		 		"                        <attr12>0.0</attr12>\r\n" + 
		 		"                        <attr13>55</attr13>\r\n" + 
		 		"                        <attr14/>\r\n" + 
		 		"                        <attr15/>\r\n" + 
		 		"                        <attr16/>\r\n" + 
		 		"                        <attr17/>\r\n" + 
		 		"                        <attr18/>\r\n" + 
		 		"                        <attr19/>\r\n" + 
		 		"                        <attr20/>\r\n" + 
		 		"                        <attr21>FALSE</attr21>\r\n" + 
		 		"                        <attr22>FALSE</attr22>\r\n" + 
		 		"                        <attr23/>\r\n" + 
		 		"                        <attr24/>\r\n" + 
		 		"                        <attr25/>\r\n" + 
		 		"                        <attr26/>\r\n" + 
		 		"                        <attr27/>\r\n" + 
		 		"                        <attr28/>\r\n" + 
		 		"                        <attr29/>\r\n" + 
		 		"                        <attr30/>\r\n" + 
		 		"                     </dealScoreReqAttrItem>\r\n" + 
		 		"                     <relDiscReqAttrItems>\r\n" + 
		 		"                        <relDiscReqAttrItem>\r\n" + 
		 		"                           <scoringComponentName>APPVOLUMES</scoringComponentName>\r\n" + 
		 		"                           <scoringComponentDiscountClass>PERPETUAL</scoringComponentDiscountClass>\r\n" + 
		 		"                           <scoringComponentDisc>0</scoringComponentDisc>\r\n" + 
		 		"                           <scoringComponentSum>88000.0000</scoringComponentSum>\r\n" + 
		 		"                        </relDiscReqAttrItem>\r\n" + 
		 		"                        <relDiscReqAttrItem>\r\n" + 
		 		"                           <scoringComponentName>VSPHERE</scoringComponentName>\r\n" + 
		 		"                           <scoringComponentDiscountClass>PERPETUAL</scoringComponentDiscountClass>\r\n" + 
		 		"                           <scoringComponentDisc>80</scoringComponentDisc>\r\n" + 
		 		"                           <scoringComponentSum>88000.00</scoringComponentSum>\r\n" + 
		 		"                        </relDiscReqAttrItem>\r\n" + 
		 		"                        <relDiscReqAttrItem>\r\n" + 
		 		"                           <scoringComponentName>NEW SNS</scoringComponentName>\r\n" + 
		 		"                           <scoringComponentDiscountClass/>\r\n" + 
		 		"                           <scoringComponentDisc>15.00</scoringComponentDisc>\r\n" + 
		 		"                           <scoringComponentSum>1782.0000</scoringComponentSum>\r\n" + 
		 		"                        </relDiscReqAttrItem>\r\n" + 
		 		"                     </relDiscReqAttrItems>\r\n" + 
		 		"                     <tnCReqAttrItems/>\r\n" + 
		 		"                  </transaction>\r\n" + 
		 		"               </Request>\r\n" + 
		 		"            </ns4:Request>\r\n" + 
		 		"         </RevUpScoringRulesetRequest>\r\n" + 
		 		"      </part>\r\n" + 
		 		"   </GetDealScoreODMReqVar>\r\n" + 
		 		"</messages>\r\n" + 
		 		" \r\n" + 
		 		" \r\n" + 
		 		" \r\n" + 
		 		"";
		 con.setDoOutput(true);
		 DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		 wr.writeBytes(xml);
		 wr.flush();
		 wr.close();
		 String responseStatus = con.getResponseMessage();
		 System.out.println(responseStatus);
		 BufferedReader in = new BufferedReader(new InputStreamReader(
		 con.getInputStream()));
		 String inputLine;
		 StringBuffer response = new StringBuffer();
		 while ((inputLine = in.readLine()) != null) {
		 response.append(inputLine);
		 }
		 in.close();
		 System.out.println("response:" + response);
//		 JSONObject obj = XML.toJSONObject(response);
		 } catch (Exception e) {
		 System.out.println(e);
		 }
		 }
		}

