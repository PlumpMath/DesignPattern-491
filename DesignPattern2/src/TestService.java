
public class TestService {
	
	
	
	public static TestInterface getInstance() {

		return new TestIpl();

	}
	public static int getInt11(){
		return 11;
	}
	public static int getInt22(){
		return 22;
	}
	
	public static int getSubDataStatic(){
			return new TestService2().getData();
		
		
	}
	public int getSubData(){
		
			return new TestService2().getData();
		
		
	}
	public int getSubData2(){
		
		return new TestService2().getRealData();
	
	
}
}
