package com.nt.ps;

public interface paymentservices {
   public String Upipayment(long srcano, long desano, double amt);
   public String creditanddebit(long cardNo, int cvv, double amt);
   public String netbanking(long phonenumber, double amt );
   
}
