package Test12;

public class dog {
    //封装
    //2.发现属性 private(私有的）
    private String name="昵称1" ;//
    private int healthey ;//健康值
    private int love ;//与主人亲密度
    private String strain ;//品种
//name生成get方法
   public String getName(){
       //name赋值为"小狗”
       this.name="小狗";
       return name;

   }

    //健康值生成Set方法 ,值只能设置为1到100
    public void setHealthey(int healthey){
        if(healthey<0 || healthey>100){

            System.out.println("输入错误");
        }else {
            System.out.println("健康值："+healthey);
            this.healthey=healthey;
        }
    }




}
