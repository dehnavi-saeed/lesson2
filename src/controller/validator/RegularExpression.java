package controller.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private Pattern pattern;
    private Matcher matcher;

    private RegularExpression regularExpression=null;
    private RegularExpression() {
    }

    public RegularExpression getRegularExpression(){
        if(regularExpression ==null){
            regularExpression = new RegularExpression() ;
        }
        return regularExpression;
    }
}
