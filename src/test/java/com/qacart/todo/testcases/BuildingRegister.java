package com.qacart.todo.testcases;

import com.qacart.todo.api.RegisterAPI;


public class BuildingRegister {
    public static void main(String[] args) {

        RegisterAPI registerApi = new RegisterAPI();
        registerApi.register();
        System.out.println(registerApi.getAccessToken());;
        System.out.println(registerApi.getFirstName());;
        System.out.println(registerApi.getUserID());;
    }
}
