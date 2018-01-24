// This class was generated on Tue, 23 Jan 2018 11:23:30 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// VerifyWebhookSignatureResponse.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/5SPz0tDMQyA7/4VJeeHeO5N8CaozDEPIpJteVuwtjVJlSL736W+UX88Lx6TkI/ve4dlzQQeViQ8VndH631KT+6WdxGtCLkFaU5RCQZYoTCuA13hc3uBAS6pfg0XpBvhbJwieFjuyb1O0LcjVDtUjtBTGOBcBOtkcTbAgnB7HUMFP2JQaouXwkLbvriRlEmMScHfd3814bibS34q8Aab1aMaWtEf3n/f5ynTyaXRWZt6yff/f9WYlF8xsYRweDicfAAAAP//
// DO NOT EDIT
package com.paypal.sdk.webhooks;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The verify webhook signature response.
 */
@Model
public class VerifyWebhookSignatureResponse {

    // Required default constructor
    public VerifyWebhookSignatureResponse() {}

	/**
	* REQUIRED
	* The status of the signature verification.
	*/
	@SerializedName("verification_status")
	private String verificationStatus;

	public String verificationStatus() { return verificationStatus; }
	
	public VerifyWebhookSignatureResponse verificationStatus(String verificationStatus) {
	    this.verificationStatus = verificationStatus;
	    return this;
	}
}