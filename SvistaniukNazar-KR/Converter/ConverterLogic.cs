using System;
using System.Globalization;

namespace Converter
{
    public static class ConverterLogic
    {
        public static string DecToHex(int decimalNumber)
        {
            return decimalNumber.ToString("X");
        }
        public static int HexToDec(string hexString)
        {
            return int.Parse(hexString, NumberStyles.HexNumber);
        }
        public static bool IsValidDecimal(string input, out int result)
        {
            return int.TryParse(input, out result);
        }
    }
}