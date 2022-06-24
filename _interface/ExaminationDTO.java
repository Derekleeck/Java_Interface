package _interface;

public class ExaminationDTO {
	String name;
	String dap;
	char[] ox;
	int score;
	public static final String Jung = "11111"; //- 정답
	
	public ExaminationDTO(String name, String dap) {
		this.ox = new char[5];
		this.name = name;
		this.dap = dap;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDap(String dap) {
		this.dap = dap;
	}
	public void setOx(char[] ox) {
		this.ox = ox;
	}
	public int setScore(int score) {
		return score;
	}
	public String getName() {
		return name;
	}
	public String getDap() {
		return dap;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}

}
