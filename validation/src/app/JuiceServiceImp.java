package app;

import com.JuiceRepository;

public class JuiceServiceImp implements JuiceService {

	private JuiceRepository juice;

	public JuiceServiceImp(JuiceRepository juice) {
		this.juice = juice;

	}

	public void validation(String name) {

		juice.store(name);

	}

}
