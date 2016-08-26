package command.light;

public class Switch {
    
    private Command TurnOnLight;
    private Command TurnOffLight;
 
    public Switch(Command TurnOnLight, Command TurnOffLight){
         this.TurnOnLight = TurnOnLight;
         this.TurnOffLight = TurnOffLight;
    }
 
    public void TurnOnLight(){
         TurnOnLight.execute();
    }
 
    public void TurnOffLight(){
         TurnOffLight.execute();
    }
}
