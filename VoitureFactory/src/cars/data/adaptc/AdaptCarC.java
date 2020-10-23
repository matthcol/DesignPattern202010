package cars.data.adaptc;

import cars.data.IVoiture;
import old.OldCard;

public class AdaptCarC implements IVoiture {
	private OldCard oldCard;

	public AdaptCarC() {
		super();
		this.oldCard = new OldCard();
	}

	@Override
	public void rouler() {
		this.oldCard.drive(5);
	}
	
}
