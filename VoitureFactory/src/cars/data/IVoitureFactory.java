package cars.data;

// equivalent à Supplier<IVoiture>
public interface IVoitureFactory {
	IVoiture newVoiture();
}
