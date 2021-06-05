package Test13;
//电脑类
public class computer {
    //发现属性（私有的）
    private String strian;//电脑品牌
    private int money;//价格
    private String systemic;//系统
    private int num;//数量

    //生成get方法
    public String getStrian(){
        this.strian="联想";
        return strian;
    }

    public int getMoney() {
        this.money=6999;
        return money;
    }
    //生成set方法

    public void setSystemic(String systemic) {
        System.out.println("电脑的系统为:"+systemic);
        this.systemic = systemic;
    }

    public void setNum(int num) {
        System.out.println("电脑的数量为:"+num);
        this.num = num;
    }

    }



