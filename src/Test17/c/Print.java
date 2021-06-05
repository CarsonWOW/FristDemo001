package Test17.c;

import Test17.c.IntBox;
import Test17.c.Paper;

public class Print  {
    //进行组装,打印机由纸和墨盒组成
    //拿到纸张，和墨盒
    private IntBox intBox;
    private Paper paper;
    //打印功能
    public void Print(){
        System.out.println("使用"+intBox.getColor()+"墨盒,在"+paper.getSice()+"上打印");
    }

    public void setIntBox(IntBox intBox) {
        this.intBox = intBox;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
