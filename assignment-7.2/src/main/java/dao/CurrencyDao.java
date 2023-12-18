package dao;

import datasource.MariaDbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDao {
    public ArrayList<String> getAllAbbreviations() {
        Connection conn = MariaDbConnection.getConnection();

        ArrayList<String> currencyAbbreviations = new ArrayList<>();

        String sql = "SELECT abbreviation FROM currency";

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                currencyAbbreviations.add(rs.getString("abbreviation"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencyAbbreviations;
    }

    public double getConversionRate(String abbreviation) {
        Connection conn = MariaDbConnection.getConnection();

        String sql = "SELECT conversion_rate FROM currency WHERE abbreviation = ?";

        double rate = 0;

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, abbreviation);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                rate = rs.getDouble("conversion_rate");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rate;
    }
}
