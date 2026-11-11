package esiot.sweeping_system;

public class MonitoringAgent extends Thread {

	SerialCommChannel channel;
	DashboardView view;
	LogView logger;
	
	static final String APP_PREFIX 	=  "sw:";
	static final String LOG_PREFIX 	=  "lo:";
	
	
	public MonitoringAgent(SerialCommChannel channel, DashboardView view, LogView log) throws Exception {
		this.view = view;
		this.logger = log;
		this.channel = channel;
	}
	
	public void run(){
		while (true){
			try {
				String msg = channel.receiveMsg();
				// logger.log("new msg: "+msg);				
				if (msg.startsWith(APP_PREFIX)){
					String cmd = msg.substring(APP_PREFIX.length()); 
					logger.log("new command: "+cmd);				

				} else if (msg.startsWith(LOG_PREFIX)){
					this.logger.log(msg.substring(LOG_PREFIX.length()));
				}
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}
	}

}
