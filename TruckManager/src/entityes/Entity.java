package entityes;

public abstract class Entity {
	
	private int Id;
	
	public Entity(int Id)
	{
		this.Id = Id;
	}
	
	public int getId()
	{
		return Id;
	}

}
