
import org.apache.commons.lang3.StringUtils;

public class StringUperCase {
    String stringATester;

    public StringUperCase(String stringATester) {
        this.stringATester = stringATester;
    }

    public  boolean testMaj(){
        if (StringUtils.isAllLowerCase(this.stringATester)||StringUtils.isAllUpperCase(this.stringATester)){
            return true;
        }
        else {
            return false;
        }
    }
}
