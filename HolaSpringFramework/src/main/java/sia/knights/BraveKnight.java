package sia.knights;
  
public class BraveKnight implements Knight {

  private Quest quest;

  //Constructor
  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
