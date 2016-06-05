import org.bukkit.entity.Player;
import java.util.List;
import java.util.ArrayList;

public abstract class Particle {

	public String name;
	public List<String> description = new ArrayList<String>();
	protected List<Player> active = new ArrayList<Player>();

	public void activate(Player player); // Start particle effect
	public void deactivate(Player player); // End particle effect

	public boolean isActive(Player player) {
		return active.contains(player);
	}

}