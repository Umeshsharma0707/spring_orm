package orm;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public void insertUser(User u) {
		this.ht.save(u);
	}

	public void updateUser(User u) {
		this.ht.update(u);
	}

	public List<User> getAllUsers() {
		return this.ht.loadAll(User.class);
	}

	public User getUserById(int id) {
		return this.ht.get(User.class, id);
	}

	@Transactional
	public void deleteUser(User u) {
		this.ht.delete(u);
		System.out.println(u + "data deleted");
	}

}
