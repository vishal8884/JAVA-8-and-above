package Tutorial2.OptionalClassJava8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		//of,empty, ofNullable
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println("emptyOptional :: "+emptyOptional);
		
		/////////////////////////////////////////////Option.of()///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String email = "vishal@gmail.com";
		Optional<String> emailOptional = Optional.of(email);                    // it throws null pointer exception
		System.out.println("emailOptional :: "+emailOptional);
		
/////////////////////////////////////////////////////Traditional null check///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Optional<String> stringOptional = Optional.ofNullable(null);           //wont throw null pointer exception...instead return empty
		
		if(stringOptional.isPresent()) {
			System.out.println("stringOptional :: "+stringOptional);
		}
		else {
			System.out.println("no value present");
		}
		
/////////////////////////////////////////////////OrElse()///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Optional<String> stringOptional2 = Optional.ofNullable("vishal"); 
		String stringop2 = stringOptional2.orElse("not present");
		System.out.println("stringop2 :: "+stringop2);
		
////////////////////////////////////////////orElseGet(Supplier interface lambda expression)/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Optional<String> stringOptional3 = Optional.ofNullable(null); 
		String stringOptional3A = stringOptional3.orElseGet(() -> "not present using supplier functional interface");
		System.out.println("stringOptional3A :: "+stringOptional3A);
		
////////////////////////////////////////////orElseThrow/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Optional<String> stringOptional4 = Optional.ofNullable("email.com"); 
		String a1 = stringOptional4.orElseThrow(() -> new IllegalArgumentException("illgal exception occured"));
		System.out.println("a1 :: "+a1);
		
///////////////////////////////////////IfPresent()////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Optional<String> gender = Optional.of("MALE");
		Optional<String> e = Optional.empty(); // or optional.valueOf(null);
		
		gender.ifPresent((s) -> System.out.println("value is present1 "+s));
		e.ifPresent((s) -> System.out.println("values is present2 :: "+s));
		
//////////////////////////////////////////Filter()//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String result = "abc";
		if(result != null && result.contains("abc")) {  //check null and if some string is available
			System.out.println("result abc is present :: "+result);
		}
		
		String result2 = "def";
		Optional<String> optionalString = Optional.of(result2);
		optionalString.filter((n) -> n.contains("def"))
		              .ifPresent((res) -> System.out.println("result2 is also present :: "+res));
		
/////////////////////////////////////////////Map method in optional class//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		String result3 = "def";
		Optional<String> optionalString3 = Optional.of(result3);
		
		optionalString3.map((s) -> s.trim())
                       .ifPresent((res) -> System.out.println("res is presnet 3 :: "+res));
	 
	
	}
}
