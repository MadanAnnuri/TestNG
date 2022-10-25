package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListerners implements ITestListener {

    /*@Override
    public void onStart(ITestContext arg) {
        //ITestListener.super.onStart(context);
        System.out.println("Starts test Execution"+arg.getName());
    }*/

         public void  onStart(ITestContext arg){
             System.out.println("Starts test Execution from listenerrs :"+arg.getName());
            }
        public void  onFinish(ITestContext arg){
        System.out.println("Finish test Execution from listeners :"+arg.getName());
        }

      public void  onTestStart(ITestResult arg0){
        System.out.println("Starts Test..... "+arg0.getName());
       }

       public void  onTestSkipped(ITestResult arg0){
        System.out.println("skipped test.... "+arg0.getName());
       }
       public void  onTestSuccess(ITestResult arg0){
        System.out.println("Success test...."+arg0.getName());
       }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Failed test...."+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(arg);
    }
}
