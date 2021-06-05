package Test18;

public class Person {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    //抛出异常,调用着需处理
    public void setSex(String sex) throws Exception {
        if ("男".equals(sex) || "女".equals(sex)) {
            System.out.println("输入正确");
            this.sex = sex;
        }else{
            throw new Exception("性别只能是男和女");
        }
    }
}