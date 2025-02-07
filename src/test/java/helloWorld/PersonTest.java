package helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person R;
	Person J;
	Person L;
	Person M;
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person ("Romeo", "Mon", 15);
		J = new Person ("Juliet", "Cap", 14);
		L = new Person ("Long", "John", 50);
		M = new Person ("Man", "Can", 45);
	}

	@Test
	void testToString()
	{
		assertEquals(R.toString(), "Romeo Mon 15");
		assertEquals(J.toString(), "Juliet Cap 14");
	}
	@Test
	void testNewPerson()
	{
		assertThrows(UnderAgeException.class,
				()->{
					R.makePerson(J);
				});
		
		assertThrows(UnderAgeException.class,
				()->{
					M.makePerson(J);
				});
		
		try
		{
			Person child = L.makePerson(M);
			assertEquals(L.getFname(), child.getFname());
			assertEquals(M.getLname(), child.getLname());
			assertEquals(child.getAge(), 0);
			
		} catch (UnderAgeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}
		//assertEquals(R.getFname(), child.getFname());
		//assertEquals(J.getLname(), child.getLname());
		//assertEquals(child.getAge(), 0);
		
	}

}
