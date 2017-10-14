package com.theja.learn.java;

public abstract class Employee1 {
    private int Id;
    private String Firstname;
    private String Lastname;
    private String Department;

    public Integer getId(){
        return Id;
    }
    public void SetId(Integer Id){
        this.Id = Id;
    }
    public String getFirstname(){
        return Firstname;
    }
    public void setFirstname(String Firstname){
        this.Firstname=Firstname;
    }
    public String getLastname(){
        return Lastname;
    }
    public void setDepartment(){
        this.Department=Department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o == this)
            return true;

        if (getClass() != o.getClass())
        {
            return false;
        }

        Employee1 e = (Employee1) o;

        return (this.getId() == e.getId());

    }
    @Override
    public int hashCode()
    {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();
        return result;
    }
    }



