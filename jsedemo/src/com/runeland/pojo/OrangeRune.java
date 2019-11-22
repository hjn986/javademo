package com.runeland.pojo;

import com.runeland.Epigraph;

public class OrangeRune extends Epigraph {
    private  int adHurt;//物理攻击力
    private  int apHurt;//法术攻击力
    private  String adSpeed;//攻击速度
    private String hitrate;//暴击率
    private  String adpenetration;//物理穿透
    private  String  criteffect;//暴击效果
    private  String  maxlife;//最大生命
    private  String appenetration;//法术穿透
    private  String adbloodsucking;//物理吸血

  public int  getAdHurt(){
      return this.adHurt;
  }
  public void setAdHurt(int adHurt){
      this.adHurt=adHurt;
  }

    public int  getApHurt(){
        return this.apHurt;
    }
    public void setApHurt(int apHurt){
        this.apHurt=apHurt;
    }

    public String  getAdSpeed(){
        return this.adSpeed;
    }
    public void setAdHurt(String adHurt){
        this.adSpeed=adSpeed;
    }
}
