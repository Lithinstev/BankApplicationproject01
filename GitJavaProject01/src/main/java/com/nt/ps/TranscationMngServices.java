package com.nt.ps;

public class TranscationMngServices implements paymentservices
{

	@Override
	public String Upipayment(long srcano, long desano, double amt) {
		
		return  amt+" send from  "+srcano +" to " + desano +" by using upipayment method ";
	}

	@Override
	public String creditanddebit(long cardNo, int cvv, double amt) {
	   
		return  amt +"  transcation is successfull  ";
		
	}

	@Override
	public String netbanking(long phonenumber, double amt) {
		return  amt +" payment is send to phonenumber:  "+phonenumber;
		
	}
       
}
