package by.it.govor.bigBossProject;


import by.it.govor.bigBossProject.java.dao.DAO;
import by.it.govor.bigBossProject.java.table.Ad;
import by.it.govor.bigBossProject.java.table.Address;
import by.it.govor.bigBossProject.java.table.Role;
import by.it.govor.bigBossProject.java.table.User;

import java.sql.SQLException;
import java.util.List;

public class Runner {


        private static DAO dao;

    private static void showUser(String prefix) throws SQLException {
        List<User> users=dao.user.getRead("");
        System.out.println(prefix+"\n"+users);
    }

    private static void showAd(String prefix) throws SQLException {
        List<Ad> ads=dao.ad.getRead("");
        System.out.println(prefix+"\n"+ads);
    }

    private static void showAddress(String prefix) throws SQLException {
        List<Address> addresses=dao.address.getRead("");
        System.out.println(prefix+"\n"+addresses);
    }

    private static void showRole(String prefix) throws SQLException {
        List<Role> roles=dao.role.getRead("");
        System.out.println(prefix+"\n"+roles);
    }

    public static void main(String[] args) throws SQLException {



        //  User
    //---------------------------------------------------------------------------------------
       dao=DAO.getInstance();
        User user=new User("Lwer","pavr","nace","nic",113,1);

        showUser("1");
        dao.user.create(user);
        showUser("2");
        user.setLogin("bunt");

        dao.user.update(user);
        showUser("3");


    //--------------------------------------------------------------------------------------

       // Ad


        Ad ad=new Ad("Intel 8700","video","mat","ram","power_supply","hdd",1);
        showAd("1");

        dao.ad.create(ad);
        showAd("2");

        ad.setProcessor("ryz 1800");
        dao.ad.update(ad);
        showAd("3");

        dao.ad.delete(ad);
        showAd("4");

        System.out.println(dao.ad.getRead(""));



       // Address
    //-------------------------------------------------------------------------------------


        Address address=new Address("RB","Minsk",1);
        showAddress("1");

        dao.address.create(address);
        showAddress("2");



        address.setCountry("russia");
        dao.address.update(address);
        showAddress("3");

        dao.address.delete(address);
        showAddress("4");

        //Role
    //-----------------------------------------------------------------------------------------
        Role role=new Role("BigBoss");
        showRole("1");

        dao.role.create(role);
        showRole("2");



        role.setRole("miniBoss");
        dao.role.update(role);
        showRole("3");

        dao.role.delete(role);
        showRole("4");
    }

}
