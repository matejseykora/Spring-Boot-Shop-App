package cz.matejseykora.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ShopApplicationTests {

	@Test
	public void test() {
		int a = 2;
		int b = 3;
		Assertions.assertEquals(5,a+b);
	}
}
