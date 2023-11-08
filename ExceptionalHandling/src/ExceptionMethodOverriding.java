import java.io.IOException;

class A {

	public void m() throws Exception {

	}
}

class B extends A {

	@Override
	public void m() throws IOException{
	}
}

public class ExceptionMethodOverriding {

}
