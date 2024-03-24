package telrans.perfomance;

public abstract class PerfomanceTest {
	int nRuns;
	String displayName;
	protected PerfomanceTest(String dispalyName,int nRuns){
		this.displayName =dispalyName;
		this.nRuns =nRuns;
	}
	protected abstract void runTest() ;
	public void run() {
		long timestampStart = System.currentTimeMillis();
		for(int i=0;i<nRuns;i++) {
			runTest();
		}
		long timestampFinish = System.currentTimeMillis();
		long runningTime =timestampFinish-timestampStart;
		System.out.printf("%s;number of runs:%d;running time:%d\n",
				displayName,nRuns,runningTime);
	}
}
