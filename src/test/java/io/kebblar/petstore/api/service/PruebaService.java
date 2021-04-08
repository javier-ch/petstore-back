package io.kebblar.petstore.api.service;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.json;

public class PruebaService {

	public static void main(String args[]) {
		System.out.println("Prueba");
		String jsonA = "{\"a\":1,\"b\":2,\"c\":3}";
		String jsonB = "{\"c\":3,\"a\":1,\"b\":2}";
		assertThatJson(jsonA).isEqualTo(jsonB);
//		assertThatJson("{\"a\":1}")
//	    .isEqualTo(json("{\"a\":\"${json-unit.ignore}\"}"));
//		assertJsonEquals("{\"test\":[1,2,3]}",
//				  "{\"test\":  [3,2,1]}",
//				  when(Option.IGNORING_ARRAY_ORDER)
//				);
//		assertJsonEquals("","");
	}
}
