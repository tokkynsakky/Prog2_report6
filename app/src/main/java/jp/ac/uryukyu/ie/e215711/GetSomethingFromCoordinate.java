package jp.ac.uryukyu.ie.e215711;
import java.util.List;
import java.util.Arrays;

public class GetSomethingFromCoordinate {
    String capableChoice = "";
    String owner1 = "";
    int sum = 0;
    String owner = "";
    int row = 0;
    int column = 0;

    String getOwner(String coordinate){
        List<String> separateIdentify = Arrays.asList(coordinate.split(""));
        for(String str: separateIdentify){
            if(sum == 0){
                owner += str;
            }
            sum ++;
        }
        return owner;
    }
    int getRow(String coordinate){
        List<String> separateIdentify = Arrays.asList(coordinate.split(""));
        for(String str: separateIdentify){
            if(sum == 1){
                row += Integer.parseInt(str);
            }
            sum ++;
        }
        return row;
    }
    int getColumn(String coordinate){
        List<String> separateIdentify = Arrays.asList(coordinate.split(""));
        for(String str: separateIdentify){
            if(sum == 2){
                column += Integer.parseInt(str);
            }
            sum ++;
        }
        return column;
    }
}
