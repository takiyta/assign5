package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.precious;
import com.company.entities.semi_precious;
import com.company.repositories.interfaces.IStoneRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StoneRepository implements IStoneRepository {
    private final IDB db;

    public StoneRepository(IDB db) {
        this.db = db;
    }


    @Override
    public List<precious> getAllPrecious() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT name,price,carat FROM precious";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<precious> precious = new ArrayList<>();
            while (rs.next()) {
                precious Precious = new precious(rs.getString("name"),
                        rs.getInt("price"),
                        rs.getInt("carat"));


                precious.add(Precious);
            }

            return precious;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public List<semi_precious> getAllSemi_precious() {
        return null;
    }

    @Override
    public Boolean SelectStoneForNecklace(semi_precious necklace, precious necklace1) {
        //there we need take price and cost of stone (SELECT price,cost FROM stone where name or id=?)
        //then sum this values and then send it
        return null;
    }


}
