class Project {
	private String name;
    private String description;
    private double initialcost;
    
 
	public Project() {}

	public Project(String name) {
    	this.setName(name);
    }

    public Project(String name, String description) {
    	this.setName(name);
    	this.setDescription(description);
    }
    
    public Project(String name, String description, double initialcost) {
    	this.setName(name);
    	this.setDescription(description);
    	this.setInitialcost(initialcost);
    }
    
    public String elevatorPitch() {
    	return (this.name + " : " + this.description + " : " + this.initialcost);
    }
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public double getInitialcost() {
		return initialcost;
	}

	public void setInitialcost(double initialcost) {
		this.initialcost = initialcost;
	}


}