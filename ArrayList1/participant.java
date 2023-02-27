package ArrayList1;

public class participant {

	 private String pName;
	    private String pTalent;
	    private double pScore;

	    public participant(String pName, String pTalent, double pScore) {
	        this.pName = pName;
	        this.pTalent = pTalent;
	        this.pScore = pScore;
	    }

	   

	    public String getpName() {
			return pName;
		}



		public void setpName(String pName) {
			this.pName = pName;
		}



		public String getpTalent() {
			return pTalent;
		}



		public void setpTalent(String pTalent) {
			this.pTalent = pTalent;
		}



		public double getpScore() {
			return pScore;
		}



		public void setpScore(double pScore) {
			this.pScore = pScore;
		}



		@Override
	    public String toString() {
	        return "Participant Name: " + getpName() + ", Participant Talent: " + getpTalent() + ", Participant Score: " + getpScore();
	    }
	}
