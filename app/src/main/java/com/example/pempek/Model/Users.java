package com.example.pempek.Model;


    public class Users
    {
        private String InputUsername, InputEmail, InputPassword;
        public Users(){

        }

        public Users(String InputName,String InputUsername,String InputPassword){
            this.InputUsername = InputName;
            this.InputEmail = InputUsername;
            this.InputPassword = InputPassword;
        }

        public String getInputEmail() {
            return InputEmail;
        }

        public String getInputPassword() {
            return InputPassword;
        }

        public String getInputUsername() {
            return InputUsername;
        }
    }


