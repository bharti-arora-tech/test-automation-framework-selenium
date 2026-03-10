package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
RetryAnalyzer automatically retries
failed tests up to defined limit.
*/

public class RetryAnalyzer implements IRetryAnalyzer {

int count=0;

int maxRetry=2;

public boolean retry(ITestResult result){

if(count<maxRetry){

count++;

return true;

}

return false;

}

}
