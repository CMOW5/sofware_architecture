package javaTest2;

import java.util.ArrayList;

public class Housing implements IStructure {
	
	private ArrayList<IStructure> structures;
	private String address;
	
	public Housing (String address) {
		this.structures = new ArrayList<IStructure>();
		this.address = address;
	}
	
	@Override
	public String getName() {
		return this.address;
	}
	
	public int addStructure(IStructure component) {
		this.structures.add(component);
		return this.structures.size()-1;
	}
	
	public IStructure getStructure(int componentNumber) {
		return this.structures.get(componentNumber);
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("You are currently in " + this.getName() +
					". It has");
		for (IStructure struct : this.structures ) {
			System.out.println(struct.getName());
		}
		
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}
}
