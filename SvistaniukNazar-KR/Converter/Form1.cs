using System;
using System.Drawing;
using System.Windows.Forms;

namespace Converter
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            lblResult.Text = "Результат з'явиться тут";
            rbDecToHex.Checked = true; 
        }
        private void btnConvert_Click(object sender, EventArgs e)
        {
            string input = txtInput.Text.Trim();

            lblResult.ForeColor = Color.Black;

            if (string.IsNullOrEmpty(input))
            {
                ShowError("Будь ласка, введіть число.");
                return;
            }

            try
            {
                if (rbDecToHex.Checked)
                {
                    if (ConverterLogic.IsValidDecimal(input, out int decValue))
                    {
                        string hexResult = ConverterLogic.DecToHex(decValue);
                        lblResult.Text = $"HEX: {hexResult}";
                    }
                    else
                    {
                        ShowError("Помилка: введіть ціле число (0-9).");
                    }
                }
                else if (rbHexToDec.Checked)
                {
                    int decResult = ConverterLogic.HexToDec(input);
                    lblResult.Text = $"DEC: {decResult}";
                }
            }
            catch (FormatException)
            {
                ShowError("Помилка: невірний формат Hex (використовуйте 0-9, A-F).");
            }
            catch (OverflowException)
            {
                ShowError("Помилка: число занадто велике.");
            }
            catch (Exception ex)
            {
                ShowError($"Невідома помилка: {ex.Message}");
            }
        }

        private void ShowError(string message)
        {
            lblResult.ForeColor = Color.Red;
            lblResult.Text = message;
        }

        private void textBoxInput_TextChanged(object sender, EventArgs e)
        {

        }

        private void lblResult_Click(object sender, EventArgs e)
        {

        }
    }
}