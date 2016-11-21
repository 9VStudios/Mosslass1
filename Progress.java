
public class Progress {

	
	//Could make these static and then just create a new progress instance where we do the saving rather than passing?
	private Inventory inventory;
	private Scene scene;
	
	
	public Progress(Player player, Scene scene) {
		inventory = player.getInventory();
		this.scene = scene;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public Scene getScene() {
		return scene;
	}
	

	
	
}
