package Testing;

public class MobilePhone implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone obj = new MobilePhone();
		obj.Incomingcall();
		obj.Messages();
		obj.OutgoingCall();

	}

	@Override
	public void Incomingcall() {
		// TODO Auto-generated method stub
		System.out.println("Pick the call");
	}

	@Override
	public void OutgoingCall() {
		// TODO Auto-generated method stub
		System.out.println("Call Divert");
		
	}

	@Override
	public void Messages() {
		// TODO Auto-generated method stub
		System.out.println("Message");
		
	}

}
