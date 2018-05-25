package command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light; // the specific light that this command is
							// going to control (the receiver)
	}

	@Override
	public void execute() {
		light.on();
	}
	
}
