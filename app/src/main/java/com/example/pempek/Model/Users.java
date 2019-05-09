package com.example.pempek.Model;


    public class Users
    {
        private String InputName, InputEmail, InputPassword;
        public Users(){

        }

        public Users(String InputName,String InputEmail,String InputPassword){
            this.InputName = InputName;
            this.InputEmail = InputEmail;
            this.InputPassword = InputPassword;
        }

        public String getInputEmail() {
            return InputEmail;
        }

        public String getInputPassword() {
            return InputPassword;
        }

        public String getInputName() {
            return InputName;
        }
    }


