import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javassist.convert.TransformNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({TestService.class,TestService2.class})
public class Testcase1 {
	TestService2 impl ;
	@Before
	public void before() throws Exception {
		PowerMockito.spy(TestService.class);
		 impl = Mockito.spy(TestService2.class);
		PowerMockito.when(impl.getData()).thenReturn(100);
		
		PowerMockito.whenNew(TestService2.class).withAnyArguments().thenReturn(impl);

			

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
	public void test() throws Exception {
		
		// BDDMockito.given(TestService.getInstance().get1()).willReturn(2);
		Integer result = TestService.getInstance().get1();
		PowerMockito.when(TestService.getInt11()).thenReturn(555);
		Integer result11 = TestService.getInt11();
		Integer result22 = TestService.getInt22();

		Assert.assertTrue(result22.equals(22));
		Assert.assertTrue(result11.equals(555));
		
	}

	@Test
	public void test2() throws Exception {

		Integer result = TestService.getSubDataStatic();
		Assert.assertEquals(String.valueOf(result), String.valueOf(100));
		Mockito.verify(impl).getData();
	}
	@Test
	public void test3(){
		
		TestService mock = Mockito.spy(TestService.class);
		PowerMockito.when(mock.getSubData()).thenReturn(1212);
		Integer result = new TestService().getSubData();
		Integer result2 = new TestService().getSubData();

		Assert.assertEquals(String.valueOf(result), String.valueOf(1212));
		Mockito.verify(impl, VerificationModeFactory.atLeast(1)).getData();
	}
	@Test
	public void test5(){
		
		Integer result = new TestService().getSubData2();

		Assert.assertEquals(String.valueOf(result), String.valueOf(222));
	}
	@Test
	public void test6() throws Exception{
		
		TestIpl t = Mockito.spy(TestIpl.class);
		PowerMockito.when(t.get1()).thenReturn(1010);
		PowerMockito.whenNew(TestIpl.class).withAnyArguments().thenReturn(t);
		Assert.assertEquals(new TestIpl().get1()+"", 1010+"");
		Assert.assertEquals(new TestIpl().get2()+"", 111+"");
		
	}

}
