package Lesson2;

public class Main {
    public enum SizeType
    {
        i8,  //byte
        i16, //short
        i32, //int
        i64, //long
    }

    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0_14;
        byte b4 = 0xC;

        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);


        short s1 = -1300;
        short s2 = (short)0b1111101011101100;
        short s3 = (short)0_175354;
        short s4 = (short)0xFAEC;

        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);


        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0_0;
        int i4 = 0x0;

        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);


        long l1 = 123456789L;
        long l2 = 0b0111010110111100110100010101L;
        long l3 = 0_726746425L;
        long l4 = 0x75BCD15L;

        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);


        float f1 = 0.9402f; float f2 = 48.482020f;
        System.out.println(f1 + " " + f2);

        double d1 = 432.034234854; double d2 = 42300.32121214;
        System.out.println(d1 + " " + d2);

        boolean bl1 = true; boolean bl2 = false;
        System.out.println(bl1 + " " + bl2);

        char c1 = '\u840F';
        char c2 = 'F';
        char c3 = 30000;

        System.out.println(c1 + " " + c2 + " " + c3);
    }

    static String returnBinNumberString(long number, SizeType type)
    {
        String binNumberStr = "";

        if(number == 0)
        {
            binNumberStr = "0";
            int count = 0;

            switch(type)
            {
                case i8:
                    count = 8 - 1;
                    break;

                case i16:
                    count = 16 - 1;
                    break;

                case i32:
                    count = 32 - 1;
                    break;

                case i64:
                    count = 64 - 1;
                    break;
            }

            for(int i = 0; i < count; i++)
            {
                binNumberStr = "0" + binNumberStr;
            }

            return binNumberStr;
        }

        while(number > 0)
        {
            long rem = number % 2;
            char chRem = (char)(rem + '0');
            number /= 2;
            binNumberStr = chRem + binNumberStr;
        }

        int count = binNumberStr.length();
        switch(type)
        {
            case i8:
                count = 8 - count;
                break;

            case i16:
                count = 16 - count;
                break;

            case i32:
                count = 32 - count;
                break;

            case i64:
                count = 64 - count;
                break;
        }

        for(int i = 0; i < count; i++)
        {
            binNumberStr = "0" + binNumberStr;
        }

        return binNumberStr;
    }

    static String invedtedBinaryString(String notInvertedStr)
    {
        String invertedStr = "";
        for(int i = 0; i < notInvertedStr.length(); i++)
        {
            if(notInvertedStr.charAt(i) == '0')
            {
                invertedStr = invertedStr + '1';
            }
            else
            {
                invertedStr = invertedStr + '0';
            }
        }
        return invertedStr;
    }

    static long pow(long number, int level)
    {
        long returnNumber = 1;

        if(level == 0)
        {
            return 1;
        }

        if(level == 1)
        {
            return number;
        }

        for(int i = 0; i < level; i++)
        {
            returnNumber *= number;
        }

        return returnNumber;
    }

    static long returnDecimalNumber(String binNumber)
    {
        long decimalNumber = 0;
        binNumber = Main.returnRevesreString(binNumber);

        for(int i = 0; i < binNumber.length(); i++)
        {
            if(binNumber.charAt(i) == '1')
            {
                decimalNumber += pow(2, i);
            }
        }

        return decimalNumber;
    }

    static String returnRevesreString(String temp)
    {
        String reverseTemp = "";

        for(int i = 0; i < temp.length(); i++)
        {
            reverseTemp = temp.charAt(i) + reverseTemp;
        }

        return reverseTemp;
    }

    static String stringBinMakePositiveNumberNegetive(long decimalNumber, SizeType type)
    {
        String binNumber = Main.returnBinNumberString(decimalNumber, type); // переводим число в двоичную СС и делаем его строкой
        String reverseBinNumber = Main.invedtedBinaryString(binNumber);     // переворачиваем двоичную строку
        long reverseDecimalNumber = Main.returnDecimalNumber(reverseBinNumber); // делаем числом перевёрнутую двоичную строку
        reverseDecimalNumber++;                                                 // увеличиваем её на 1
        String resultBinNumber = Main.returnBinNumberString(reverseDecimalNumber, type); // переводим число в новую двоичную строку
        return resultBinNumber;
    }
}
