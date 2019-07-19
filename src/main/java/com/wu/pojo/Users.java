package com.wu.pojo;


public class Users {
    private Integer id;

    /*@Override
    public boolean equals(Object obj) {
        Users user =(Users)obj;
        if(user.names==this.names){
            return true;
        }
        return false;
    }
*/
    private String names;

    private String pass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names == null ? null : names.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }
}