package fuchimi;

public class Scissors extends Hand {

	@Override
	public java.lang.Boolean beats(Hand hand) {

		return hand.loseAgainst(this);

	}

	@Override
	public java.lang.Boolean loseAgainst(Rock rock) {

		return true;

	}

	@Override
	public java.lang.Boolean loseAgainst(Paper paper) {

		return false;

	}

	@Override
	public java.lang.Boolean loseAgainst(Scissors scissor) {

		return null;

	}
	
	@Override 
	public String toString() {
		return "Scissors";
	}

}
