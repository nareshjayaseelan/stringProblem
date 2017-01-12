import org.testng.annotations.DataProvider;


public class DataProviderSource {

    @DataProvider(name="String_TD")
    public static Object[][] getClientSData() {

        return new Object[][] { 
        	 								{ "", 'H', "" },
        	 								{ "Hi Mr.John. How are you doing?.", 'o', "Hi Mr.Jhn. Hw are yu ding?." },
        	 								{ "Hi Mr.John. How are you doing?.", 'H', "i Mr.John. ow are you doing?." },
        	 								{ "Hi Mr.John. How are you doing?.", '.', "Hi MrJohn How are you doing?" }, 
        	 								{ "Hi Mr.John. How are you doing?.", ' ', "HiMr.John.Howareyoudoing?." },
        	 								{ "Hi Mr.John. \\How are you doing?.\\", '\\', "Hi Mr.John. How are you doing?." },
        	 								{ "HI Mr.John. How are you doing?.", 'I', "H Mr.John. How are you doing?." },
        	 								{ "Hi Mr.John. 'How are you doing?.'", '\'', "Hi Mr.John. How are you doing?." }};    

    }
    @DataProvider(name="String_TD1")
    public static Object[][] getClientSData1() {

        return new Object[][] { 			{ "", 'H', "" },
        	 								{ "Hi Mr.John. How are you doing?.", 'o', "Hi Mr.Jhn. Hw are yu ding?." },
        	 								{ "Hi Mr.John. How are you doing?.", 'H', "i Mr.John. ow are you doing?." },
        	 								{ "Hi Mr.John. How are you doing?.", '.', "Hi MrJohn How are you doing?" }, 
        	 								{ "Hi Mr.John. How are you doing?.", ' ', "HiMr.John.Howareyoudoing?." },
        	 								{ "Hi Mr.John. \\How are you doing?.\\", '\\', "Hi Mr.John. How are you doing?." },
        	 								{ "HI Mr.John. How are you doing?.", 'I', "H Mr.John. How are you doing?." },
        	 								{ "aaa", 'a', "" },
        	 								{ "Hi Mr.John. 'How are you doing?.'", '\'', "Hi Mr.John. How are you doing?." }};    

    }
}
