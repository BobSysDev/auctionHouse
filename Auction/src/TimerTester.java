public class TimerTester
{
  public static void main(String[] args)
  {
    Timer timer = new Timer(90);
    Thread timerThread = new Thread(timer);

    timerThread.start();
  }
}
