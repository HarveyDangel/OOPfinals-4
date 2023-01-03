class Quiz{
	private double totalscore = 0.20;
	private double maxscore;
	private double grade;
	private int StudentID;
	public Quiz(double totalscore, double maxscore,int StudentID){	
		this.totalscore=totalscore; 
		this.maxscore=maxscore;
		this.StudentID=StudentID;
	}
	
	public int getID(){
		return StudentID;
	}
	public void setID(int StudentID){
		this.StudentID=StudentID;
	}

	public double calculategrade()
	{
		// TODO: Implement this method
		grade=(totalscore/maxscore)*100;
		return grade;
	}

}
