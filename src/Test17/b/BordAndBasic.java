package Test17.b;

public class BordAndBasic implements CPU {

    @Override
    public String getBord() {//CPU品牌
        return "华硕";
    }

    @Override
    public String getbasic() {//CPU频率
        return "3.50赫兹";
    }
}
