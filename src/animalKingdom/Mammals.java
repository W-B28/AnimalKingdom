package animalKingdom;

public class Mammals extends Animals
{
    
    public Mammals(String name, int year)
    {
        super(name, year);
    
    }
    
    @Override
    public String move()
    {
       return "Walk"; 
    
    }
    
    @Override
        public String breathe()
    {
    
        return "Lungs";
    
    }
    
    @Override
    public String reproduce()
    {
        return "Live Births";
    
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getYear()
    {
        return year;
    }
    
    @Override
    public String toString()
    {
        return "Mammals: " + name + move() + " have " + breathe() + " endure " + reproduce() + " was named in the year " + year;
    }
    
}
