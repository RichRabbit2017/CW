package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	@Id
	@GeneratedValue
	private long book_id;
	@NotNull
	private String name;
	@Column(name = "number")
	private int num;

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.format("com.sarv.test.Book [book_id=%d, name=%s, num=%d]",
				this.book_id, this.name, this.num);
	}

}
