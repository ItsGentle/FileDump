import org.bukkit.entity.Player;
import java.util.List;
import java.util.ArrayList;

public abstract class Gadget {

	public String name;
	public List<String> description = new ArrayList<String>();
	public double cooldown; // seconds
	protected List<Player> active = new ArrayList<Player>();

	public void activate(Player player); // Activate the gadget
	public void deactivate(Player player); // Force stop the gadget

	public boolean isActive(Player player) {
		return active.contains(player);
	}

}