class shape{
    void draw()
    {
        System.out.println("Can't say shape type");
    }
}
class square extends shape
{ 
    @Override
    void draw()
    {  
        super.draw();
        System.out.println(" square shape");
    }
}
public class override
{
    public static void main(String[] args)
    {
        shape t=new shape();
        t.draw();
    }
}