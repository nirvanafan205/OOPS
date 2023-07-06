public interface Subject
{
    // takes an observer as an arguement
    // either it removes or registers an observer
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // notifies all observers when the subjects state has changed
    public void notifyObservers();
}