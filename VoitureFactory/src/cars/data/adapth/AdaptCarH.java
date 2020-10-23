package cars.data.adapth;
import cars.data.IVoiture;
import old.OldCard;

public class AdaptCarH extends OldCard implements IVoiture {

	@Override
	public void rouler() {
		this.drive(4);
	}

}
