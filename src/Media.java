public abstract class Media implements MediaFunctions
{
    protected String name;
    protected float rating;
    protected int releaseYear;
    protected String genre;



    @Override
    public void play()
    {
//        System.out.println("You are watching " + Movie.getName());
    }

    @Override
    public void stop()
    {
//        System.out.println("stopped watching "+ Movie.getName());
        //User.getOptions();
    }

    @Override
    public void saveMovie()
    {

    }

    @Override
    public void saveSeries()
    {

    }

    @Override
    public void deleteFromSaved()
    {

    }
}
