package com.company;

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.StoneRepository;
import com.company.repositories.interfaces.IStoneRepository;

public class Main {

    public static void main(String[] args) {
	// start app
        IDB db = new PostgresDB();
        IStoneRepository repo = new StoneRepository(db);
        MyApp app = new MyApp(repo);
        app.start();
    }
}
