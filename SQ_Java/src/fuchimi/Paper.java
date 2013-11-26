package fuchimi;

public class Paper extends Hand {

	@Override
	public java.lang.Boolean beats(Hand hand) {

		return hand.loseAgainst(this);

	}

	@Override
	public java.lang.Boolean loseAgainst(Rock rock) {

		return false;

	}

	@Override
	public java.lang.Boolean loseAgainst(Paper paper) {

		return null;

	}

	@Override
	public java.lang.Boolean loseAgainst(Scissors scissor) {

		return true;

	}
	
	@Override 
	public String toString() {
		return "Paper";
	}

}
