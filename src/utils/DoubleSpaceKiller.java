package utils;

public class DoubleSpaceKiller {
    public static String doubleSpaceKiller(String str) {
        StringBuilder stringBuffer = new StringBuilder(str.trim());
        int doubleSpacePosition = stringBuffer.indexOf("  ");
        while (doubleSpacePosition != -1) {
            stringBuffer.delete(doubleSpacePosition, doubleSpacePosition + 1);
            doubleSpacePosition = stringBuffer.indexOf("  ");
        }
        return stringBuffer.toString();
    }
}
