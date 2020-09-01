package animalKingdom;

abstract class Animals 
{
    private static int maxId = -1;
    protected int id;
    int year;
    String name;
    
    
    // base constructor
    public void Animal(String name, int year)
    {
       maxId++;
       this.id = maxId;
       this.name = name;
       this.year = year;
        
    }
    
    // methods 
    abstract String move();
    abstract String breathe();
    abstract String reproduce();



// getters for constructor objs

public int getId() 
{
    return id;
}

public String getName() 
{
    return name;
}

public int getYear() 
{
    return year;
}



String food()
{
return "Eating";
}

}


