import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({TestService.class,TestService2.class})
public class Testcase1 {
	@Before
	public void before() {
		PowerMockito.spy(TestService.class);
		
		TestService2 impl = Mockito.spy(TestService2.class);
		PowerMockito.when(impl.getData()).thenReturn(100);
		try {
			PowerMockito.whenNew(TestService2.class).withAnyArguments().thenReturn(impl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PowerMockito.when(TestService.getInstance()).thenReturn(new TestInterface() {

			@Override
			public Integer get2() {
				// TODO Auto-generated method stub
				return 22;
			}

			@Override
			public Integer get1() {
				// TODO Auto-generated method stub
				return 11;
			}
		});

	}

	@Test
	public void test() {

		// BDDMockito.given(TestService.getInstance().get1()).willReturn(2);
		Integer result = TestService.getInstance().get1();
		PowerMockito.when(TestService.getInt11()).thenReturn(555);
		Integer result11 = TestService.getInt11();
		Integer result22 = TestService.getInt22();

		Assert.assertTrue(result22.equals(22));
		Assert.assertTrue(result11.equals(555));
	}

	@Test
	public void test2() {
		Integer result = TestService.getSubDataStatic();
		Assert.assertEquals(String.valueOf(result), String.valueOf(100));
	}
	@Test
	public void test3(){
		
		TestService mock = Mockito.spy(TestService.class);
		PowerMockito.when(mock.getSubData()).thenReturn(1212);
		Integer result = new TestService().getSubData();

		Assert.assertEquals(String.valueOf(result), String.valueOf(1212));
	}
	@Test
	public void test5(){

		Integer result = new TestService().getSubData2();

		Assert.assertEquals(String.valueOf(result), String.valueOf(222));
	}

}
