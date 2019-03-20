package com.beibei.design.pattern.creational.singleton;

public enum EnumInstance {
    INSTANCE{
        protected void printText(){
            System.out.println("print text");
        }
    };

    protected abstract void printText();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}
