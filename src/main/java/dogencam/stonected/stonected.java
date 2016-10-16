package dogencam.stonected;

import dogencam.stonected.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = reference.MOD_ID, name = reference.Name, version = reference.VERSION, acceptedMinecraftVersions = reference.ACCEPTED_VERSIONS)
public class stonected {

	@Instance
	public static stonected instance;
	
	@SidedProxy()
	public static CommonProxy proxy;
}
