package ma.project.dao;

import ma.project.entities.Identifiable;
import java.util.ArrayList;
import java.util.List;

public class ListeDao<T extends Identifiable> implements IDao<T> {
	private List<T> baseDeDonnees = new ArrayList<>();

	@Override
	public boolean create(T o) {
		if (o != null && getById(o.getId()) == null) {
			return baseDeDonnees.add(o);
		}
		return false;
	}

	@Override
	public boolean update(T o) {
		if (o != null) {
			for (int i = 0; i < baseDeDonnees.size(); i++) {
				if (baseDeDonnees.get(i).getId() == o.getId()) {
					baseDeDonnees.set(i, o);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(T o) {
		if (o != null) {
			return baseDeDonnees.remove(o);
		}
		return false;
	}

	@Override
	public T getById(int id) {
		for (int i = 0; i < baseDeDonnees.size(); i++) {
			if (baseDeDonnees.get(i).getId() == id) {
				return baseDeDonnees.get(i);
			}
		}
		return null;
	}

	@Override
	public List<T> getAll() {
		return baseDeDonnees;
	}
}