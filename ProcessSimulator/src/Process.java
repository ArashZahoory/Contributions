/*
 developed by Arash
 */

public class Process 
{
    private final String name;
    private float arrivalTime;		// between 0 and 99
    private float expectedTime;		// between 0.1 and 10
    private int priority;			// 1, 2, 3 or 4
    private int startTime;
    private int finishTime;
    private int startWaitingTime;
    private float timeRemaining;
    private boolean processStarted;
    private float timeToFinish;		// between 0.1 and 10. Is the time remaining to process completion (decremented by 1 every loop)
    private boolean started;
	private Process nextProcess;	// Next process in the list with same priority (used in HPF)

    /**
     * Constructor for objects of class Process
     *
     * @param arrivalTime
     * @param expectedTime
     * @param priority
     * @param name
     */
    public Process(float arrivalTime, float expectedTime, int priority, String name) 
	{
        this.arrivalTime = arrivalTime;
        this.expectedTime = expectedTime;
        this.priority = priority;
        this.name = "[" + name + "]";
        this.timeRemaining = expectedTime;
        this.processStarted = false;
    }

	/**
	 * This is the run method
	 *
	 */
	public void run()
	{
		System.out.println("process " + name + " running...");
	}

    /**
     * This returns value of waiting time
     *
     * @return value of waitingTime
     */
    public float getWaitingTime() 
	{
        float waitingTime = startTime - arrivalTime; 
        
        return waitingTime; 
    }

   /**
     * This returns value of waiting time
     *
     * @return value of startWaitingTime
     */
    public int getStartWaitingTime() 
	{
        return startWaitingTime; 
    }

    /**
     * This returns value of process started
     *
     * @return value of processStarted
     */
    public boolean getProcessStarted() 
	{
        return processStarted;
    }

    /**
     * This returns the value of the response time
     *
     * @return value of responseTime
     */
    public int getResponseTime() 
	{
        int responseTime = finishTime - startTime; 
        if (responseTime < 0)
		{
            //pritn something and break here
            System.out.println("ResponseTime is negative");
        }
        
        return responseTime;
    }

    /**
     * This returns the value of the response time
     *
	 * @return 
     */
    public float getTurnaroundTime() 
	{
        return (float) finishTime - arrivalTime;
    }

    /**
     * This returns the arrival time value
     *
     * @return value of arrivalTime
     */
    public float getArrivalTime() 
	{
         return arrivalTime;
    }

    /**
     * This returns the expected time value
     *
     * @return value of arrivalTime
     */
    public float getExpectedTime() 
	{
        return expectedTime;
    }

    /**
     * This returns the priority value
     *
     * @return value of priority
     */
    public int getPriority() 
	{
         return priority;
    }

    /**
     * This returns the priority value
     *
     * @return value of priority
     */
    public int getStartTime() 
	{
        return startTime;
    }

    /**
     * This returns the priority value
     *
     * @return value of priority
     */
    public int getFinishTime() 
	{
        return finishTime;
    }

    /**
     * This sets the start time value
     *
     *
     * @param startTime
     */
    public void setStartTime(int startTime) 
	{
        this.startTime = startTime;
        processStarted = true;
    }

   /**
     * This sets the startWaitingTime time value
     *
     * @param startWaitingTime
     */
    public void setStartWaitingTime(int startWaitingTime) 
	{
        this.startWaitingTime = startWaitingTime;
    }

	/**
     * This sets the finish time value
     *
     * @param finishTime
     */
    public void setFinishTime(int finishTime) 
	{
        this.finishTime = finishTime;
    }

    /**
     * This sets the arrival time value
     *
     * @param arrivalTime
     */
    public void setArrivalTime(float arrivalTime) 
	{
        this.arrivalTime = arrivalTime;
    }

    /**
     * This sets the expected time value
     *
     * @param expectedTime
     */
    public void setExpectedTime(float expectedTime) 
	{
        this.expectedTime = expectedTime;
    }

    /**
     * This sets the priority value
     *
     * @param priority
     */
    public void setPriority(int priority) 
	{
        this.priority = priority;
    }

    /**
     * This returns the name of the process, example: [1-a]
     *
     * @return
     */
    public String getName() 
	{
        return name;
    }
	
	/**
     * This returns the started boolean flag
     *
     * @return value of started
     */
    public boolean getStarted() 
	{
        return started;
    }
	
	/**
     * This sets the started flag
     *
	 * @param started
      */
    public void setStarted(boolean started) 
	{
        this.started = started;
    }

	/**
     * This returns the timeToFinish value
     *
     * @return value of timeToFinish
     */
    public float getTimeToFinish() 
	{
        return timeToFinish;
    }

	/**
     * This sets the timeToFinish value
     *
     * @param timeToFinish
     */
    public void setTimeToFinish(float timeToFinish) 
	{
        this.timeToFinish = timeToFinish;
    }

    /**
     * This returns the time remaining value of the process
     *
     * @return timeRemaining
     */
    public float getTimeRemaining() 
	{
        return timeRemaining;
    }

	/**
     * This sets the nextProcess value
     *
     * @param nextProcess
     */
    public void setNextProcess(Process nextProcess) 
	{
        this.nextProcess = nextProcess;
    }

    /**
     * This returns the next process in the list used by HPF
     *
     * @return nextProcess
     */
    public Process getNextProcess() 
	{
        return nextProcess;
    }

    /**
     * This returns the time remaining value of the process
     *
     */
    public void runProcess() 
	{
        timeRemaining -= 1;
    }

    /**
     * This returns a string representation of the Process object
     *
     * @return processString is a string made up of the values in the object
     */
    @Override
        public String toString() {
        String processString;
        processString = name + "\tArrival time is:  " + arrivalTime
                + ",\tExpected time is:  " + expectedTime
                + ",\tPriority is:  " + priority + "\n";

        return processString;
    }

}
