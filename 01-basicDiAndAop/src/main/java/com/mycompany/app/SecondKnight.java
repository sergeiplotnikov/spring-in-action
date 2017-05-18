package com.mycompany.app;
  
public class SecondKnight implements Knight {

  private Quest quest;

  public SecondKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
