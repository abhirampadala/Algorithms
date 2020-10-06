
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.time.Instant;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class CreateJWT {

	public static void main(String[] args) {
		System.out.println(createJWT());
//		String jwt = createJWT();
//		System.out.println(decodeJWT(jwt));

	}

	// Sample method to construct a JWT
	private static String createJWT() {

		JwtBuilder b1=null;
		// The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long ut1 = Instant.now().getEpochSecond();
		System.out.println(ut1);
		String nbf = String.valueOf(ut1);
		long ut2 = ut1 + 120;
		System.out.println(ut2);
		String exp = String.valueOf(ut2);
		
		 Map<String, Object> header = new HashMap<>();
		 header.put("Accept-Charset", "utf-8");
		/*
		 * header.put(JwsHeader.ALGORITHM, signatureAlgorithm);
		 */ 
		  Map<String, Object> claims = new HashMap<>();
		  claims.put("sub", "2b9211a7-c869-11e8-8f49-001e6796a8d7");
		  claims.put("nbf", nbf);
		  claims.put("openid", "{vaf3}VMW-02223528T-02275987");
		  claims.put("iss", "VMware");
		  claims.put("exp", exp);
		  claims.put("email", "lms_qa@vmware.com");
		  claims.put("username", "vmw-02223528t-02275987");  
		  
	
		// We will sign our JWT with our ApiKey secret
		//byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary.parseBase64Binary("123456789012345678901234567890123456");
		  byte[] apiKeySecretBytes;
		try {
			apiKeySecretBytes = Base64.getEncoder().encode("123456789012345678901234567890123456".getBytes("utf-8"));
		
//		123456789012345678901234567890123456
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

		
		/*
		 * String payload =
		 * "{\r\n  \"sub\": \"2b9211a7-c869-11e8-8f49-001e6796a8d7\",\r\n  \"nbf\": " +
		 * ut1 + ",\r\n  " +
		 * "\"openid\": \"{vaf3}VMW-02223528T-02275987\",\r\n  \"iss\": " +
		 * "\"VMware\",\r\n  \"exp\": " + ut2 +
		 * ",\r\n  \"email\": \"lms_qa@vmware.com\",\r\n  " +
		 * "\"username\": \"vmw-02223528t-02275987\"\r\n}";
		 */
		
		b1 = Jwts.builder().setClaims(claims).signWith(signatureAlgorithm, signingKey);

		System.out.println("The value is ::: "+b1.compact());
		
	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b1.compact();
	}
	
//	public static Claims decodeJWT(String jwt) {
//	    //This line will throw an exception if it is not a signed JWS (as expected)
//	    Claims claims = Jwts.parser()
//	            .setSigningKey(DatatypeConverter.parseBase64Binary("W1dnI6z1r7mNhCPrW8TaI6HbKzudyplYFTB43FHFgrMNYGl0h1PMthwSa+6VpSbn"))
//	            .parseClaimsJws(jwt).getBody();
//	    return claims;
//	}

}
