public class Timer implements Runnable
{
  public int currentTime;
  public int maxTime;

  public Timer(int maxTime){
    this.maxTime = maxTime;
    currentTime = 0;
  }

  @Override public void run()
  {
    while(maxTime > currentTime){
      currentTime += 1;
      System.out.println(this);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    System.out.println("Timer terminated");
  }

  public int getCurrentTime(){
    return currentTime;
  }

  @Override public String toString()
  {
    String toReturn = "[";
    if(currentTime/60 < 10){
      toReturn += "0";
    }
    toReturn += currentTime/60 + ":";
    if(currentTime%60 < 10){
      toReturn += "0";
    }
    toReturn += currentTime%60 + "]";
    return toReturn;
  }
}
