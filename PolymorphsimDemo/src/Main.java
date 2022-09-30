public class Main {
	public static void main(String[] args) {
		/*BaseLogger[] baseLoggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger:baseLoggers) {
			logger.log("log mesaji");
			
		}*/
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();
	}

}
