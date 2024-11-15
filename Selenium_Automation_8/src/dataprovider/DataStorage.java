package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] loginData() {
		String data[][]= {
				{"admin","admin",},
				{"ad","admin"},
				{"ad","ad"},
				{"admin","ad"}
				};

		return data;
	}
	
	@DataProvider
	public String[][] registerData(){
		String registerData[][]= {
				{"john","smith","john1234@gmail.com","john@1234","john@1234"},
				{"harley","davidson","john1234@gmail.com","harley@1234","harley@1234"},
				{"john","smith","john1234@gmail.com","john@1234","john@1234"},
				{"john","smith","john1234@gmail.com","john@1234","john@1234"}
				};
		return registerData;
	}
}
