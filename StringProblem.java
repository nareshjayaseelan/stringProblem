import org.testng.Assert;
import org.testng.annotations.Test;
public class stringProblem {
	
	@Test(dataProvider = "String_TD",dataProviderClass=DataProviderSource.class)
	public static void RemoveCharFromString(String str,char ChrToBeDeleted,String ExpectedValue) {  
    	int pos = 0;
    	String Newstr = null;
    	String RestStr = null;
    	for (int iniLoop=0;iniLoop<=str.length()-1;iniLoop++)
    	{
    		char CtoS=str.charAt(iniLoop);
    		if(CtoS==ChrToBeDeleted)
    		{
    			Newstr=str.substring(0, iniLoop);
    			RestStr=str.substring(iniLoop+1, str.length());
    			str=Newstr+RestStr;
    			pos=iniLoop;
    			iniLoop+=1;
    		}
    		if(iniLoop-1==str.length()-1)
    		{
    			str=Newstr+RestStr+str.substring(pos, str.length()-1);
    		}
    	}
    	Assert.assertEquals(  str ,ExpectedValue);
    }
	
	@Test(dataProvider = "String_TD1",dataProviderClass=DataProviderSource.class)
    private static void RemoveCharFromStringOption2(String originalString, char chrToBeDeleted,String ExpectedValue) {
		// TODO Auto-generated method stub
    		Assert.assertEquals(  (originalString.replace(Character.toString(chrToBeDeleted),"")) ,ExpectedValue);
	}
}
