namespace Converter
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.txtInput = new System.Windows.Forms.TextBox();
            this.rbDecToHex = new System.Windows.Forms.RadioButton();
            this.rbHexToDec = new System.Windows.Forms.RadioButton();
            this.lblResult = new System.Windows.Forms.Label();
            this.buttonConvert = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtInput
            // 
            this.txtInput.Location = new System.Drawing.Point(77, 123);
            this.txtInput.Name = "txtInput";
            this.txtInput.Size = new System.Drawing.Size(202, 26);
            this.txtInput.TabIndex = 0;
            this.txtInput.TextChanged += new System.EventHandler(this.textBoxInput_TextChanged);
            // 
            // rbDecToHex
            // 
            this.rbDecToHex.AutoSize = true;
            this.rbDecToHex.Location = new System.Drawing.Point(77, 188);
            this.rbDecToHex.Name = "rbDecToHex";
            this.rbDecToHex.Size = new System.Drawing.Size(173, 24);
            this.rbDecToHex.TabIndex = 1;
            this.rbDecToHex.TabStop = true;
            this.rbDecToHex.Text = "В Шістнадцяткове";
            this.rbDecToHex.UseVisualStyleBackColor = true;
            // 
            // rbHexToDec
            // 
            this.rbHexToDec.AutoSize = true;
            this.rbHexToDec.Location = new System.Drawing.Point(256, 188);
            this.rbHexToDec.Name = "rbHexToDec";
            this.rbHexToDec.Size = new System.Drawing.Size(189, 24);
            this.rbHexToDec.TabIndex = 2;
            this.rbHexToDec.TabStop = true;
            this.rbHexToDec.Text = "З Шістнадцяткового";
            this.rbHexToDec.UseVisualStyleBackColor = true;
            // 
            // lblResult
            // 
            this.lblResult.AutoSize = true;
            this.lblResult.Location = new System.Drawing.Point(309, 261);
            this.lblResult.Name = "lblResult";
            this.lblResult.Size = new System.Drawing.Size(51, 20);
            this.lblResult.TabIndex = 3;
            this.lblResult.Text = "label1";
            this.lblResult.Click += new System.EventHandler(this.lblResult_Click);
            // 
            // buttonConvert
            // 
            this.buttonConvert.Location = new System.Drawing.Point(77, 242);
            this.buttonConvert.Name = "buttonConvert";
            this.buttonConvert.Size = new System.Drawing.Size(193, 59);
            this.buttonConvert.TabIndex = 4;
            this.buttonConvert.Text = "Отримати результат";
            this.buttonConvert.UseVisualStyleBackColor = true;
            this.buttonConvert.Click += new System.EventHandler(this.btnConvert_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(514, 371);
            this.Controls.Add(this.buttonConvert);
            this.Controls.Add(this.lblResult);
            this.Controls.Add(this.rbHexToDec);
            this.Controls.Add(this.rbDecToHex);
            this.Controls.Add(this.txtInput);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtInput;
        private System.Windows.Forms.RadioButton rbDecToHex;
        private System.Windows.Forms.RadioButton rbHexToDec;
        private System.Windows.Forms.Label lblResult;
        private System.Windows.Forms.Button buttonConvert;
    }
}

